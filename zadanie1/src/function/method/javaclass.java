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
        float a1 = a;
        float b1 = b;
        float c1 = c;
        float d1 = d;
        float result;
        result = a1 * (b1 + (c1 / d1));
        System.out.println("Ответ " + result);
    }
}
