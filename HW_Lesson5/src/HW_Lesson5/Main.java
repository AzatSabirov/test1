package HW_Lesson5;


public class Main {

    public static void main(String[] args) {


        Employers[] worker = new Employers[5];
        worker[0] = new Employers("Ivanov Ivan", "engineer", "ivan@mail.ru", "8956558484", 30000, 35);
        worker[1] = new Employers("Petrov Petr", "engineer", "petr@mail.ru", "8967567464", 25000, 28);
        worker[2] = new Employers("Mihailov Mihail", "electrician", "misha@mail.ru", "8967567655", 19000, 60);
        worker[3] = new Employers("Grigoriev Alexey", "plumber", "alexey@mail.ru", "8967566554", 18000, 20);
        worker[4] = new Employers("Klimov Vladislav", "cleaner", "vlad@mail.ru", "89696674634", 15000, 44);

        worker[0].printInfo();
        worker[1].printInfo();
        worker[2].printInfo();
        worker[3].printInfo();
        worker[4].printInfo();

        System.out.println();
        System.out.println("Сотрудники старше 40 лет: " );

        for (Employers employers : worker) {
            if(employers.getAge() > 40)
                employers.printEmployers40();
        }


    }



}
