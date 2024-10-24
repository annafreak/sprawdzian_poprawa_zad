class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    public Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("Cześć, jestem " + firstName + " " + lastName + ", mam " + age + " lat i jestem " + gender + ".");
    }

    public void changeAge(int newAge) {
        this.age = newAge;
    }


    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
}


class Employee extends Person {
    private String position;
    private double salary;
    private String id;
    private boolean isEmployed;

    public Employee(String firstName, String lastName, int age, String gender, String position, double salary, String id) {
        super(firstName, lastName, age, gender);
        this.position = position;
        this.salary = salary;
        this.id = id;
        this.isEmployed = true;
    }

    public void startWork() {
        isEmployed = true;
        System.out.println("Pracownik " + getFirstName() + " " + getLastName() + " rozpoczął pracę.");
    }

    public void endWork() {
        isEmployed = false;
        System.out.println("Pracownik " + getFirstName() + " " + getLastName() + " zakończył pracę.");
    }

    public void increaseSalary(double amount) {
        salary += amount;
        System.out.println("Wynagrodzenie pracownika " + getFirstName() + " " + getLastName() + " wzrosło o " + amount + ".");
    }


    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
}


class Manager extends Employee {
    private int subordinatesCount;
    private String department;

    public Manager(String firstName, String lastName, int age, String gender, String position, double salary, String id, int subordinatesCount, String department) {
        super(firstName, lastName, age, gender, position, salary, id);
        this.subordinatesCount = subordinatesCount;
        this.department = department;
    }

    public void assignTasks() {
        System.out.println("Menedżer " + getFirstName() + " " + getLastName() + " przydzielił zadania podwładnym.");
    }

    public void changeDepartment(String newDepartment) {
        this.department = newDepartment;
        System.out.println("Menedżer " + getFirstName() + " " + getLastName() + " zmienił dział na " + department + ".");
    }


    public int getSubordinatesCount() { return subordinatesCount; }
    public void setSubordinatesCount(int subordinatesCount) { this.subordinatesCount = subordinatesCount; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}


public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Akahaczov", "Hasov", 35, "mężczyzna", "Menadżer", 8000.0, "M001", 5, "IT");


        manager.introduce();
        manager.startWork();
        manager.assignTasks();
        manager.changeDepartment("Marketing");
        manager.increaseSalary(1000);
        manager.endWork();
    }
}
