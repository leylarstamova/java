public class Human {
    public int jumpHeight;
    public String name;

    public Human(String name, int jumpHeight){
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
