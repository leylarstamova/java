import java.util.Scanner;
//задание 1
public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte a = 5;            //задание 2
        int b = 13;
        short s = 120;
        long l = 7530000000L;
        double c = 4.5;
        float d = 5.0f;
        char c0 = 27;
        char i = 'i';
        boolean t = true;
        boolean f = false;
        System.out.println(getCalc(a, b, c, d));
        System.out.println("Введите первое число");
        int i0 = scanner.nextInt();
        System.out.println("Введите второе число");
        int i1 = scanner.nextInt();
        System.out.println(sum(i0, i1, true, false));
        System.out.println(); //разделитель
        System.out.println("Введи число, а я проверю, какое мне передали");
        int z4 = scanner.nextInt();
        System.out.println(letsCheck(z4));
        System.out.println(); // разделитель
        System.out.println(check(z4, t, f));
        System.out.println(); // разделитель

    }




    private static String letsCheck(int z4) {
        String letsCheck = z4 >= 0? "Это число положительное!" : "Это число отрицательное!";
        return letsCheck;
    } // задание 5

    //задание 3
    private static double getCalc(byte a, int b, double c, float d) {
        return a * (b + (c / d));
    }
    // задание 4
    private static boolean sum(int i0, int i1, boolean t, boolean f){
        int i2 = i0 + i1;
        if(i2 >= 10 && i2 <= 20){
            return t;
        } else {
            return f;
        }
    }
    //задание 6
    private static boolean check(int z4, boolean t, boolean f){
        boolean b = z4 <= 0 ? t : f;
        return b;
    }


}
