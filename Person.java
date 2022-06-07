package Zadanie5;

public class Person {
    private String FIO;
    private  String post;
    private  String mail;
    private String phone;
    private  double salary;
    private  int age;

    public Person(String FIO, String post, String mail, String phone, double salary, int age){
        this.FIO = FIO;
        this.pos = post;
        this.email = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
}
    public int getAge() {
        return age;
    }
    public String toString(){
        return(FIO + "\n-"
                       + post + "\n-"
                       + mail + "\n-"
                       + phone + "\n-"
                       + salary + "\n-"
                       + age);
    }
}


