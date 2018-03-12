import Processors.KeyProcessor;
import Processors.KeyProcessorType;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        String message = "OMG|12|27|42|28|17|24";
        if(message.length()<4) {
            System.out.println(message + " : is too short");

            String[] messageTable = message.substring(4).split("\\|");
            ArrayList<String> messageList = new ArrayList<String>(Arrays.asList(messageTable));

            try {
                KeyProcessor keyProcessor = KeyProcessorType.valueOf(message.substring(0, 3)).createProcessor();
                keyProcessor.processStuff(messageList);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(messageList);
        }
    }
}
