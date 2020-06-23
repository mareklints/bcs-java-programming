package javaonline.cryptoapp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Decryptor extends Cryptor {

    public Decryptor(List<String> alphabetLines) {
        super(alphabetLines);
    }

    @Override
    protected Map<String, String> createConversionMap(List<String> alphabetLines) {
        Map<String, String> map = new HashMap<>();

        for (String line : alphabetLines) {
            String[] lineParts = line.split(", ");
            map.put(lineParts[1], lineParts[0]);
        }

        return map;
    }
}
