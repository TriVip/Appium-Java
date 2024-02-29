package labs.lab7.lab7_1;

public class CalculateSalary {
    public static int calculateTotalSalary(Employee[] employees) {
        int total = 0;
        for (Employee emp : employees) {
            total += emp.getSalary(); // Use polymorphism to get the correct salary
        }
        return total;
    }
}
