import java.util.Scanner;
class demo
{
public static void main(String[] args)
{
int x,y;
double d;
byte z;
char c;
Scanner input =new Scanner(System.in);
System.out.println("Enter the values of x and y");
x=input.nextInt();
y=input.nextInt();
d=input.nextDouble();
z=input.nextByte();
c=input.next().charAt(0);
System.out.println(x+" "+y+" "+d+" "+z+" "+c);
}
}
