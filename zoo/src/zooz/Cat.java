package zooz;

public class Cat extends Animal {

    private int jumpHeight = 2 ;
    private int distance = 100;

    public Cat(String name, String color, int age) {
        super(name, color, age);
        this.jumpHeight = jumpHeight;
    }

    public void jump(){
        System.out.println(name + " jumps " + jumpHeight + " meter. Котька прыгнула!");
    }

    @Override
    public void swim() {
        //котик не плавает
    }

    @Override
    public void fly() {
        //котик не летает
    }

    public void run(){
        System.out.println(name + " ran " + distance + " meters. Котька пробежала!");
    }
}
