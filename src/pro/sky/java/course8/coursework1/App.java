package pro.sky.java.course8.coursework1;

public class App {
    public static void main(String[] args) {
        Employee embloyees[] = new Employee[10];
        embloyees[0] = new Employee("Serebrov", "Eugene", "Vladimirovich", 1, 100_000);
        embloyees[1] = new Employee("Smirnov", "Denis", "Borisovich", 2, 200_000);
        embloyees[2] = new Employee("Baranov", "Maxim", "Olegovich", 4, 250_000);
        embloyees[3] = new Employee("Simonov", "Artem", "Vladimirovich", 5, 100_000);
        embloyees[4] = new Employee("Koshina", "Irina", "Alekseevna", 3, 300_000);
        embloyees[5] = new Employee("Timofeeva", "Olga", "Victorovna", 1, 450_000);
        embloyees[6] = new Employee("Pastushenko", "Denis", "Urevich", 2, 120_000);
        embloyees[7] = new Employee("Vorobev", "Roman", "Vladimirovich", 1, 42_000);
        embloyees[8] = new Employee("Karpunova", "Anna", "Andreevna", 5, 480_000);
        embloyees[9] = new Employee("Serebrova", "Natalia", "Sergeevna", 2, 460_000);
        System.out.println(embloyees);
    }
}
