package pro.sky.java.course8.coursework1;

public class App {
    private static final Employee[] Employees = new Employee[10];

    public static void main(String[] args) {
        Employees[0] = new Employee("Serebrov", "Eugene", "Vladimirovich", 1, 100_000);
        Employees[1] = new Employee("Smirnov", "Denis", "Borisovich", 2, 200_000);
        Employees[2] = new Employee("Baranov", "Maxim", "Olegovich", 4, 250_000);
        Employees[3] = new Employee("Simonov", "Artem", "Vladimirovich", 5, 100_000);
        Employees[4] = new Employee("Koshina", "Irina", "Alekseevna", 2, 300_00);
        Employees[5] = new Employee("Timofeeva", "Olga", "Victorovna", 1, 450_000);
        Employees[6] = new Employee("Pastushenko", "Denis", "Urevich", 2, 120_005);
        Employees[7] = new Employee("Vorobev", "Roman", "Vladimirovich", 1, 42_000);
        Employees[8] = new Employee("Karpunova", "Anna", "Andreevna", 5, 480_000);
        Employees[9] = new Employee("Serebrova", "Natalia", "Sergeevna", 2, 560_000);
        basicTask();
        harderTask();

    }

    private static void printEmployee() {
        for (int i = 0; i < Employees.length; i++) {
            System.out.println(Employees[i]);
        }
    }

    private static int allMonthSalary() {
        int allSalary = 0;
        for (int i = 0; i < Employees.length; i++) {
            allSalary += Employees[i].getSalary();
        }
        return allSalary;
    }

    private static String minSalaryFio() {
        double minSalary = 1_000_000;
        String employeeFio = null;
        for (int i = 0; i < Employees.length; i++) {
            if (minSalary > Employees[i].getSalary()) {
                minSalary = Employees[i].getSalary();
                employeeFio = Employees[i].getFio();
            }
        }
        return employeeFio;
    }

    private static String maxSalaryFio() {
        double maxSalary = 0;
        String employeeFio = null;
        for (int i = 0; i < Employees.length; i++) {
            if (maxSalary < Employees[i].getSalary()) {
                maxSalary = Employees[i].getSalary();
                employeeFio = Employees[i].getFio();
            }
        }
        return employeeFio;
    }

    private static double midSalary() {
        double midSalary = (double) allMonthSalary() / Employees.length;
        return midSalary;
    }

    private static void getFioEmployees() {
        for (int i = 0; i < Employees.length; i++) {
            System.out.println("Ф.И.О. " + (i + 1) + ": " + Employees[i].getFio());

        }
    }


    private static void basicTask() {
        printEmployee(); //a
        System.out.println("Общая сумма затрат на зарплату работников составляет " + allMonthSalary() + " рублей в месяц."); //b
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryFio() + "."); //с
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryFio() + "."); //d
        System.out.println("Средняя зарплата сотрудников равна " + midSalary() + "рублей."); //e
        getFioEmployees(); //f
    }

    private static void increaseSalary(double percent) {
        for (int i = 0; i < Employees.length; i++) {
            double increase = Employees[i].getSalary() + Employees[i].getSalary() * (percent / 100);
            Employees[i].setSalary(increase);
        }
    }

    private static String searchDepartmentMinSalaryFio(int numberDepartment) {
        double minSalary = 1_000_000;
        String minSalaryFio = null;
        for (int i = 0; i < Employees.length; i++) {
            if (numberDepartment == Employees[i].getDepartmentName() && minSalary > Employees[i].getSalary()) {
                minSalaryFio = Employees[i].getFio();
                minSalary = Employees[i].getSalary();
            }
        }
        return minSalaryFio;
    }

    private static String searchDepartmentMaxSalaryFio(int numberDepartment) {
        double maxSalary = 0;
        String maxSalaryFio = null;
        for (int i = 0; i < Employees.length; i++) {
            if (numberDepartment == Employees[i].getDepartmentName() && maxSalary < Employees[i].getSalary()) {
                maxSalary = Employees[i].getSalary();
                maxSalaryFio = Employees[i].getFio();
            }
        }
        return maxSalaryFio;
    }

    private static double allMonthSalaryDepartment(int numberDepartment) {
        double allSallary = 0;
        for (int i = 0; i < Employees.length; i++) {
            if (numberDepartment == Employees[i].getDepartmentName()) {
                allSallary += Employees[i].getSalary();
            }
        }
        return allSallary;
    }

    private static double midSalaryDepartment(int numberDepartment) {
        double allSallary = 0;
        double midSallary;
        int j = 0;
        for (int i = 0; i < Employees.length; i++) {
            if (numberDepartment == Employees[i].getDepartmentName()) {
                allSallary += Employees[i].getSalary();
                j++;
            }
        }
        midSallary = allSallary / j;
        return midSallary;
    }

    private static void increaseSalaryDepartment(int numberDepartment, double percent) {
        for (int i = 0; i < Employees.length; i++) {
            if (numberDepartment == Employees[i].getDepartmentName()) {
                double increase = Employees[i].getSalary() + Employees[i].getSalary() * (percent / 100);
                Employees[i].setSalary(increase);
            }
        }
    }

    private static void printEmployeeDepartment(int numberDepartment) {
        for (int i = 0; i < Employees.length; i++) {
            if (numberDepartment == Employees[i].getDepartmentName()) {
                System.out.println(Employees[i].DepartmentInfo());
            }
        }
    }

    private static void searchEmployeeWithMinParameter(double parameter) {
        for (int i = 0; i < Employees.length; i++) {
            if (parameter > Employees[i].getSalary()) {
                System.out.println(Employees[i].DepartmentInfo());
            }
        }
    }

    private static void searchEmployeeWithMaxParameter(double parameter) {
        for (int i = 0; i < Employees.length; i++) {
            if (parameter < Employees[i].getSalary()) {
                System.out.println(Employees[i].DepartmentInfo());
            }
        }
    }

    private static void harderTask() {
        double percent = 10; // пункт 1
        increaseSalary(percent); // пункт 1
        // printEmployee();
        int numberDepartment = 2;
        System.out.println("Сотрудник " + searchDepartmentMinSalaryFio(numberDepartment) + " имеет наименьшую зарплату в отделе " + numberDepartment + "."); // пункт 2 а
        System.out.println("Сотрудник " + searchDepartmentMaxSalaryFio(numberDepartment) + " имеет наибольшую зарплату в отделе " + numberDepartment + "."); // пункт 2 b
        System.out.println("Зарплата сотрудников отдела " + numberDepartment + " составляет " + allMonthSalaryDepartment(numberDepartment) + " рублей."); //пункт 2 c
        System.out.println("Средняя зарплата в отделе " + numberDepartment + " составляет " + midSalaryDepartment(numberDepartment) + " рублей."); // пункт 2 d
        increaseSalaryDepartment(2,10); //пункт 2 e
        // printEmployee();
        printEmployeeDepartment(2); //пункт 2 f
        int variable = 350_000; //пункт 3
        System.out.println("Сотрудники с зарплатой меньше " + variable + " рублей: ");
        searchEmployeeWithMinParameter(variable);
        System.out.println("Сотрудники с зарплатой больше " + variable + " рублей: ");
        searchEmployeeWithMaxParameter(variable);

    }
}
