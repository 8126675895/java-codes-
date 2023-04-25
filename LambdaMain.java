import java.util.Scanner;
interface in2
{
boolean test(int n1, int n2);
}
class LambdaMain
{
public static void main(String [] args)
{
Scanner obj=new Scanner(System.in);
int a=obj.nextInt();
int b=obj.nextInt();

in2 fac;
fac=(n1, n2) ->{
if( ( n1% n2)==0)
return true;
else 
return false;
};
System.out.println(fac.test(a,b));
}
}