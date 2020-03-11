package zoo;

public class AnimalsPlays {
    public static void main(String[] args) {
        Cat c = new Cat("Барсик", "Белый");

        Doggo d = new Doggo("Жора", "черный");

        Animal[] animals = {c,d};
        for (int i = 0; i < animals.length; i++) {
            animals[i].animalInfo();
            animals[i].jump();
            animals[i].run();
            animals[i].swim();
        }


    }

}
