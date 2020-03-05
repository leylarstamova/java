public class Employer {


    public static void main(String[] args) {
        EmployerIn[] emplArray = new EmployerIn[5];
        emplArray[0] = new EmployerIn("Georgy", "dancer", "georgy@sobaka.ru", 89232315, 15000,30);
        emplArray[1] = new EmployerIn("Yanich", "HairMaster", "Yanich@sobaka.ru", 892345, 20000, 25);
        emplArray[2] = new EmployerIn("Kris", "BabySider", "Kris@mamka.ru", 76545387, 12000, 47);
        emplArray[3] = new EmployerIn("LULIX","Meme master", "meme@dealer.ru", 66688666, 100000, 30);
        emplArray[4] = new EmployerIn("Ivan", "Aion prisoner", "Ivan@help.me", 3801564, 500, 40);

        for (int i = 0; i < emplArray.length ; i++) {
            System.out.print(emplArray[i].getName() + " ");
            System.out.print(emplArray[i].getPost() + " ");
            System.out.print(emplArray[i].getEmail() + " ");
            System.out.print(emplArray[i].getPhoneNumber() + " ");
            System.out.print(emplArray[i].getSalary() + " ");
            System.out.println(emplArray[i].getAge());
        }

        for (int i = 0; i < emplArray.length; i++) {
            if(EmployerIn.age >= 40) System.out.print(emplArray[i].getName() + " " + emplArray[i].getAge());
        }

    }


}
