public class employee {
    public String fio;
    public String post;
    public String email;
    public String telephone;
    public int salary;
    public int age;

    public employee (String fio, String post, String email, String telephone, int salary, int age){
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;

    }
    public void info() {
        System.out.println(fio + post + email + telephone + salary + age);
    }
}


