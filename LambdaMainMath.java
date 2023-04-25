import java.util.Scanner;
interface in2
{
int test(int arr[]);

}
class LambdaMainMath
{
public static void main(String [] args)
{   

int a={10, 20};
n1=a[0];
n1=a[1];
in2 max;
max=(a) ->{
if ( n1> n2)
System.out.println("max is: " +n1);
else 
System.out.println("max is: " +n2);
};

in2 min;
min=(a) ->{
if( n1> n2)
System.out.println("min is: " +n2);
else 
System.out.println("min is: " +n1);
};

in2 sum;
sum=(a) ->{
int c= n1+n2;
System.out.println("sum is: " +c);

};

in2 avg;
avg=(a) ->{
int c= n1+n2;
int d= c/2;
System.out.println("avg is: " +d);
};

}
}