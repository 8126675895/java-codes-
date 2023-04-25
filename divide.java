import java.util.Scanner ;
class divide
{
public static void main(String [] args)
{
Scanner obj=new Scanner(System.in);
int no1;
System.out.println("enter number 1: ");
no1= obj.nextInt();
int no2;
System.out.println("enter number 2: ");
no2= obj.nextInt();
try
{
if (no2==0)
{
throw no2;
}
int c= no1/no2;
System.out.println("the output is : " +c);
}
catch( int x )
{
System.out.println("the demonimator is zero ");
}
}
}