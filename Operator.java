class Operator  
{  
public static void main(String args[])   
{  
int x = 12, y = 4;
int R1, R2, R3, R4, R5, R6, R7;
R1=x+y;  
R2=x-y;
R3=x*y;
R4=x/y;
R5=x%y;
R6=R5++;
R7=--R6;
System.out.println("x+y= "+R1); 
System.out.println("x-y= "+R2);
System.out.println("x*y= "+R3); 
System.out.println("x/y= "+R4);
System.out.println("x%y= "+R5);
System.out.println("Post Increment= "+R6);
System.out.print("Pre Decrement= "+R7);

}  
}