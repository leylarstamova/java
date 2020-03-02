import java.util.Scanner;

public class Game {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int range = 9;
        play(range);
        System.out.println("Хотите поиграть еще раз? 1 - да. 0 - нет");
        int askGame = scanner.nextInt();
        while(true){
            if (askGame == 1) {
                play(range);
            } else break;
        }
    }

    private static void play (int range){
        int ask = (int) (Math.random() * range);
        int count = 3;
        System.out.println("Угадайте число от 0 до " + range);
        System.out.println("У вас " + count + " попытки");
        while (true){
            if (count >0) {
                int answer = scanner.nextInt();
                if (answer == ask) {
                    System.out.println("Вы угадали!");
                    break;
                } else if (answer > ask) {
                    System.out.println("Загаданное меньше. Количество попыток: " + (count - 1));
                } else {
                    System.out.println("Загаданное больше. Осталось Количество попыток: " + (count - 1));
                }
                count--;
            } else {
                System.out.println("Попытки кончились. Вы проиграли");
                break;
            }
        }
    }

}
