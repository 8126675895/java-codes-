import java.util.Scanner;

public class SalaryCalculator 
{
    private double salary;
    private double deduction;

    public SalaryCalculator(double salary) {
        this.salary = salary;
        calculateDeduction();
}

    public void calculateDeduction() 
	{
        if (salary > 1000000) {
            deduction = 0.1 * salary;
        } else if (salary > 500000) {
            deduction = 0.05 * salary;
        } else {
            deduction = 0;
        }
    }

    public double getSalary() 
	{
        return salary;
    }

    public double getDeduction() 
	{
        return deduction;
    }

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();
        SalaryCalculator salaryCalculator = new SalaryCalculator(salary);
        System.out.println("Salary: " + salaryCalculator.getSalary());
        System.out.println("Deduction: " + salaryCalculator.getDeduction());
    }
}