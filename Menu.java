import java.util.Scanner;
class Menu
{
public static void main( String args[])
{
Scanner sc = new Scanner (System.in);
int balance=5000;
System.out.println("1. To withdraw the Money.");
System.out.println("2. To deposite the Money.");
System.out.println("3. Check the balance.");
System.out.println(" ");
System.out.println("Enter 1, 2 or 3 based on your query:");
int num=sc.nextInt();
switch(num)
{
case 1: 
{
System.out.println("To withdraw the Money.");
int amount=sc.nextInt();
System.out.println("amount successfully withdrawl " +amount);
int remain= balance-amount;
if (remain < balance)
System.out.println(" your balance is now" +remain);
else 
System.out.println("some error occured");
break;
}

}
}