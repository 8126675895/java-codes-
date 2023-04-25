class outer
{
int data = 10;
int getdata()
{
return data;
}
public static void main(String[] args)
{
Outer obj= newOuter();
if(obj.data<20)
{
class inner()
{
void print()
{
system.out.println("Local Inner class");
system.out.println("Data: "+obj.getdata());
}
}
inner obj1=new inner();
obj1 print();
}
}
}
