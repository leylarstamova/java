package zooz;

public class Horse extends Animal {

    private int  jumpHeight = 3;
    private int distance = 1500;
    private int swimDistance = 100;

    public Horse(String name, String color, int age){

        super(name, color, age);
    }

    public void jump(){

        System.out.println(name + " jumps " + jumpHeight + " meters. Конь прыгнул!");
    }

    @Override
    public void swim() {
        System.out.println(name + " swam " + swimDistance + " meters. Конь проплыл!");
    }

    @Override
    public void fly() {
        //конь не летает
    }

    public void run(){
        System.out.println(name + " ran " + distance + " meters. Конь проскакал!");
    }
}
