package discord4j.events;


import com.fasterxml.jackson.core.JsonFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;

    public class GoogleTasksIntegration {
//        private static final String APPLICATION_NAME = "Your Application Name";
//        private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
//        private static final String CREDENTIALS_FILE_PATH = "/credentials.json";
//        private static final String TOKENS_DIRECTORY_PATH = "tokens";
//
//        public static void main(String[] args) throws Exception {
//            HttpTransport httpTransport = GoogleNetHttpTransport.newTrustedTransport();
//            Credential credential = authorize(httpTransport);
//
//            Tasks service = new Tasks.Builder(httpTransport, JSON_FACTORY, credential)
//                    .setApplicationName(APPLICATION_NAME)
//                    .build();
//
//            // Create a task
//            String taskListId = "YOUR_TASK_LIST_ID";
//            Task task = new Task();
//            task.setTitle("New Task");
//            Task createdTask = service.tasks().insert(taskListId, task).execute();
//            System.out.println("Task created: " + createdTask.getTitle());
//        }
//
//        private static Credential authorize(HttpTransport httpTransport) throws IOException {
//            // Load client secrets
//            InputStream in = GoogleTasksIntegration.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
//            GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));
//
//            // Set up authorization code flow
//            GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
//                    httpTransport, JSON_FACTORY, clientSecrets, Collections.singletonList(TasksScopes.TASKS))
//                    .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
//                    .setAccessType("offline")
//                    .build();
//
//            // Authorize
//            Credential credential = new AuthorizationCodeInstalledApp(flow, new LocalServerReceiver())
//                    .authorize("user");
//
//            return credential;
//        }
    }
