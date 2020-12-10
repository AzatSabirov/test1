package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static final int SIZE = 3;
    static final char EMPTY_DOT = '-';
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = 'O';
    static final int WIN_NUMBER = 3;

    static final String HEADER_FIRST_EMPTY = "*";
    static final String EMPTY = " ";
    static char[][] map = new char[SIZE][SIZE];
    static final Scanner in = new Scanner(System.in);
    static final Random random = new Random();

    public static void main(String[] args) {

        turnGame();
        playGame();
    }

    private static void turnGame() {
        initMap();

        printMap();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY_DOT;
            }
        }
    }

    private static void printMap() {
        printMapHeader();

        printMapRow();
    }


    private static void printMapHeader() {
        System.out.print(HEADER_FIRST_EMPTY + EMPTY);

        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + EMPTY);
    }

    private static void printMapRow() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + EMPTY);

            }
            System.out.println();
        }
    }


    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            checkEnd(DOT_HUMAN);

            aiTurn();
            printMap();
            checkEnd(DOT_AI);
        }
    }

    private static void humanTurn() {
        int rowNumber = 0;
        int columnNumber = 0;

        System.out.println("\nХод человека. Введите номер строки и столбца в диапазоне от 1 до " + SIZE);

        do {
            System.out.print("Строка = ");
            if (in.hasNextInt()) {
                rowNumber = in.nextInt();
            } else {
                System.out.println("Введите число в диапазоне от 1 до " + SIZE + "\n");
                in.next();
                continue;
            }
            System.out.print("Столбец = ");
            if (in.hasNextInt()) {
                columnNumber = in.nextInt();
            } else {
                System.out.println("Введите число в диапазоне от 1 до" + SIZE + "\n");
                in.next();
                continue;
            }
        } while (!isCellValid(rowNumber, columnNumber, true));
        map[rowNumber - 1][columnNumber - 1] = DOT_HUMAN;

    }

    private static boolean isCellValid(int rowNumber, int columnNumber, boolean b) {

        if (rowNumber < 1 || rowNumber > SIZE || columnNumber < 1 || columnNumber > SIZE) {
            System.out.println("\nЗначение вне диапазона");
            return false;
        }
        if (map[rowNumber - 1][columnNumber - 1] != EMPTY_DOT) {

            System.out.println("\nВы выбрали занятую ячейку");

            return false;
        }
        return true;
    }

    private static void checkEnd(char symbol) {
        boolean isEnd = false;

        if (checkWin(symbol)) {
            String winMessage;

            if (symbol == DOT_HUMAN) {
                winMessage = "Мы победили!";
            } else {
                winMessage = "Компьютер победил.";
            }

            isEnd = true;
            System.out.println(winMessage);
        }

        if (!isEnd && isMapFull()) {
            System.out.println("Ничья!");
            isEnd = true;
        }

        if (isEnd) {
            System.exit(0);
        }

    }

    private static boolean checkWin(char symbol) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (Line(i, j, 0, 1, symbol)) return true;
                if (Line(i, j, 1, 1, symbol)) return true;
                if (Line(i, j, 1, 0, symbol)) return true;
                if (Line(i, j, -1, 1, symbol)) return true;
            }
        }
        return false;
    }

    private static boolean Line(int rowNumber, int columnNumber, int rowDiag, int columnDiag, char symbol) {
        int X = rowNumber + (WIN_NUMBER - 1) * rowDiag;
        int Y = columnNumber + (WIN_NUMBER - 1) * columnDiag;
        if (X < 0 || Y < 0 || X > SIZE - 1 || Y > SIZE - 1)
            return false;
        for (int i = 0; i < WIN_NUMBER; i++) {
            int lineX = rowNumber + i * rowDiag;
            int lineY = columnNumber + i * columnDiag;
            if (map[lineX][lineY] != symbol)
                return false;
        }
        return  true;
    }

    private static boolean isMapFull() {
        for (char[] chars : map) {
            for (char symbol : chars) {
                if (symbol == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }


    private static void aiTurn() {
        int rowNumber;
        int columnNumber;
        System.out.println("\nХод компютера\n");
        do {
            rowNumber = random.nextInt(SIZE) + 1;
            columnNumber = random.nextInt(SIZE) + 1;
        } while (!isCellValid(rowNumber, columnNumber, true));

        map[rowNumber - 1][columnNumber - 1] = DOT_AI;
    }

}

