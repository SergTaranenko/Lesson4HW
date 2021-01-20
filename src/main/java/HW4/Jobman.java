package HW4;

public class Jobman {
    private String namesurname;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;


    public Jobman(String namesurname, String position, String email, String phone, int salary, int age) {
        this.namesurname = namesurname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getInfo() {
        return this.namesurname + this.position + this.email + this.phone  + " зарплата " + this.salary + " возраст " + this.age;

    }

    public int getAge() {
        return age;
    }
}
