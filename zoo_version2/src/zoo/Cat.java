package zoo;

public class Cat extends Animal {
    String color;
    private int jumpHeight = 2 ;
    private int distance = 100;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void animalInfo() {
        System.out.println("Имя котика: " + name + ". Цвет котика: " + color);
    }

    @Override
    public void jump() {
        System.out.println("Котик " + name + " подпрыгнул на " + jumpHeight + " метра.");
    }

    @Override
    public void run() {
        System.out.println("Котик " + name + " пробежал " + distance + " метров");
    }

    @Override
    public void swim() {
        System.out.println("Котик плавать не умеет и не любит.");
    }
}
