package workers;

public class Empl {
    private String name;
    private String post;
    private int Salary;
    private String mobileNumber;
    private int age;

    public Empl(String name, String post, int Salary, String mobileNumber, int age) {
        this.setName(name);
        this.setPost(post);
        this.setSalary(Salary);
        this.setMobileNumber(mobileNumber);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSalary() {
        if( age > 45){
            Salary = Salary + 5000;
        }
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
