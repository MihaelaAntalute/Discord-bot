package discord4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Discord4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(Discord4jApplication.class, args);
	}

}
