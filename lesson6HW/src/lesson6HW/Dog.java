package lesson6HW;

import java.util.Scanner;

public class Dog extends Animal {


    Scanner scanner = new Scanner(System.in);

    @Override
    public void run() {
        System.out.println();
        System.out.println("Введите значение, сколько метров может пробежать собака ");

        int dogRun = scanner.nextInt();

        if (dogRun > 500) {
            System.out.println("Собака не может столько пробежать");

        } else {
            System.out.println("Собака может столько пробежать");
        }

    }


    @Override
    public void swim() {
        System.out.println();
        System.out.println("Введите значение, сколько метров может проплыть собака ");

        int dogSwim = scanner.nextInt();

        if (dogSwim > 10) {
            System.out.println("Собака не может столько проплыть");

        } else {
            System.out.println("Собака может столько проплыть");
        }
    }

    @Override
    public void jump() {
        System.out.println();
        System.out.println("Введите значение, на сколько метров может прыгнуть cобака ");

        int dogJump = scanner.nextInt();

        if (dogJump > 0.5) {
            System.out.println("Собака не может на столько прыгнуть");

        } else {
            System.out.println("Собака может на столько прыгнуть");
        }
    }
}

