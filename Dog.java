package OOP_animal;

public class Dog extends Animal{

    protected int maxRun = random.nextInt(100) + 500;
    protected int maxSwim = random.nextInt(50) + 10;
    protected double maxJump = 0.5;

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void swim(int distance) {
        if(maxSwim < distance){
            System.out.println("Swim: false");
            System.out.println(String.format("Maximum distance: %s", maxSwim));
        } else{
            System.out.println("Swim: true");
        }
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
