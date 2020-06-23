package javaonline.cryptoapp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Encryptor extends Cryptor {

    public Encryptor(List<String> alphabetLines) {
        super(alphabetLines);
    }

    @Override
    protected Map<String, String> createConversionMap(List<String> alphabetLines) {
        // ["A, Ü", "B, Ö"] ---> "A" -> "Ü", "B" -> "Ö"
        Map<String, String> map = new HashMap<>();
        for (String line : alphabetLines) {
            String[] lineParts = line.split(", ");
            map.put(lineParts[0], lineParts[1]);
        }
        return map;
    }
}
