import java.util.Scanner;
class infer
{
int num1, num2;
infer()
{
Scanner sc = new Scanner (System.in);
num1= sc.nextInt();
num2= sc.nextInt();
}

int calculate()
{
int multiply= num1*num2;
return(multiply);
}

}
class MainInfer
{
public static void main (String args[])
{

infer ob= new infer();
int result = ob.calculate();
System.out.print(result);

}
}