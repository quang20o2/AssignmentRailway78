import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Department department1 = new Department();
        department1.Id = 1;
        department1.Name = "Sales";

        Department department2 = new Department();
        department2.Id = 2;
        department2.Name = "Marketing";

        Department department3 = new Department();
        department3.Id = 3;
        department3.Name = "Development";

        Position position1 = new Position();
        position1.Id = 1;
        position1.Name = PositionName.DEV;

        Position position2 = new Position();
        position2.Id = 2;
        position2.Name = PositionName.TEST;

        Position position3 = new Position();
        position3.Id = 3;
        position3.Name = PositionName.SCRUM_MASTER;

        Account account1 = new Account();
        account1.Id = 1;
        account1.Email = "user1@example.com";
        account1.UserName = "user1";
        account1.FullName = "User One";
        account1.DepartmentId = department3;
        account1.PositionId = position1;
        account1.CreateDate = new Date();

        Account account2 = new Account();
        account2.Id = 2;
        account2.Email = "user2@example.com";
        account2.UserName = "user2";
        account2.FullName = "User Two";
        account2.DepartmentId = department1;
        account2.PositionId = position2;
        account2.CreateDate = new Date();

        Account account3 = new Account();
        account3.Id = 3;
        account3.Email = "user3@example.com";
        account3.UserName = "user3";
        account3.FullName = "User Three";
        account3.DepartmentId = department2;
        account3.PositionId = position3;
        account3.CreateDate = new Date();

        //Print values
        System.out.println("Department 1 is " + department1.Name);
        System.out.println("Department 2 is " + department2.Name);
        System.out.println("Department 3 is " + department3.Name);
    }
}