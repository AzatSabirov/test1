package les6_HW;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Cat");
        Dog dog = new Dog("Dog");

	Animal[] animals = {cat, dog};

        for (Animal animal : animals) {
            if(animal instanceof Cat) {
                cat.running(100, 200);
                cat.swimming(10, 0);
                cat.jumping(1, 2);
            }
            if(animal instanceof Dog) {
                dog.running(600, 500);
                dog.swimming(6, 10);
                dog.jumping(1.5, 0.5);
            }

        }
    }
}
