package pro.sky.java.course8.coursework1;

public class EmployeeBook {
    private final Employee[] EMPLOYEES;
    private int limit;

    public EmployeeBook() {
        this.EMPLOYEES = new Employee[10];
    }

    public void addEmployee(String surname, String name, String secondName, int departmentName, int salary) {
        if (limit >= EMPLOYEES.length) {
            throw new IllegalArgumentException("Список сотрудников заполнен. Добавление нового сотрудника невозможно.");
        }
        for (int i = 0; i < EMPLOYEES.length;i++) {
            if (EMPLOYEES[i] == null) {
                Employee newEmployee = new Employee(surname, name, secondName, departmentName, salary);
                EMPLOYEES[i] = newEmployee;
                limit++;
                break;
            }
        }
    }

    public void deleteEmployee(String fio, int id) {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            if (fio.equals(EMPLOYEES[i].getFio()) || EMPLOYEES[i].getId() == id) {
                EMPLOYEES[i] = null;
                limit--;
                return;
            }
        }
    }

    public void printEmployee() {
        for (int i = 0; i < limit; i++) {
            System.out.println(EMPLOYEES[i]);
        }
    }

    public int allMonthSalary() {
        int allSalary = 0;
        for (int i = 0; i < EMPLOYEES.length; i++) {
            allSalary += EMPLOYEES[i].getSalary();
        }
        return allSalary;
    }

    public String minSalaryFio() {
        double minSalary = 1_000_000;
        String employeeFio = null;
        for (Employee employee : EMPLOYEES) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                employeeFio = employee.getFio();
            }
        }
        return employeeFio;
    }


    public String maxSalaryFio() {
        double maxSalary = 0;
        String employeeFio = null;
        for (Employee employee : EMPLOYEES) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                employeeFio = employee.getFio();
            }
        }
        return employeeFio;
    }

    public double midSalary() {
        return (double) allMonthSalary() / EMPLOYEES.length;
    }

    public void getFioEmployees() {
        for (int i = 0; i < EMPLOYEES.length; i++) {
            System.out.println("Ф.И.О. " + (i + 1) + ": " + EMPLOYEES[i].getFio());
        }
    }

    public void increaseSalary(double percent) {
        for (Employee employee : EMPLOYEES) {
            double increase = employee.getSalary() + employee.getSalary() * (percent / 100);
            employee.setSalary(increase);
        }
    }

    public String searchDepartmentMinSalaryFio(int numberDepartment) {
        double minSalary = 1_000_000;
        String minSalaryFio = null;
        for (Employee employee : EMPLOYEES) {
            if (numberDepartment == employee.getDepartmentName() && minSalary > employee.getSalary()) {
                minSalaryFio = employee.getFio();
                minSalary = employee.getSalary();
            }
        }
        return minSalaryFio;
    }

    public String searchDepartmentMaxSalaryFio(int numberDepartment) {
        double maxSalary = 0;
        String maxSalaryFio = null;
        for (Employee employee : EMPLOYEES) {
            if (numberDepartment == employee.getDepartmentName() && maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                maxSalaryFio = employee.getFio();
            }
        }
        return maxSalaryFio;
    }

    public double allMonthSalaryDepartment(int numberDepartment) {
        double allSallary = 0;
        for (Employee employee : EMPLOYEES) {
            if (numberDepartment == employee.getDepartmentName()) {
                allSallary += employee.getSalary();
            }
        }
        return allSallary;
    }

    public double midSalaryDepartment(int numberDepartment) {
        double allSallary = 0;
        int j = 0;
        for (Employee employee : EMPLOYEES) {
            if (numberDepartment == employee.getDepartmentName()) {
                allSallary += employee.getSalary();
                j++;
            }
        }
        return allSallary / j;

    }

    public void increaseSalaryDepartment(int numberDepartment, double percent) {
        for (Employee employee : EMPLOYEES) {
            if (numberDepartment == employee.getDepartmentName()) {
                double increase = employee.getSalary() + employee.getSalary() * (percent / 100);
                employee.setSalary(increase);
            }
        }
    }

    public void printEmployeeDepartment(int numberDepartment) {
        for (Employee employee : EMPLOYEES) {
            if (numberDepartment == employee.getDepartmentName()) {
                System.out.println(employee.DepartmentInfo());
            }
        }
    }

    public void searchEmployeeWithMinParameter(double parameter) {
        for (Employee employee : EMPLOYEES) {
            if (parameter > employee.getSalary()) {
                System.out.println(employee.DepartmentInfo());
            }
        }
    }

    public void searchEmployeeWithMaxParameter(double parameter) {
        for (Employee employee : EMPLOYEES) {
            if (parameter < employee.getSalary()) {
                System.out.println(employee.DepartmentInfo());
            }
        }
    }

    public void changeSalary(String fio, double salary) {
        for (Employee employee : EMPLOYEES) {
            if (fio.equals(employee.getFio())) {
                employee.setSalary(salary);
            }
        }
    }

    public double salaryEmployee(String fio) {
        double salaryEmployee = 0;
        for (Employee employee : EMPLOYEES) {
            if (fio.equals(employee.getFio())) {
               salaryEmployee = employee.getSalary();
            }
        } return salaryEmployee;
    }

    public void changeDepartment(String fio, int departmentName) {
        for (Employee employee : EMPLOYEES) {
            if (fio.equals(employee.getFio())) {
                employee.setDepartmentName(departmentName);
            }
        }
    }
}
