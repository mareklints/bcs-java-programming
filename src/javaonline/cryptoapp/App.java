package javaonline.cryptoapp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("resources/alfabeet.txt"));
        // "A, Ü", "B, Ö"

        // VÕTI ON MATI ALL
        // V --> F
        // Õ --> D
        Map<String, String> converterMap = new HashMap<>();
        for (String line : lines) {
            String[] lineParts = line.split(", ");
            converterMap.put(lineParts[0], lineParts[1]);
        }

        // VÕTI ON MATI ALL
        String message = args[0];
        String[] messageChars = message.split("");
        String encryptedMessage = "";

        for (String messageChar : messageChars) {
            encryptedMessage = encryptedMessage + converterMap.get(messageChar.toUpperCase()); // "v" --> "V"
        }

        System.out.println("Krüpteerimist vajav sõnum: " + message);
        System.out.println("Krüpteeritud sõnum: " + encryptedMessage);
    }
}
