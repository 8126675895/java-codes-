class Department {
    String deptName;
    String hodName;

    public Department(String departmentName, String hodName) {
        this.deptName = departmentName;
        this.hodName = hodName;
    }

    public void printDepartmentDetails() {
        System.out.println("Department Name: " + deptName);
        System.out.println("HOD Name: " + hodName);
    }
}

class Staff extends Department {
    String sName;
    String staffQuali;

    public Staff(String staffName, String staffQualification, String departmentName, String hodName) {
        super(departmentName, hodName);
        this.sName = staffName;
        this.staffQuali = staffQualification;
    }

    public void printStaffDetails() {
        super.printDepartmentDetails();
        System.out.println("Staff Name: " + sName);
        System.out.println("Staff Qualification: " + staffQuali);
    }
}

public class meerut {

    public static void main(String[] args) {
        Department dept = new Department("EEE", "ABC");
        Staff staffMember = new Staff("KGF", "BSc", dept.deptName, dept.hodName);
        staffMember.printStaffDetails();

    }
    
}