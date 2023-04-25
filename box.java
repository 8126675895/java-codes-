class Box
{
	double w;
	double h;
	double d;
	Box();
	{
		w=-1;
		h=-1;
		d=-1;
	}
	Box(double a,double b,double c)
	{
		w=a;
		h=b;
		d=c;
	}
	Box(double len)
	{
		w=obj.w;
		h=obj.h;
		d=obj.d;
	}
	double volume()
	{
		return w*h*d;
	}
}

class Boxweight extends Box
{
	double weight;
	Boxweight(double a,double b,double c,double d)
	{
		w=a;
		h=b;
		d=c;
		weight=d;
	}
}

class Inheritance1
{
	public static void main(String args[])
	{
		BoxWeight b1=new BoxWeight(10,20,30,56);
		BoxWeight b2=new BoxWeight(110,120,130,156);
		
		System.out.println("volume of box1: "+b1.volume());
		System.out.println("weight of box1: "+b1.weight);
		
		System.out.println("volume of box1: "+b2.volume());
		System.out.println("weight of box1: "+b2.weight);
	}
}

		
		
		
		