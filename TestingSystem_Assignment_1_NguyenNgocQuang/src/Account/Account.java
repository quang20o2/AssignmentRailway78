package Account;


import Department.Department;
import Position.Position;

import java.time.LocalDate;

public class Account {
    private int accountID;
    private String email;
    private String userName;
    private String fullName;
    private Department department;
    private Position position;
    private LocalDate createDate;

    //Constructor
    public Account(int accountID, String email, String userName, String fullName, Department department, Position position, LocalDate createDate) {
        this.accountID = accountID;
        this.email = email;
        this.userName = userName;
        this.fullName = fullName;
        this.department = department;
        this.position = position;
        this.createDate = createDate;
    }




    // Getter and Setter cho accountID
    public int getAccountID() {

        return accountID;
    }

    public void setAccountID(int accountID) {
    this.accountID = accountID;
    }

    // Getter and Setter cho email
    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    // Getter and Setter cho username
    public String getUserName() {

        return userName;
    }

    public void setUsername(String userName){
        this.userName = userName;
    }

    // Getter and Setter cho fullName
    public String getFullName() {

        return fullName;
    }

    public void setFullName(String fullName) {

        this.fullName = fullName;
    }

    // Getter and Setter cho department
    public Department getDepartment() {

        return department;
    }

    public void setDepartment(Department department) {

        this.department = department;
    }

    // Getter and Setter cho position
    public Position getPosition() {

        return position;
    }

    public void setPosition(Position position) {

        this.position = position;
    }

    // Getter and Setter cho createDate
    public LocalDate getCreateDate() {

        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {

        this.createDate = createDate;
    }

    public void displayAccountDetails() {
        System.out.println("Thông tin nhân viên:");
        System.out.println("Account ID: " + accountID);
        System.out.println("Email: " + email);
        System.out.println("UserName: " + userName);
        System.out.println("FullName: " + fullName);
        System.out.println("Department: " + department.getDepartmentName());
        System.out.println("Position: " + position.getPositionName());
        System.out.println("Create Date: " + createDate);
        System.out.println("\n");
    }
}
