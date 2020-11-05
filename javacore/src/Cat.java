public class Cat {
    public String name;
    public int jumpHeight;


    public Cat(String name, int jumpHeight){
        this.name = name;
        this.jumpHeight = jumpHeight;

    }

    public void jump() {
        System.out.println(name + " перепрыгнул стенку");
    }

    public void run(){
        System.out.println( name + " пробежал");
    }

}

//    public int jump(int jumpHeight) {
//        System.out.println("Котик прыгнул");
//        return jumpHeight;
//    }



