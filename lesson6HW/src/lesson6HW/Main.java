package lesson6HW;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        Animal[] animals = {cat, dog};

        for (Animal animal : animals) {
            if(animal instanceof Cat) {
                ((Cat) animal).run();
                ((Cat) animal).swim();
                ((Cat) animal).jump();
            }
            if(animal instanceof Dog) {
                ((Dog) animal).run();
                ((Dog) animal).swim();
                ((Dog) animal).jump();
            }
        }


    }
}
