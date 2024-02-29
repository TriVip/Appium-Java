package labs.lab7.lab7_1;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmp(),
                new FullTimeEmp(),
                new FullTimeEmp(),
                new ContractEmp(),
                new ContractEmp()
        };

        // Calculate and display the total salary
        int totalSalary = CalculateSalary.calculateTotalSalary(employees);
        System.out.println("Total salary for all employees: " + totalSalary);
    }
}
