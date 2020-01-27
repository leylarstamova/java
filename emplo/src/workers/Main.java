package workers;



public class Main {
    public static void main(String[] args){
        Empl e0 = new Empl("Julia", "Waiter", 35000, "78875454", 46);
        /*
        задание 6* работает
        System.out.printf("name: %s, post: %s, salary:  %s, Mobile Number: %s, age: %d.\n", e0.getName(), e0.getPost(), e0.getSalary(), e0.getMobileNumber(), e0.getAge());
        */
        Empl e1 = new Empl("Kirill", "teacher ", 40000, "78585446", 21);
        //System.out.printf("name: %s, post: %s, salary:  %s, Mobile Number: %s, age: %d.\n", e1.getName(), e1.getPost(), e1.getSalary(), e1.getMobileNumber(), e1.getAge());
        Empl e2 = new Empl("Leyla", "Junior Tester", 60000, "79788585", 23);
        //System.out.printf("name: %s, post: %s, salary:  %s, Mobile Number: %s, age: %d.\n", e2.getName(), e2.getPost(), e2.getSalary(), e2.getMobileNumber(), e2.getAge());
        Empl e3 = new Empl("Nadezhda", "Manager", 45000, "79788355", 47);
        //System.out.printf("name: %s, post: %s, salary:  %s, Mobile Number: %s, age: %d.\n", e3.getName(), e3.getPost(), e3.getSalary(), e3.getMobileNumber(), e3.getAge());
        Empl e4 = new Empl("Evpatiy", "Pole Dancer", 120000, "78642126", 35);
        //System.out.printf("name: %s, post: %s, salary:  %s, Mobile Number: %s, age: %d.\n", e4.getName(), e4.getPost(), e4.getSalary(), e4.getMobileNumber(), e4.getAge());

        System.out.println("~Our best employers of January 2020~");

        System.out.printf("name: %s, post: %s.\n", e0.getName(), e0.getPost());
        System.out.printf("name: %s, post: %s.\n", e1.getName(), e1.getPost());
        System.out.printf("name: %s, post: %s.\n", e2.getName(), e2.getPost());
        System.out.printf("name: %s, post: %s.\n", e3.getName(), e3.getPost());
        System.out.printf("name: %s, post: %s.\n", e4.getName(), e4.getPost());

    }
        }

