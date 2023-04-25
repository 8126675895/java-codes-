import java.util.Scanner;
class Emp
{
int EmpId;
int EmpRank;
Scanner sc = new Scanner(System.in);

void EmpDetails()
{
System.out.println("Enter Employee Id: ");
EmpId=sc.nextInt();
System.out.println("Enter Employee Rank: ");
EmpRank=sc.nextInt();
}
void PrintEmpDetail()
{
System.out.print("Employee Id:"+ EmpId+" & ");
System.out.println("Employee Rank:"+ EmpRank);
}
}

class MainDetail
{
public static void main(String args[])
{
Emp a1= new Emp();
Emp a2= new Emp();
Emp a3= new Emp();
Emp a4= new Emp();
Emp a5= new Emp();

System.out.println("Enter Data");
a1.EmpDetails();
a2.EmpDetails();
a3.EmpDetails();
a4.EmpDetails();
a5.EmpDetails();
System.out.println("Print Data");
a1.PrintEmpDetail();
a2.PrintEmpDetail();
a3.PrintEmpDetail();
a4.PrintEmpDetail();
a5.PrintEmpDetail();

Emp Employee[] = {a1, a2, a3, a4, a5};
System.out.println("Print Array: ");
for(Emp a : Employee)
{
a.PrintEmpDetail();
}
}
}