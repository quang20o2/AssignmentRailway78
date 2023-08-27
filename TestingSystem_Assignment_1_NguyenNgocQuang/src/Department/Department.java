package Department;

public class Department {
    private int departmentID;
    private String departmentName;

    // Constructor


    public Department(int departmentID, String departmentName) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
    }

    // Getter and Setter cho departmentID
    public int getDepartmentID() {
        return departmentID;
    }


    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    // Getter and Setter cho departmentName
    public String getDepartmentName() {
        return departmentName;
    }


    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void displayDepartmentDetails(){
        System.out.println("Department ID: " + departmentID);
        System.out.println("Department Name: " + departmentName);
        System.out.println("\n");
    }
}

