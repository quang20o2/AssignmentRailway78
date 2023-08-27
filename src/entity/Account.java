package entity;

import java.time.LocalDate;
import java.util.Date;

public class Account {
    public int id;
    public String eMail;
    public String userName;
    public String fullName;
    public Department department;
    public Position position;
    public LocalDate createDate;
    public Group[] groups;

}
