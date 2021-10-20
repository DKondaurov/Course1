package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[Employee.getid()] = new Employee("Новиков Донат Аристархович", 259645, 5);
        employees[Employee.getid()] = new Employee("Давыдов Виссарион Федосеевич", 437676, 1);
        employees[Employee.getid()] = new Employee("Горбачёв Юрий Дмитриевич", 23372, 2);
        employees[Employee.getid()] = new Employee("Попов Ермолай Пантелеймонович", 208953, 3);
        employees[Employee.getid()] = new Employee("Зиновьев Станислав Святославович", 380712, 5);
        employees[Employee.getid()] = new Employee("Сысоев Наум Альвианович", 410747, 4);
        employees[Employee.getid()] = new Employee("Носков Клим Артёмович", 485483, 2);
        employees[Employee.getid()] = new Employee("Белоусов Митрофан Валентинович", 415403, 2);
        employees[Employee.getid()] = new Employee("Федотов Аверьян Александрович", 86071, 2);
        employees[Employee.getid()] = new Employee("Селезнёв Василий Эльдарович", 354469, 1);

        listOfAllEmployees(employees);

        totalSalary(employees);

        minSalary(employees);

        maxSalary(employees);

        averageSalary(employees);


    }

    private static void averageSalary(Employee[] employees) {
        float salary = 0;
        int i = 0;
        for (; i < employees.length; i++) {
            salary = salary + employees[i].getSalary();
        }
        System.out.println("Средняя зарплата = " + salary / i + " руб.");
    }

    private static void maxSalary(Employee[] employees) {
        int salary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (salary < employees[i].getSalary()) {
                salary = employees[i].getSalary();
            }
        }
        System.out.println("Максимальная зарплата = " + salary + " руб.");
    }

    private static void minSalary(Employee[] employees) {
        int salary = 600000;
        for (int i = 0; i < employees.length; i++) {
            if (salary > employees[i].getSalary()) {
                salary = employees[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата = " + salary + " руб.");
    }


    private static void totalSalary(Employee[] employees) {
        int salary = 0;
        for (int i = 0; i < employees.length; i++) {
            salary = salary + employees[i].getSalary();
        }
        System.out.println("Общая зарплата = " + salary + " руб.");
    }

    private static void listOfAllEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}

