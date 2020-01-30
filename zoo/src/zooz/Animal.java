package zooz;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;

    public Animal(String name, String color, int age){
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public void run() {
    }

    public abstract void jump();

    public abstract void swim();

    public abstract void fly();
}

