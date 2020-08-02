package OOP_animal;

import java.util.Random;

public abstract class Animal {
    Random random = new Random();
    protected String name;
    protected String color;
    protected int age;
    protected int maxRun;
    protected int maxSwim;
    protected double maxJump;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public abstract void jump(double height);

    public void info(){
        System.out.println(String.format("Имя: %s.%nЦвет: %s.%nВозраст: %s.", name, color, age));
    }



}
