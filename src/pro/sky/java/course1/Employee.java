package pro.sky.java.course1;

public class Employee {
    private static int id;
    private final String name;
    private int salary;
    private int department;


    public Employee(String name, int salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public static int getid() {
        return id++;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getId() {
        return id++;
    }

    public String toString() {
        return  "ФИО: " + name + ". Зарплата " + salary + " рублей. Отдел " + department;
    }
}
