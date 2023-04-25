import java.util.Scanner;
interface in2
{
String test();
}
class LambdaMainReverse
{
public static void main(String [] args)
{   
        in2 str, nstr="" ;
        char ch;
       
      System.out.print("The word is: ");
      System.out.println("Anshuman"); 

test str;
str = ("Anshuman") -> {
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        nstr= ch+nstr;
      }
};
      System.out.println("Reversed word: "+ nstr);
    
}
}