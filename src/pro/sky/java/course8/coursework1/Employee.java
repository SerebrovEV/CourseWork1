package pro.sky.java.course8.coursework1;

public class Employee {
    private String surname;
    private String name;
    private String secondName;
    private String departmentName;
    private int salary;
    private static int id = 1;

    public Employee(String surname, String name, String secondName, String departmentName, int salary) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.departmentName = departmentName;
        this.salary = salary;
        this.id++;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartmentName() {
        this.departmentName = departmentName;
    }

    public void setSalary() {
        this.salary = salary;
    }


}
