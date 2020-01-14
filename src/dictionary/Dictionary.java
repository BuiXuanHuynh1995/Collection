package dictionary;

import java.util.*;

public class Dictionary {
    Scanner input = new Scanner(System.in);
    Map<String,String> dictionary = new HashMap<String,String>();
    String english,vietnam;

    public void inputList(){
        dictionary.put("one","mot");
        dictionary.put("two","hai");
        dictionary.put("three","ba");
        dictionary.put("four","bon");
    }

    public String inputWord() {
        System.out.println("Input word: ");
        while (true) {
                String word = input.nextLine();
                if (word.trim().equals("")){
                    System.out.println("invalid! Input word again: ");
                    continue;
                }
                return word;
        }
    }

   public void editWord(String word){
        if (dictionary.containsKey(word)) {
            System.out.println("Input new value: ");
            String newValue = input.nextLine();
            dictionary.replace(word, newValue);
            System.out.println("Edit success");
        }else {
            System.out.println("Not Found");
        }
   }

    public void findWord(String word) {
        if (dictionary.containsKey(word)) {
            System.out.println(dictionary.get(word));
        }else {
            System.out.println("Not Found");
        }
    }

    public void removeWord(String word){
        if (dictionary.containsKey(word)) {
            System.out.println(dictionary.remove(word));
        }else {
            System.out.println("Not found word to delete");
        }
    }


    public void displayDictionary() {
        for (Map.Entry pairEntry:dictionary.entrySet()) {
            System.out.println(pairEntry.getKey()+ " : "+pairEntry.getValue());
        }
    }
}
