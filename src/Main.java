
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Coursework_1");
        Employee[] employees = new Employee[10];

        employees[0] = new Employee(1, "Иванов", "Иван",
                "Иванович", 1, 50_000);
        employees[1] = new Employee(2, "Петров", "Пётр",
                "Петрович", 1, 51_000);
        employees[2] = new Employee(3, "Васичкин", "Василий",
                "Васильевич", 2, 52_000);
        employees[3] = new Employee(4, "Светина", "Светлана",
                "Светлановна", 2, 53_000);
        employees[4] = new Employee(5, "Кукушкина", "Кукушка",
                "Кукушковна", 3, 51_000);
        employees[5] = new Employee(6, "Дроздов", "Дрозд",
                "Дроздовович", 3, 52_000);
        employees[6] = new Employee(7, "Свиридов", "Свирид",
                "Свиридович", 4, 55_000);
        employees[7] = new Employee(8, "Хомячков", "Хомяк",
                "Хомович", 4, 51_000);
        employees[8] = new Employee(9, "Зябликов", "Зяблик",
                "Зябликович", 5, 54_000);
        employees[9] = new Employee(10, "Крендель", "Крендель",
                "Кренделевич", 5, 56_000);
        for (int i = 0; i < 10; i++) {
            System.out.println(employees[i]);
            System.out.println(employees[i].hashCode() == employees[i].hashCode());

        }
        int[] salary = {50_000, 51_000, 52_000, 53_000, 51_000, 52_000,
                55_000, 51_000, 54_000, 56_000};
        int sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
        }
        System.out.printf("Сумма зарплат работников составила %s рублей %n", sum);
        double minSalary = salary[0];
        double maxSalary = salary[0];
        for (int i = 0; i < salary.length; i++) {

            if (salary[i] > minSalary) {
                maxSalary = salary[i];
            }
            if (salary[i] < maxSalary) {
                minSalary = salary[i];
            }
        }

        System.out.println("Максимальная зарплата работника за месяц " + maxSalary);
        System.out.println("Минимальная зарплата работника за месяц " + minSalary);
        double sum2 = 0;
        for (int i = 0; i < salary.length; i++) {
            sum2 += salary[i];
        }
        double averageSum = ((double) sum2 / salary.length);
        System.out.printf("Средняя зарплата сотрудников = " +
                "составила %s рублей%n ", averageSum);
    }
}











