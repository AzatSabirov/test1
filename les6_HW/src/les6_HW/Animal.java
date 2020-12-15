package les6_HW;

import java.util.Scanner;

public abstract class Animal {


    protected String name;


    public Animal(String name) {
        this.name = name;
    }


    public void running(double animalRun, double maxRun) {

        if (animalRun < 0 || animalRun > maxRun) {
            System.out.println(name + " can't run that much. (" + animalRun + " m)");

        } else {
            System.out.println(name + " can run that much. (" + animalRun + " m)");
        }
    }

    public void swimming(double animalSwim, double maxSwim) {

        if (animalSwim < 0 || animalSwim > maxSwim) {
            System.out.println(name + " can't swim that much. (" + animalSwim + " m)");

        } else {
            System.out.println(name + " can swim that much. (" + animalSwim + " m)");
        }
    }

    public void jumping(double animalJump, double maxJump) {

        if (animalJump < 0 || animalJump > maxJump) {
            System.out.println(name + " can't swim that much. (" + animalJump + " m)");

        } else {
            System.out.println(name + " can swim that much. (" + animalJump + " m)");
        }
    }

}

