package dictionary;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DictionaryTest {
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Find word.");
        System.out.println("2. Delete word");
        System.out.println("3. Show dictionary");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary =new Dictionary();
        dictionary.inputList();
        showMenu();
        while (true) {
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        dictionary.findWord(dictionary.inputWord());
                        break;
                    case 2:
                        dictionary.removeWord(dictionary.inputWord());
                        break;
                    case 3:
                        dictionary.displayDictionary();
                        break;
                    case 4:
                        dictionary.editWord(dictionary.inputWord());
                        break;
                    case 0:
                        System.exit(0);
                        break;
                }
            }catch (InputMismatchException e) {
                System.out.println("Need enter number");
            }
            showMenu();
        }
    }
}
