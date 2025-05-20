package com.example.flyweight.WordProcessor;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    public static Map<String, ILetter> letterCache = new HashMap<>();

    public static ILetter createLetter(String letter, String font, int size) {
        String key = letter + font + size;
        if (!letterCache.containsKey(key)) {
            System.out.println("Creating new letter object for: " + key);
            // Create a new letter object and store it in the cache
            letterCache.put(key, new DocumentLetter(letter, font, size));
        } else {
            System.out.println("Reusing existing letter object for: " + key);
        }
        return letterCache.get(key);
    }
}
