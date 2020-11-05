public class Droid {
    public String name;
    public int jumpHeight;

    public Droid(String name, int jumpHeight){
        this.name = name;
        this.jumpHeight = jumpHeight;
    }

    public void jump(){
       System.out.println(name + " перерыгнул стену.");
    }


    public void run(){
        System.out.println( name + " пробежал");
    }

}
