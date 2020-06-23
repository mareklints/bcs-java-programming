package javaonline.cryptoapp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("resources/alfabeet.txt"));

        String message = args[0]; // "VÕTI ON MATI ALL"
        System.out.println("Algne sõnum: " + message);
        Encryptor encryptor = new Encryptor(lines);

        String encryptedMessage = encryptor.convert(message);
        System.out.println("Krüpteeritud sõnum: " + encryptedMessage);

        Decryptor decryptor = new Decryptor(lines);
        String decryptedMessage = decryptor.convert(encryptedMessage);
        System.out.println("Dekrüpteeritud sõnum: " + decryptedMessage);
    }
}
