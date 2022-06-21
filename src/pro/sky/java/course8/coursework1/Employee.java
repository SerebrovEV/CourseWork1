package pro.sky.java.course8.coursework1;

import java.util.Objects;

public class Employee {
    private String surname;
    private String name;
    private String secondName;
    private int departmentName;
    private double salary;
    private int id;
    private static int numberId = 0;

    public Employee(String surname, String name, String secondName, int departmentName, int salary) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
        this.departmentName = departmentName;
        this.salary = salary;
        this.id = ++numberId;
    }

    public String getFio() {
        return surname + " " + name + " " + secondName;
    }

    public int getDepartmentName() {
        return departmentName;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setFio(String surname, String name, String secondName) {
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
    }

    public void setDepartmentName(int departmentName) {
        if (departmentName >= 0 && departmentName < 6) {
            this.departmentName = departmentName;
        } else {
            throw new IllegalArgumentException("Неправильный номер отдела. Номера отделов могут быть только от 1 до 5");
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник - ФИО: " + surname + " " + name + " " + secondName +
                ". Id: " + id + ". Номер отдела: " + departmentName + ". Оклад: " + salary + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id && surname.equals(employee.surname) && name.equals(employee.name) && secondName.equals(employee.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String DepartmentInfo() {
        return "Сотрудник - ФИО: " + surname + " " + name + " " + secondName + ". Id: " + id + ". Оклад: " + salary + ".";
    }


}
