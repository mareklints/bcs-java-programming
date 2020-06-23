package javaonline.cryptoapp;

import java.util.List;
import java.util.Map;

public abstract class Cryptor {
    private Map<String, String> conversionMap;

    public Cryptor(List<String> alphabetLines) {
        this.conversionMap = createConversionMap(alphabetLines);
    }

    protected abstract Map<String, String> createConversionMap(List<String> alphabetLines);

    public String convert(String message) {
        String[] messageChars = message.split("");
        String convertedMessage = "";

        for (String messageChar : messageChars) {
            convertedMessage = convertedMessage + this.conversionMap.get(messageChar.toUpperCase()); // "v" --> "V"
        }

        return convertedMessage;
    }
}
