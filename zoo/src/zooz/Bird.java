package zooz;

public class Bird extends Animal {
    private float jumpHeight = (float) 0.2;
    private int distance = 5;
    private int flyHeight = 17;

    public Bird(String name, String color, int age) {
        super(name, color, age);
    }

    public void jump(){
                System.out.println(name + " jumps " + jumpHeight + " meters. Птичка прыгнула!");
    }

    @Override
    public void swim() {
        //птичка не плавает
    }

    @Override
    public void fly() {
        System.out.println(name + " flies " + flyHeight + " meters. Птичка полетала! ");
    }

    public void run(){
        System.out.println(name + " ran " + distance + " meters. Птичка пробежала! ");
    }
}