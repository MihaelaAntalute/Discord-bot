package discord4j.events;

import discord4j.core.object.entity.Message;
import reactor.core.publisher.Mono;

public abstract class MessageListener {

        public Mono<Void> processCommand(Message eventMessage) {
        return Mono.just(eventMessage)
                .filter(message -> message.getAuthor().map(user -> !user.isBot()).orElse(false))
                .filter(message -> message.getContent().equalsIgnoreCase("!todo"))
                .flatMap(Message::getChannel)
                .flatMap(channel -> channel.createMessage("Things to do today:\n" +
                        " - write a bot\n" +
                        " - eat lunch\n" +
                        " - play a game"))
                .onErrorResume(e -> {
                    System.out.println("Error processing command: " + e.getMessage());
                    return Mono.empty(); // or an appropriate fallback
                })
                .then(); // Complete the reactive chain


        }
    private String author = "UNKNOWN";

//    public Mono<Void> processCommand(Message eventMessage) {
//        return Mono.just(eventMessage)
//                .filter(message -> {
//                    final Boolean isNotBot = message.getAuthor()
//                            .map(user -> {
//                                if (!user.isBot()) {
//                                    author = user.getUsername();
//                                }
//                                return !user.isBot();
//                            })
//                            .orElse(false);
//                    return isNotBot;
//                })
//                .flatMap(message -> switch (message.getContent()) {
//                    case "!todo" -> processTodoCommand(message);
//                    case "hello" -> processHelloCommand(message);
//                    default -> processDefaultCommand(message);
//                });
//    }

    private Mono<Void> processTodoCommand(Message eventMessage) {
        return eventMessage.getChannel()
                .flatMap(channel -> channel.createMessage("Things to do today:\n - write a bot\n - read a book\n - algorithms"))
                .then();
    }

    private Mono<Void> processHelloCommand(Message eventMessage) {
        return eventMessage.getChannel()
                .flatMap(channel -> channel.createMessage(String.format("你好 '%s'", author)))
                .then();
    }

    private Mono<Void> processDefaultCommand(Message eventMessage) {
        return eventMessage.getChannel()
                .flatMap(channel -> channel.createMessage("I can not give you more details. I am in the process of development!"))
                .then();
    }

    /*private String getTodayDate() {
        // Get the current date
        LocalDate today = LocalDate.now();
        // Format the date as a string in the format "YYYY-MM-DD"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return today.format(formatter);
    }*/
    //block()


}
