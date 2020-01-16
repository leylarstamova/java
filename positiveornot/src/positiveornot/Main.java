package positiveornot;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напиши, пожалуйста, число, а я проверю, положительное оно или нет.");
        int a = scanner.nextInt();
        System.out.println(getInt(a));

    }

    public static int getInt(int a){
        if(a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
        return a;
    }
}
