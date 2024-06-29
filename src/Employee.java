import java.util.Objects;

public class Employee {
    private int id;
    private static int idCounter;
    private String lastName;
    private String firstName;
    private String patronymic;
    private int department;
    private int salary;


    public Employee(int id, String lastName,
                    String firstName,
                    String patronymic,
                    int department,
                    int salary) {

        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = checkSalary(salary);
        this.id = ++idCounter;
    }


    public static int getIdCounter() {
        return idCounter;
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String setFirstName() {
        return this.firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String setPatronymic() {
        return this.patronymic;
    }

    public int getDeportment() {
        return department;
    }

    public void setDepartment(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Недопустимый номер отдела");
        }
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = checkSalary(salary);
    }


    //public void setSalary(double salary) {
    //if (salary <= 0) {
    //   System.out.println("З/П не может быть меньше 0");
    //   return;
    //}
    //this.salary = salary;
    //}

    @Override
    public String toString() {
        return " id: " + id + " " + " ФИО " + lastName + " " + firstName + " "
                + patronymic + " отдел: " +
                department + " ,з/п: " + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Employee employee = (Employee) obj;
        return id == employee.id && firstName.equals(employee.firstName) &&
                salary == employee.salary;

    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, firstName, lastName,
                patronymic, department, salary);
    }


    private int checkSalary(int salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Зарплата не может быть меньше нуля");
        }
        return salary;
    }
}









