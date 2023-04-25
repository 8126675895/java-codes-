class Department {
    String departmentName;
    String hodName;

    Department(String departmentName, String hodName) {
        this.departmentName = departmentName;
        this.hodName = hodName;
    }

    void printDepartmentDetails() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("HOD Name: " + hodName);
    }
}

class StaffMember extends Department {
    String staffName;
    String staffQualification;

    StaffMember(String departmentName, String hodName, String staffName, String staffQualification) {
        super(departmentName, hodName);
        this.staffName = staffName;
        this.staffQualification = staffQualification;
    }

    void printStaffDetails() {
        super.printDepartmentDetails();
        System.out.println("Staff Name: " + staffName);
        System.out.println("Staff Qualification: " + staffQualification);
    }
}

public class lpu {
    public static void main(String[] args) {
        StaffMember staff = new StaffMember("Computer Science", "John Doe", "Jane Smith", "Masters in Computer Science");
        staff.printStaffDetails();
    }
}
