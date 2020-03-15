package cats;

public class Plates {
    public int food;
    public Plates(int food) {
        this.food = food;
    }

    public void decreaseFood(int n){
        if (n <= food){
            food -= n;
        } else {
            System.out.println("Для кота не хватает еды.");
        }
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void refill() {
        food += 50;
    }

    public int getFood() {
        return food;
    }

}
