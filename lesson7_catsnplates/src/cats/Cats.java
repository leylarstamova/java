package cats;

public class Cats {

    public String name;
    public int appetite;
    boolean fullness;


    public Cats(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plates p1) {
        int Value01 = p1.getFood();
        p1.decreaseFood(appetite);
        int Value02 = p1.getFood();
        if (Value01 != Value02) {
            fullness = true;
        }
    }

    public void infoCat() {
        System.out.println("Сытость: " + fullness);
    }
}
