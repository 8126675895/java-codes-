class triangle 
{
void display()
{
System.out.println("Inside the class triangle");
}
}
class Anonymous inner class
{
public static void main(String[] args)
{
triangle objt=new triangle()
{
void display()
{
System.out.println("Inside the anonymous class triangle");
}
};
objt.display();
}
}
