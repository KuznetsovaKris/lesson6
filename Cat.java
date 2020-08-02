package OOP_animal;

public class Cat extends Animal {

    protected int maxRun = random.nextInt(100)+200;
    protected double maxJump = 2;

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats can`t swim");
    }

    @Override
    public void run(int distance) {
        if(maxRun < distance){
            System.out.println("Run: false");
            System.out.println(String.format("Maximum distance: %s", maxRun));
        } else{
            System.out.println("Run: true");
        }
    }

    @Override
    public void jump(double height) {
        if(maxJump < height){
            System.out.println("Jump: false");
        } else{
            System.out.println("Jump: true");
        }
    }
}
