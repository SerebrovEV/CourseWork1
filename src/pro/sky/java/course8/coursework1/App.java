package pro.sky.java.course8.coursework1;

public class App {

    private static final EmployeeBook EMPLOYEE_BOOK = new EmployeeBook();

    public static void main(String[] args) {
        EMPLOYEE_BOOK.addEmployee("Serebrov", "Eugene", "Vladimirovich", 1, 100_000);
        EMPLOYEE_BOOK.addEmployee("Smirnov", "Denis", "Borisovich", 2, 200_000);
        EMPLOYEE_BOOK.addEmployee("Baranov", "Maxim", "Olegovich", 4, 250_000);
        EMPLOYEE_BOOK.addEmployee("Simonov", "Artem", "Vladimirovich", 5, 100_000);
        EMPLOYEE_BOOK.addEmployee("Koshina", "Irina", "Alekseevna", 2, 300_00);
        EMPLOYEE_BOOK.addEmployee("Timofeeva", "Olga", "Victorovna", 1, 450_000);
        EMPLOYEE_BOOK.addEmployee("Pastushenko", "Denis", "Urevich", 2, 120_005);
        EMPLOYEE_BOOK.addEmployee("Vorobev", "Roman", "Vladimirovich", 1, 42_000);
        EMPLOYEE_BOOK.addEmployee("Karpunova", "Anna", "Andreevna", 5, 480_000);
        EMPLOYEE_BOOK.addEmployee("Serebrova", "Natalia", "Sergeevna", 2, 560_000);


        basicTask();
        harderTask();
        theHardestTask();


    }

    public static void basicTask() {
        ; //a
        System.out.println("Общая сумма затрат на зарплату работников составляет " + EMPLOYEE_BOOK.allMonthSalary() + " рублей в месяц."); //b
        System.out.println("Сотрудник с минимальной зарплатой: " + EMPLOYEE_BOOK.minSalaryFio() + "."); //с
        System.out.println("Сотрудник с максимальной зарплатой: " + EMPLOYEE_BOOK.maxSalaryFio() + "."); //d
        System.out.println("Средняя зарплата сотрудников равна " + EMPLOYEE_BOOK.midSalary() + "рублей."); //e
        EMPLOYEE_BOOK.getFioEmployees(); //f
    }


    private static void harderTask() {
        double percent = 10; // пункт 1
        EMPLOYEE_BOOK.increaseSalary(percent); // пункт 1
        EMPLOYEE_BOOK.printEmployee();
        int numberDepartment = 2;
        System.out.println("Сотрудник " + EMPLOYEE_BOOK.searchDepartmentMinSalaryFio(numberDepartment) + " имеет наименьшую зарплату в отделе " + numberDepartment + "."); // пункт 2 а
        System.out.println("Сотрудник " + EMPLOYEE_BOOK.searchDepartmentMaxSalaryFio(numberDepartment) + " имеет наибольшую зарплату в отделе " + numberDepartment + "."); // пункт 2 b
        System.out.println("Зарплата сотрудников отдела " + numberDepartment + " составляет " + EMPLOYEE_BOOK.allMonthSalaryDepartment(numberDepartment) + " рублей."); //пункт 2 c
        System.out.println("Средняя зарплата в отделе " + numberDepartment + " составляет " + EMPLOYEE_BOOK.midSalaryDepartment(numberDepartment) + " рублей."); // пункт 2 d
        EMPLOYEE_BOOK.increaseSalaryDepartment(2, 10); //пункт 2 e
        // EMPLOYEE_BOOK.printEmployee();
        EMPLOYEE_BOOK.printEmployeeDepartment(2); //пункт 2 f
        int variable = 350_000; //пункт 3
        System.out.println("Сотрудники с зарплатой меньше " + variable + " рублей: ");
        EMPLOYEE_BOOK.searchEmployeeWithMinParameter(variable);
        System.out.println("Сотрудники с зарплатой больше " + variable + " рублей: ");
        EMPLOYEE_BOOK.searchEmployeeWithMaxParameter(variable);

    }

    private static void theHardestTask() {

        EMPLOYEE_BOOK.deleteEmployeeFio("Serebrov", "Eugene", "Vladimirovich");
        EMPLOYEE_BOOK.deleteEmployeeId(2);
        EMPLOYEE_BOOK.addEmployee("Serebrova", "Natalia", "Sergeevna", 2, 560_000);
        EMPLOYEE_BOOK.printEmployee();
        EMPLOYEE_BOOK.changeSalary("Serebrova Natalia Sergeevna", 800_000);
        System.out.println(EMPLOYEE_BOOK.salaryEmployee("Serebrova", "Natalia", "Sergeevna"));
        EMPLOYEE_BOOK.changeDepartment("Karpunova", "Anna", "Andreevna", 2);
       EMPLOYEE_BOOK.printEmployeeDepartment(2);
       EMPLOYEE_BOOK.sortingEmployeeByDepartment();

    }
}
