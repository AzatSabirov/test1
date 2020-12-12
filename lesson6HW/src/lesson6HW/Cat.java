package lesson6HW;

import java.util.Scanner;

public class Cat extends Animal {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {

        System.out.println("Введите значение, сколько метров может пробежать кот ");

        int catRun = scanner.nextInt();

        if (catRun > 200) {
            System.out.println("Кот не может столько пробежать");

        } else {
            System.out.println("Кот может столько пробежать");
        }

    }


    @Override
    public void swim() {
        System.out.println();
        System.out.println("Как думаете, кот умеет плавать? да/нет ");

        String catSwim = scanner.next();

        if (catSwim.equals("да")) {
            System.out.println("Кот не умеет плавать");

        } else if (catSwim.equals("нет")){
            System.out.println("Вы правы");
        }

    }

    @Override
    public void jump() {
        System.out.println();
        System.out.println("Введите значение, на сколько метров может прыгнуть кот ");

        int catJump = scanner.nextInt();

        if (catJump > 2) {
            System.out.println("Кот не может на столько прыгнуть");

        } else {
            System.out.println("Кот может на столько прыгнуть");
        }
    }
}
