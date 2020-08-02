package OOP_animal;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Барсик","рыжий", 5);
        cat.info();
        cat.run(145);
        cat.swim(5);
        cat.jump(1.2);
        System.out.println();

        Cat cat1 = new Cat("Боря","чёрный", 2);
        cat1.info();
        cat1.run(426);
        cat1.swim(13);
        cat1.jump(5.7);
        System.out.println();

        Dog dog = new Dog("Бобик", "серый", 12);
        dog.info();
        dog.run(1000);
        dog.swim(4);
        dog.jump(71.8);
        System.out.println();

        Dog dog1 = new Dog("Шарик", "белый", 4);
        dog1.info();
        dog1.run(641);
        dog1.swim(28);
        dog1.jump(0.2);
        System.out.println();


    }
}
