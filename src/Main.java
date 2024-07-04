
import java.sql.SQLOutput;
import java.util.Objects;

public class Main {


    public static Employee[] employees = new Employee[10];


    public static void main(String[] args) {
        System.out.println("Coursework_1");


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

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }


        int sumSalary = getSumSalaries();
        System.out.println("Сумма зарплат работников составила  " + sumSalary + " рублей");

        Employee minSalary = getMinSalary();
        System.out.println("Минимальная зарплата работника за месяц " + minSalary);

        Employee maxSalary = getMaxSalary();
        System.out.println("Максимальная зарплата работника за месяц " + maxSalary);

        int averageSumSalary = getAverageSumSalary();
        System.out.println("Средняя зарплата сотрудников " +
                "составила  " + averageSumSalary + " рублей");
    }

    private static int getAverageSumSalary() {
        int averageSumSalary = getSumSalaries() / employees.length;

        return averageSumSalary;
    }

    private static int getSumSalaries() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }


    private static Employee getMinSalary() {
        Employee minSalaryEmployee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (minSalaryEmployee.getSalary() > employees[i].getSalary()) {
                minSalaryEmployee = employees[i];
            }
        }
        return minSalaryEmployee;
    }

    private static Employee getMaxSalary() {
        Employee maxSalaryEmployee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (maxSalaryEmployee.getSalary() < employees[i].getSalary()) {
                maxSalaryEmployee = employees[i];
            }
        }
        return maxSalaryEmployee;
    }
}

























