import java.util.Scanner;
class calculus 
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);


int a = sc.nextInt();


int b = sc.nextInt();

try
{
int result =a/b;
}

catch(ArithmeticException a)
{

System.out.print(a);


System.out.println("denominator is zero");
}
catch(Exception b)
{
	
	System.out.print(b);
	System.out.println("Exception");
}

}


}

