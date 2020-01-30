package zooz;


public class Dog extends Animal {
    private float jumpHeight = (float) 0.5;
    private int distance = 500;
    private int swimDistance = 10;

    public Dog(String name, String color, int age){

        super(name, color, age);
    }

    public void jump(){

        System.out.println(name + " jumps " + jumpHeight + " meters. Пёська прыгнул!");
    }

    @Override
    public void swim() {
        System.out.println(name + " swam " + swimDistance + " meters. Пёська проплыл!");
    }

    @Override
    public void fly() {
        //пёська не летает
    }

    public void run(){
        System.out.println(name + " ran " + distance + " meters. Пёська пробежал!");
    }

}
