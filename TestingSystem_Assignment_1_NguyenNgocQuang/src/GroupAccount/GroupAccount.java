package GroupAccount;

        import Account.Account;
        import Group.Group;


        import java.time.LocalDate;
        import java.util.ArrayList;

        import java.util.List;


public class GroupAccount {
    private Group groupID;
    private List<Account> accountList;
    private LocalDate joinDate;

    public GroupAccount() {
        accountList = new ArrayList<>();
    }

    // Constructor
    public GroupAccount(Group groupID, List<Account> accountList, LocalDate joinDate) {
        this.groupID = groupID;
        this.accountList = accountList;
        this.joinDate = joinDate;
    }

    // Getter and Setter cho groupID
    public Group getGroupID() {
        return groupID;
    }

    public void setGroupID(Group groupID) {
    this.groupID = groupID;
    }

    // Getter and Setter cho AccountList
    public List<Account> getAccountList() {

        return accountList;
    }

    public void setAccountList(List<Account> accountList) {

        this.accountList = accountList;
    }

    // Getter and Setter cho joinDate
    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }
}