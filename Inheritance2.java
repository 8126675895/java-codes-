class Box
{
  double w , h , d;
      Box()
      {
       w=-1;
       h=-1;
       d=-1;
      }
Box ( double a, double b, double c)
{
w=a;
h=b;
d=c;
}
Box( double len)
{
w=h=d=len;
}
Box (Box ob)
{
w=ob.w;
h=ob.h;
d=ob.d;
}
double volume()
{
return w*h*d;
}
}

class BoxWeight extends Box
{
double weight;
BoxWeight(double a, double b , double c, double d)  
{
w=a;
h=b;
this.d=c;      
weight=d;  
}
}

class BoxColor extends Box
{
String col;
BoxColor(double a , double b, double c, String d)
{
w=a;
h=b;
this.d=c;
col=d;
}

}
 class Inheritance2
 {
    public static void main(String [] args)
   {
     BoxWeight b1= new BoxWeight (10, 20, 30, 56);
     BoxWeight b2= new BoxWeight (110, 120, 130, 156);

     System.out.println("Volume of Box1:" +b1.volume());
     System.out.println("Weight of Box1:" +b1.weight);
     System.out.println();
     System.out.println("Volume of Box2:" +b2.volume());
     System.out.println("weight of Box2:" +b2.weight);
     System.out.println();
     BoxColor b3= new BoxColor(10, 20, 30, "blue");
     BoxColor b4= new BoxColor(110, 120, 310, "red");
     System.out.println("color of Box1:" +b3.col);
     System.out.println("Volume of Box1:" +b3.volume());
     System.out.println();
     System.out.println("color of Box2:" +b4.col);
     System.out.println("Volume of Box2:" +b4.volume());
    
   }
 }





