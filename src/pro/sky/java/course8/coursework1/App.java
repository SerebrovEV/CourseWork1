package pro.sky.java.course8.coursework1;

public class App {
    private static final Employee[] Employees = new Employee[10];

    public static void main(String[] args) {
        Employees[0] = new Employee("Serebrov", "Eugene", "Vladimirovich", 1, 100_000);
        Employees[1] = new Employee("Smirnov", "Denis", "Borisovich", 2, 200_000);
        Employees[2] = new Employee("Baranov", "Maxim", "Olegovich", 4, 250_000);
        Employees[3] = new Employee("Simonov", "Artem", "Vladimirovich", 5, 100_000);
        Employees[4] = new Employee("Koshina", "Irina", "Alekseevna", 3, 300_001);
        Employees[5] = new Employee("Timofeeva", "Olga", "Victorovna", 1, 450_000);
        Employees[6] = new Employee("Pastushenko", "Denis", "Urevich", 2, 120_000);
        Employees[7] = new Employee("Vorobev", "Roman", "Vladimirovich", 1, 42_000);
        Employees[8] = new Employee("Karpunova", "Anna", "Andreevna", 5, 480_000);
        Employees[9] = new Employee("Serebrova", "Natalia", "Sergeevna", 2, 460_000);
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

    private static void harderTask() {
        double percent = 10;
        increaseSalary(percent);
        printEmployee();
    }
}
