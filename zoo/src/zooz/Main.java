package zooz;

public abstract class Main {
    public static void main(String[] args) {
        Horse h = new Horse("Ivan", "Brown", 5);
        Dog d = new Dog("Jora", "yellow", 3);
        Cat c = new Cat("Leila", "white", 2);
        Bird b = new Bird("Yanich", "Black", 1);

        Animal[] zoo = {h,d,c,b};
        for(int i = 0; i < zoo.length; i++){
            zoo[i].jump();
            zoo[i].run();
            zoo[i].swim();
            System.out.println("Нy просто пуся!!!\n");
        } 
    }

}