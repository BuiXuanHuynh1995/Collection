package wordsMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordsMap {
    public static void main(String[] args) {
        String string = "abc def,ght. Lhhut abc, gh, gh gh!";
        java.util.Map<String, Integer> hashMap = new HashMap<String, Integer>();
        String[] words = string.split("[.!?,(){};:' ]");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 1) {
                if (hashMap.get(words[i]) != null) {
                    int value = hashMap.get(words[i]);
                    hashMap.put(words[i], value+1);
                } else
                    hashMap.put(words[i], 1);
            }
        }
        System.out.print(hashMap);
    }
}
