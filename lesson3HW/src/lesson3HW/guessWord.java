package lesson3HW;


import java.util.Arrays;
import java.util.Scanner;

public class guessWord {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String text = getString();
        turnGame(scanner, text);
    }


    StringBuilder symbols;
    String userWord;

    private static String getString() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};


        int randomNumber = (int) (Math.random() * words.length);

        String text = words[randomNumber];
        //System.out.println(text); Проверка

        System.out.println(Arrays.toString(words));
        return text;
    }

    public static void turnGame(Scanner scanner, String text) {
        StringBuilder symbols;
        String userWord;
        do {
            System.out.println(" Угадайте слово из списка");
            userWord = scanner.next();

            if (userWord.equals(text)) {
                System.out.println("Вы угадали!");
            } else {
                symbols = new StringBuilder("##################");

                int myLength;
                if (text.length() < userWord.length()) {
                    myLength = text.length();
                } else {
                    myLength = userWord.length();
                }
                for (int i = 0; i < myLength; i++) {
                    if (userWord.charAt(i) == text.charAt(i)) {
                        symbols.setCharAt(i, userWord.charAt(i));
                    }
                }
                System.out.println(symbols);
                System.out.print("Попробуйте угадать еще раз.");
            }
        } while (!userWord.equals(text));

    }

}



