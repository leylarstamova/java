package cats;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Plates p1 = new Plates(50);
        Cats[] catsArray = new Cats[4];
        catsArray[0] = new Cats("Vanya", 25);
        catsArray[1] = new Cats("Yanich", 10);
        catsArray[2] = new Cats("Lulix", 10);
        catsArray[3] = new Cats("Giorno",30);

        for (int i = 0; i < catsArray.length; i++) {
            System.out.println("Сейчас у тарелки " + catsArray[i].name);
            catsArray[i].eat(p1);
            catsArray[i].infoCat();
            p1.info();
        }

        System.out.println(" ");
        System.out.println("Хотите наполнить миску и позвать котов поесть еще раз? 1 - да. 0 - нет");
        int ask = in.nextInt();
        while(true){
            if(ask == 1){
                p1.refill();
                play(catsArray,p1);
            }
            break;
        }
    }

    public static void play(Cats[] catsArray, Plates p1){
        for (int i = 0; i < catsArray.length; i++) {
            System.out.println("Сейчас у тарелки " + catsArray[i].name);
            catsArray[i].eat(p1);
            catsArray[i].infoCat();
            p1.info();
        }
    }
}
