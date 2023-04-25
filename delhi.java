
import java.util.Scanner;

public class Division 
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the dividend: ");
		
        double dividend = input.nextDouble();
        
        System.out.print("Enter the divisor: ");
		
        double divisor = input.nextDouble();
        
        double quotient = dividend / divisor;
        
        System.out.println("The quotient of " + dividend + " / " + divisor + " is " + quotient);
    }
}
