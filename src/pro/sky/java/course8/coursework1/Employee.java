package pro.sky.java.course8.coursework1;

public class Employee {
    private String surname;
    private String name;
    private String secondName;
    private int departmentName;
    private int salary;
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
        return surname + " " + name +  " " + secondName;
    }

    public int getDepartmentName() {
        return departmentName;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartmentName() {
        if (departmentName > 0 && departmentName < 6) {
            this.departmentName = departmentName;
        } else {
            System.out.println("Неправильный номер отдела. Номера отделов могут быть только от 1 до 5");
        }
    }

    public void setSalary() {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник: ФИО: " + surname + " " + name + " " + secondName +
                ". Id: " + id + ". Номер отдела: " + departmentName + ". Оклад: " + salary + ".";
    }
}
