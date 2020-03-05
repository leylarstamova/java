public class EmployerIn {

    public static int age;
    String name, post, email;
    public int phoneNumber, salary;

    public EmployerIn(String name, String post, String email, int phoneNumber, int salary, int age){
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }

    public String getPost() {
        return post;
    }





}
