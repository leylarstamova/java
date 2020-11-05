import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Cat[] catsTeam = new Cat[3];
        catsTeam[0] = new Cat("Кот Barsik", 10); //самый сбалансированый кот
        catsTeam[1] = new Cat("Котяра Murzik", 7); //ему надо больше заниматься спортом
        catsTeam[2] = new Cat("Кошка Snezhana", 11); //самая ловкая кошка

        Human[] humansTeam = new Human[3];
        humansTeam[0] = new Human("Крис", 6); // просто прыгает
        humansTeam[1] = new Human("Сиружя", 7); //прыгает по миру путешествуя
        humansTeam[2] = new Human("Яна Гленфидична", 6); //любит гп, но ради них попрыгает

        Droid[] droidsTeam = new Droid[3];
        droidsTeam[0] = new Droid("Опылитель01", 10); // настоящик соперник для кошек
        droidsTeam[1] = new Droid("Электрическая *****варка", 6); // робот приколист, сбежал из мема
        droidsTeam[2] = new Droid("Модифицированный Чо'Гат", 5); //он не прыгает, он топает, а другие подпрыгивают от страха!!

        Wall[] walls = new Wall[3];
        walls[0] = new Wall(3);
        walls[1] = new Wall(5);
        walls[2] = new Wall(8);

        Treadmill dorojka = new Treadmill(10);
        catsTeam[0].run();
        humansTeam[2].run();
        droidsTeam[2].run();


        System.out.println("Открывают прыжковой замес котики!");
        for (int i = 0; i < catsTeam.length; i++) {
            for (int j = 0; j < walls.length; j++) {
                if (catsTeam[i].jumpHeight >= walls[j].wallHeight) {
                    catsTeam[i].jump();
                } else {
                    System.out.println(catsTeam[i].name + " не смог перепрыгнуть. Слишком высоко. Высота стенки была - " + walls[j].wallHeight);
                }

            }
        }
        System.out.println(" ");

        System.out.println("Теперь идут ЛЮДИ! Встречаем homo сапиенсов...");
        for (int i = 0; i < humansTeam.length; i++) {
            for (int j = 0; j < walls.length; j++) {
                if (humansTeam[i].jumpHeight >= walls[j].wallHeight) {
                    humansTeam[i].jump();
                } else {
                    System.out.println(humansTeam[i].name + " не смог перепрыгнуть. Слишком высоко. Высота стенки была - " + walls[j].wallHeight);
                }

            }
        }
        System.out.println(" ");

        System.out.println("Последними идут роботы! Творения людей!");
        for (int i = 0; i < droidsTeam.length; i++) {
            for (int j = 0; j < walls.length; j++) {
                if (droidsTeam[i].jumpHeight >= walls[j].wallHeight) {
                    droidsTeam[i].jump();
                } else {
                    System.out.println(droidsTeam[i].name + " не смог перепрыгнуть. Слишком высоко. Высота стенки была - " + walls[j].wallHeight);
                }

            }
        }


        }
    }





