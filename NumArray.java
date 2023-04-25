import java.util.Scanner;
class NumArray
{
public static void main(System args[])
{
Scanner obj = new Scanner (System.in);
System.out.println("enter size of array here");
size= obj.nextInt();
int arr[]= new int[size];
System.out.println("enter" +size+ "of array here");
for(int i=0; i< size ; i++)
{
arr[i]=scan.nextInt();
}
System.out.println("even elements are: ");
for(int i=0; i< size ; i++)
{
if (arr[i]%2==0)
{
System.out.println(arr[i]);
}
}
System.out.println("odd elements are: ");
for (int i=0; i<size; i++ )
{
if(arr[i]%2!=0);
{
System.out.println(arr[i]);
}
}
}
}