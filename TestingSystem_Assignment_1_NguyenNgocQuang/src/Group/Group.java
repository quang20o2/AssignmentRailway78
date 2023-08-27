package Group;

import Account.Account;

import java.time.LocalDate;



public class Group {
    private int groupID;
    private String groupName;
    private Account creatorID;
    private LocalDate createDate;

    // Constructor


    public Group(int groupID, String groupName, Account creatorID, LocalDate createDate) {
        this.groupID = groupID;
        this.groupName = groupName;
        this.creatorID = creatorID;
        this.createDate = createDate;
    }

    // Getter and Setter cho groupID
    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    // Getter and Setter cho groupName
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    // Getter and Setter cho creatorID
    public Account getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(Account creatorID) {
        this.creatorID = creatorID;
    }

    // Getter and Setter cho createDate
    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public void displayGroupDetails(){
        System.out.println("Group ID: " + groupID);
        System.out.println("Group Name: " + groupName);
        System.out.println("CreatorID: " + creatorID.getAccountID());
        System.out.println("CreateDate: " + createDate);
        System.out.println("\n");
    }
}
