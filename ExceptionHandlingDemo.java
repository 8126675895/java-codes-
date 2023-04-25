import java.util.Scanner;
class ExceptionHandlingDemo
{
public static void main (String [] args);
Scanner s= new Scanner (System.in);
int a, b, answer;
System.out.println("enter two numbers");
a=s.nextInt();
b=s.nextInt();
System.out.println("welcome");
try
   {
     try
        {
         System.out.println("going to divide");
         answer=a/b;
        }
    catch(ArithmeticException e)
     {
              System.out.println("denominator is zero");

     }
    try
{
int arr[]=new int [5];
arr[5]=10;
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Size of array is 5");

}

   }
catch(Exception e)
{
         System.out.println("exception in the program");

}
}
}