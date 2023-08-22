import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {


        Department dep1 = new Department();
        dep1.id = 1;
        dep1.name = "Marketing";
        Department dep2 = new Department();
        dep2.id = 2;
        dep2.name = "Sales";
        Department dep3 = new Department();
        dep3.id = 3;
        dep3.name = "Services";

        Position pos1 = new Position();
        pos1.id = 1;
        pos1.name = Position.PositionName.Dev;
        Position pos2 = new Position();
        pos2.id = 2;
        pos2.name = Position.PositionName.PM;
        Position pos3 = new Position();
        pos3.id = 3;
        pos3.name = Position.PositionName.Scrum_Master;

        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Testing System";
        Group group2 = new Group();
        group2.id = 2;
        group2.name = "Development";
        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Sales";

        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "qwsdasdsa@gmail.com";
        acc1.userName = "aczxsdsa";
        acc1.fullName = "wewasd dsawqe";
        acc1.department = dep1;
        acc1.position = pos1;
        acc1.createDate = LocalDate.now();
        Group[] groupAcc1 = {group1, group2};
        acc1.groups = groupAcc1;
        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "wqesafqwe@gmail.com";
        acc2.userName = "eqwasdrf";
        acc2.fullName = "arthur morgan";
        acc2.department = dep2;
        acc2.position = pos2;
        acc2.createDate = LocalDate.of(2021, 03, 17);
        acc2.groups = new Group[]{group3, group2};
        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "ewqsadsfa@gmail.com";
        acc3.userName = "wqeasdsada";
        acc3.fullName = "john marton";
        acc3.department = dep3;
        acc3.position = pos3;
        acc3.createDate = LocalDate.now();

        System.out.println("Account 3 ID : " + acc3.id + " Email: " + acc3.email + " UserName: " + acc3.userName + " FullName: " + acc3.fullName + " Department: " + acc3.department.name + " Position: " + acc3.position.name + " CreateDate: " + acc3.createDate);
    }
}