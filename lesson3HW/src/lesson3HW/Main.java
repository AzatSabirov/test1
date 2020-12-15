package lesson3HW;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            turnGame();
            chooseAction();

        }
    }
        public static void turnGame () {


            int number = getNumber();

            guess(number);
        }


        private static int getNumber () {
            int number = (int) (Math.random() * 10);
            System.out.println("Угадайте число от 0 до 9. У вас 3 попытки");

            return number;
        }

        public static void guess ( int number){
            int count = 3;
            for (int i = 0; i < 3; i++) {
                Scanner scanner = new Scanner(System.in);
                int userNumber = scanner.nextInt();
                if (number == userNumber) {
                    System.out.println("Вы угадали! Желаете повторить игру? y / n");
                    chooseAction ();

                } else if (number > userNumber) {
                    count--;
                    System.out.println("Загаданное число больше. У вас осталось " + count + " попытки");
                } else {
                    count--;
                    System.out.println("Загаданное число меньше. У вас осталось " + count + " попытки");
                }
                if (count == 0) {
                    System.out.println("Вы проиграли. Желаете повторить игру? y / n");
                    chooseAction ();
                }
            }
        }

        private static void chooseAction () {
            switch (scanner.next()) {
                case "y":
                    turnGame();
                case "n":
                    System.exit(0);
            }
        }

}

