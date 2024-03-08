package labs.lab9.lab9_2;

public class S3Corp {
    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();
        Employee[] employees = {
                new FullTimeEmployee(),
                new FullTimeEmployee(),
                new FullTimeEmployee(),
                new ContractEmployee(),
                new ContractEmployee()
        };
        int totalSalary = calculator.calculateTotalSalary(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("Total Salary: " + totalSalary);
    }
}
