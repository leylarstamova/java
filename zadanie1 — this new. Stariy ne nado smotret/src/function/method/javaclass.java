package function.method;

import java.util.Scanner;

public class javaclass {
    public static void main(String[] args){
        System.out.println("Введите число a. ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите число b. ");
        int b = scanner.nextInt();
        System.out.println("Введите число c. ");
        int c = scanner.nextInt();
        System.out.println("И наконец, введите число d.");
        int d = scanner.nextInt();
        float result = getResult(a,b,c,d);
        System.out.println(result);
    }

    public static float getResult(float a, float b, float c, float d){

        return  a * (b + (c / d));

    }

}
