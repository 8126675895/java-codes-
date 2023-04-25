import java.util.Scanner;
class Multiply
{
int a= 10;
int b = 5;
int c= a%b;
void print_data()
{
if (c==0)
System.out.println("Number a is multiple of b");
else
System.out.println("Number a is not a multiple of b");
} 
}
class MainMultiply
{
public static void main ( String [] args)
{
Multiply m = new Multiply();
m.print_data();
}
}