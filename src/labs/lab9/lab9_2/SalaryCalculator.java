package labs.lab9.lab9_2;

public class SalaryCalculator {
    public int calculateTotalSalary(Employee[] employees) {
        int total = 0;
        for (Employee emp : employees) {
            total += emp.salary(); // Add each employee's salary to the total
        }
        return total;
    }
}
