package pro.sky.java.course8.coursework1;

public class App {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Serebrov", "Eugene", "Vladimirovich", 1, 100_000);
        employees[1] = new Employee("Smirnov", "Denis", "Borisovich", 2, 200_000);
        employees[2] = new Employee("Baranov", "Maxim", "Olegovich", 4, 250_000);
        employees[3] = new Employee("Simonov", "Artem", "Vladimirovich", 5, 100_000);
        employees[4] = new Employee("Koshina", "Irina", "Alekseevna", 3, 300_000);
        employees[5] = new Employee("Timofeeva", "Olga", "Victorovna", 1, 450_000);
        employees[6] = new Employee("Pastushenko", "Denis", "Urevich", 2, 120_000);
        employees[7] = new Employee("Vorobev", "Roman", "Vladimirovich", 1, 42_000);
        employees[8] = new Employee("Karpunova", "Anna", "Andreevna", 5, 480_000);
        employees[9] = new Employee("Serebrova", "Natalia", "Sergeevna", 2, 460_000);
        basicTask();

    }

    private static void printEmployee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    private static int allMonthSalary() {
        int allSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            allSalary += employees[i].getSalary();
        }
        return allSalary;
    }

    private static String minSalaryFio() {
        int minSalary = 1_000_000;
        String employeeFio = null;
        for (int i = 0; i < employees.length; i++) {
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
                employeeFio = employees[i].getFio();
            }
        }
        return employeeFio;
    }

    private static String maxSalaryFio() {
        int maxSalary = 0;
        String employeeFio = null;
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
                employeeFio = employees[i].getFio();
            }
        }
        return employeeFio;
    }

    private static double midSalary() {
        double midSalary = allMonthSalary() / employees.length;
        return midSalary;
    }

    private static void getFioEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Ф.И.О. " + (i+1) + ": " + employees[i].getFio());

        }
    }


    private static void basicTask() {
        printEmployee(); //a
        System.out.println("Общая сумма затрат на зарплату работников составляет " + allMonthSalary() + " рублей в месяц."); //b
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryFio() + "."); //с
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryFio() + "."); //d
        System.out.println("Средняя зарплата сотрудников равна " + midSalary()  + "рублей."); //e
        getFioEmployees(); //f


    }
}
