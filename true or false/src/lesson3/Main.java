package lesson3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите число а");
        int a = scanner.nextInt();
        System.out.println("Напишите число b");
        int b = scanner.nextInt();
        int c = a + b;
        boolean t = true;
        boolean f = false;
        int bu1 = 10;
        int bu2 = 20;
        if(c > bu1 && c < bu2){
            System.out.println(t);
        } else {
            System.out.println(f);
        }



    }
}
