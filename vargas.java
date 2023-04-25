class var_args
{
void print_varargs(int...a)
{
System.out.println("Number of variable arguments:"a.lenght);
for(int i:a)
{
System.out.println(i);
}
}
}
class MainVarargs
{
public static void main(String args[])
{
var_args vob=new var_args();
vob.print_varargs();
}

