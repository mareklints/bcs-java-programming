package javaonline.cryptoapp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DecryptorApp {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("resources/alfabeet.txt"));

        // "FDHŽ.PQ.RÜHŽ.ÜSS" --> "VÕTI ON MATI ALL"
        Map<String, String> decryptorMap = new HashMap<>();
        for (String line : lines) {
            String[] lineParts = line.split(", "); // "Z, J" --> { "Z", "J" }
            decryptorMap.put(lineParts[1], lineParts[0]);
        }

        String encryptedMessage = args[0];
        String[] messageChars = encryptedMessage.split("");
        String decryptedMessage = "";

        for (String messageChar : messageChars) {
            decryptedMessage = decryptedMessage + decryptorMap.get(messageChar.toUpperCase());
        }

        System.out.println("Krüpteeritud sõnum: " + encryptedMessage);
        System.out.println("Dekrüpteeritud sõnum: " + decryptedMessage);
    }
}
