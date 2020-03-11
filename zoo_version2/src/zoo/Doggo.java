package zoo;

public class Doggo extends Animal{
    String color;
    private float jumpHeight = (float) 0.5;
    private int distance = 500;
    private int swimDistance = 10;

    public Doggo(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void animalInfo() {
        System.out.println("Имя пёсика: " + name + ". Цвет пёсика: " + color);
    }

    @Override
    public void jump() {
        System.out.println("Пёсик " + name + " подпрыгнул на " + jumpHeight + " метра.");
    }

    @Override
    public void run() {
        System.out.println("Пёсик " + name + " пробежал " + distance + " метров.");
    }

    @Override
    public void swim() {
        System.out.println("Пёсик, мокренький носик, " + name + " проплыл " + swimDistance + " метров. ");
    }
}
