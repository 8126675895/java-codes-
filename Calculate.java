import java.util.Scanner;

class perform
{
   void add(int a)
   {
    Scanner.obj = new Scanner( System.in);
    int x,y;
    System.out.println("enter number one");
    x= obj.nextInt()
    System.out.println("enter number two");
    y= obj.nextInt()
    a= x+y;
    System.out.println("the sun is" +a);
    }
       void add(float a)
       {
        Scanner.obj = new Scanner( System.in);
        float x,y;
        System.out.println("enter number one");
        x= obj.nextFloat()
        System.out.println("enter number two");
        y= obj.nextFloat()
        a= x+y;
        System.out.println("the sun is" +a);
       }
            void add(int a, float b )
           {
            Scanner.obj = new Scanner( System.in);
            int  x;
            float y;
             System.out.println("enter int number");
             x= obj.nextInt()
              System.out.println("enter float number");
              y= obj.nextFloat()
              a= x+y;
             System.out.println("the sun is" +a);
           }

}

class Calculate
{
public static void main (String [] args)
{
perform p = new perform();
p.perform();
}
}