abstract class marks 
{
int m=50;
abstract void display();
}
class Anonymous
{
public static void main(String[]args)
{
marks m1 = new marks()
{
	void display()
	{
		System.out.println("Marks will be displayed shortly");
	}
};
m1.display();
}
}


