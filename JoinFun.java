import java.util.Scanner;
class JoinFun
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter your name");
String name= sc.nextLine();
System.out.println(String.join(" ", "my" , "name", "is" , name));



}
}