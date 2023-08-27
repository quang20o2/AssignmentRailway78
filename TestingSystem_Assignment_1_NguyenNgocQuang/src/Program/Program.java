package Program;

import Account.Account;
import Answer.Answer;
import CategoryQuestion.CategoryQuestion;
import Department.Department;
import Exam.Exam;
import ExamQuestion.ExamQuestion;
import Group.Group;
import GroupAccount.GroupAccount;
import Position.Position;
import Question.Question;
import TypeQuestion.TypeQuestion;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        //Department

        Department departmentSales = new Department(1, "Sales");
        Department departmentMarketing = new Department(2, "Marketing");
        Department departmentDevelop = new Department(3, "Develop");
        departmentDevelop.setDepartmentID(3);
        departmentDevelop.setDepartmentName("Develop");

        System.out.println("Thông tin phòng ban 1:");
        departmentSales.displayDepartmentDetails();


        //Position
        Position positionDev = new Position(1, "DEV");
        Position positionTest = new Position(2, "TEST");
        Position positionScrumMaster = new Position(3, "Scrum Master");
        Position positionPM = new Position(4, "PM");

        System.out.println("Position 1:");
        positionDev.displayPositionDetails();

        //Account

        List<Account> accountGroup1 = new ArrayList<>();
        List<Account> accountGroup2 = new ArrayList<>();
        List<Account> accountGroup3 = new ArrayList<>();
        List<Account> accountGroup4 = new ArrayList<>();
        List<Account> accountGroup5 = new ArrayList<>();

        Account account1 = new Account(1, "quangypro2002@gmail.com", "quang2oo2", "Nguyễn Ngọc Quang", departmentDevelop, positionDev, LocalDate.of(2023, 1, 1));
        Account account2 = new Account(3, "nguyenvana@gmail.com", "nguyenvanA", "Nguyễn Văn A ", departmentSales, positionScrumMaster, LocalDate.of(2023, 1, 4));
        Account account3 = new Account(2, "nguyenvanb@gmail.com", "nguyenvanB", "Nguyễn Văn B", departmentMarketing, positionPM, LocalDate.of(2023, 1, 5));
        Account account4 = new Account(4, "nguyenvanc@gmail.com", "nguyenvanC", "Nguyễn Văn C", departmentDevelop, positionTest, LocalDate.of(2023, 1, 8));

        account1.displayAccountDetails();


        accountGroup1.add(account1);
        accountGroup1.add(account2);
        accountGroup1.add(account3);
        accountGroup1.add(account4);

        accountGroup2.add(account2);
        accountGroup2.add(account1);
        accountGroup2.add(account4);

        accountGroup3.add(account3);
        accountGroup3.add(account2);
        accountGroup3.add(account1);

        accountGroup4.add(account4);
        accountGroup4.add(account1);

        accountGroup5.add(account4);
        accountGroup5.add(account2);


        //Group
        Group group1 = new Group(1, "Java group", account1, LocalDate.of(2023, 1, 10));
        Group group2 = new Group(2, "C# group", account4, LocalDate.of(2023, 1, 15));
        Group group3 = new Group(3, "PHP group", account3, LocalDate.of(2023, 01, 20));
        Group group4 = new Group(4, "Java fresher", account1, LocalDate.of(2023, 01, 22));
        Group group5 = new Group(5, "C# fresher", account2, LocalDate.of(2023, 01, 25));

        System.out.println("Thông tin Group:");
        group1.displayGroupDetails();

        //GroupAccount
        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.setGroupID(group1);
        groupAccount1.setAccountList(accountGroup1);
        groupAccount1.setJoinDate(LocalDate.of(2023, 01, 31));

        System.out.println("-Thông tin Account của group 1:");
        System.out.println("  +Group ID: " + groupAccount1.getGroupID().getGroupID());
        System.out.println("  +Group Name: " + groupAccount1.getGroupID().getGroupName());
        System.out.println("  +Số lượng Account: " + groupAccount1.getAccountList().size());
        System.out.print("\n");


        for (Account account : groupAccount1.getAccountList()) {
            System.out.println("     Account ID: " + account.getAccountID());
            System.out.println("     Email: " + account.getEmail());
            System.out.println("     Username: " + account.getUserName());
            System.out.println("     Full Name: " + account.getFullName());
            System.out.print("\n");
        }

        System.out.print("  +Join Date: " + groupAccount1.getJoinDate());
        System.out.println("\n");

        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.setGroupID(group2);
        groupAccount2.setAccountList(accountGroup2);
        groupAccount2.setJoinDate(LocalDate.of(2023, 01, 31));

        System.out.println("-Thông tin Account của group 2:");
        System.out.println("  +Group ID: " + groupAccount2.getGroupID().getGroupID());
        System.out.println("  +Group Name: " + groupAccount2.getGroupID().getGroupName());
        System.out.println("  +Số lượng Account: " + groupAccount2.getAccountList().size());
        System.out.print("\n");


        for (Account account : groupAccount2.getAccountList()) {
            System.out.println("     Account ID: " + account.getAccountID());
            System.out.println("     Email: " + account.getEmail());
            System.out.println("     Username: " + account.getUserName());
            System.out.println("     Full Name: " + account.getFullName());
            System.out.print("\n");
        }

        System.out.print("  +Join Date: " + groupAccount2.getJoinDate());
        System.out.println("\n");

        GroupAccount groupAccount3 = new GroupAccount();
        groupAccount3.setGroupID(group3);
        groupAccount3.setAccountList(accountGroup3);
        groupAccount3.setJoinDate(LocalDate.of(2023, 01, 31));

        System.out.println("-Thông tin Account của group 3:");
        System.out.println("  +Group ID: " + groupAccount3.getGroupID().getGroupID());
        System.out.println("  +Group Name: " + groupAccount3.getGroupID().getGroupName());
        System.out.println("  +Số lượng Account: " + groupAccount3.getAccountList().size());
        System.out.print("\n");


        for (Account account : groupAccount2.getAccountList()) {
            System.out.println("     Account ID: " + account.getAccountID());
            System.out.println("     Email: " + account.getEmail());
            System.out.println("     Username: " + account.getUserName());
            System.out.println("     Full Name: " + account.getFullName());
            System.out.print("\n");
        }

        System.out.print("  +Join Date: " + groupAccount3.getJoinDate());
        System.out.println("\n");

        GroupAccount groupAccount4 = new GroupAccount();
        groupAccount4.setGroupID(group4);
        groupAccount4.setAccountList(accountGroup3);
        groupAccount4.setJoinDate(LocalDate.of(2023, 01, 31));

        System.out.println("-Thông tin Account của group 4:");
        System.out.println("  +Group ID: " + groupAccount4.getGroupID().getGroupID());
        System.out.println("  +Group Name: " + groupAccount4.getGroupID().getGroupName());
        System.out.println("  +Số lượng Account: " + groupAccount4.getAccountList().size());
        System.out.print("\n");


        for (Account account : groupAccount4.getAccountList()) {
            System.out.println("     Account ID: " + account.getAccountID());
            System.out.println("     Email: " + account.getEmail());
            System.out.println("     Username: " + account.getUserName());
            System.out.println("     Full Name: " + account.getFullName());
            System.out.print("\n");
        }

        System.out.print("  +Join Date: " + groupAccount4.getJoinDate());
        System.out.println("\n");

        GroupAccount groupAccount5 = new GroupAccount();
        groupAccount5.setGroupID(group5);
        groupAccount5.setAccountList(accountGroup3);
        groupAccount5.setJoinDate(LocalDate.of(2023, 01, 31));

        System.out.println("-Thông tin Account của group 5:");
        System.out.println("  +Group ID: " + groupAccount5.getGroupID().getGroupID());
        System.out.println("  +Group Name: " + groupAccount5.getGroupID().getGroupName());
        System.out.println("  +Số lượng Account: " + groupAccount5.getAccountList().size());
        System.out.print("\n");


        for (Account account : groupAccount5.getAccountList()) {
            System.out.println("     Account ID: " + account.getAccountID());
            System.out.println("     Email: " + account.getEmail());
            System.out.println("     Username: " + account.getUserName());
            System.out.println("     Full Name: " + account.getFullName());
            System.out.print("\n");
        }

        System.out.print("  +Join Date: " + groupAccount5.getJoinDate());
        System.out.print("\n");

        //TypeQuestion
        TypeQuestion typeQuestion1 = new TypeQuestion(1, "Essay");
        TypeQuestion typeQuestion2 = new TypeQuestion(2, "Multiple-Choice");

        System.out.println("Kiểu câu hỏi: ");
        typeQuestion1.displayTypeQuestionDetails();

        //CategoryQuestion
        CategoryQuestion categoryQuestion1 = new CategoryQuestion(1, "Java");
        CategoryQuestion categoryQuestion2 = new CategoryQuestion(2, ".NET");
        CategoryQuestion categoryQuestion3 = new CategoryQuestion(3, "Postman");
        CategoryQuestion categoryQuestion4 = new CategoryQuestion(4, "Ruby");

        System.out.println("Thông tin chủ đề câu hỏi:");
        categoryQuestion1.displayCategoryQuestionDetails();
        categoryQuestion2.displayCategoryQuestionDetails();
        categoryQuestion3.displayCategoryQuestionDetails();
        categoryQuestion4.displayCategoryQuestionDetails();

        //Question
        List<Question> examQuestion1 = new ArrayList<>();
        List<Question> examQuestion2 = new ArrayList<>();
        List<Question> examQuestion3 = new ArrayList<>();
        List<Question> examQuestion4 = new ArrayList<>();

        Question question1 = new Question(1, "Java là gì?", categoryQuestion1, typeQuestion1, account1, LocalDate.of(2023, 8, 1));
        Question question2 = new Question(2, ".NET là gì?", categoryQuestion2, typeQuestion1, account2, LocalDate.of(2023, 8, 4));
        Question question3 = new Question(3, "Postman là gì?", categoryQuestion3, typeQuestion1, account3, LocalDate.of(2023, 8, 5));
        Question question4 = new Question(4, "Ruby là gì?", categoryQuestion4, typeQuestion1, account4, LocalDate.of(2023, 8, 5));
        Question question5 = new Question(5, "Classloader trong java là gì?", categoryQuestion1, typeQuestion2, account1, LocalDate.of(2023, 8, 2));
        Question question6 = new Question(6, ".NET hỗ trợ bao nhiêu ngôn ngữ?", categoryQuestion2, typeQuestion2, account2, LocalDate.of(2023, 8, 3));
        Question question7 = new Question(7, "API Testing là gì?", categoryQuestion3, typeQuestion2, account3, LocalDate.of(2023, 8, 3));
        Question question8 = new Question(8, "ActiveRecord là gì?", categoryQuestion4, typeQuestion2, account4, LocalDate.of(2023, 8, 2));

        examQuestion1.add(question1);
        examQuestion1.add(question5);
        examQuestion2.add(question2);
        examQuestion2.add(question6);
        examQuestion3.add(question3);
        examQuestion3.add(question7);
        examQuestion4.add(question4);
        examQuestion4.add(question8);

        System.out.println("Thông tin câu hỏi:");
        question1.displayQuestionDetails();
        question2.displayQuestionDetails();
        question3.displayQuestionDetails();
        question4.displayQuestionDetails();
        question5.displayQuestionDetails();
        question6.displayQuestionDetails();
        question7.displayQuestionDetails();
        question8.displayQuestionDetails();

        //Answer
        Answer answer1 = new Answer(1, "Java là một ngôn ngữ lập trình được sử dụng rộng rãi để viết mã cho các ứng dụng web.", question1, true);
        Answer answer2 = new Answer(2, "Java là một nền tảng lập trình được phát triển bởi Microsoft, chạy trên hệ điều hành Microsoft Window.", question1, false);
        Answer answer3 = new Answer(3, "Java là một ngôn ngữ lập trình được sử dụng rộng rãi để viết mã cho các ứng dụng web.", question1, true);
        Answer answer4 = new Answer(4, ".NET là một nền tảng lập trình được phát triển bởi Microsoft, chạy trên hệ điều hành Microsoft Window.", question2, true);
        Answer answer5 = new Answer(5, ".NET là một công cụ cho phép chúng ta thao tác với API, phổ biến nhất là REST.", question2, false);
        Answer answer6 = new Answer(6, ".NET là một trong những ngôn ngữ lập trình phổ có cấu trúc theo dạng trình hướng đối ngoại và lập trình viên có thể linh hoạt thay đổi các yếu tố cần thiết.", question2, false);
        Answer answer7 = new Answer(7, "Postman là một công cụ cho phép chúng ta thao tác với API, phổ biến nhất là REST.", question3, true);
        Answer answer8 = new Answer(8, "Postman là một nền tảng lập trình được phát triển bởi Microsoft, chạy trên hệ điều hành Microsoft Window.", question3, false);
        Answer answer9 = new Answer(9, "Postman là một ngôn ngữ lập trình được sử dụng rộng rãi để viết mã cho các ứng dụng web.", question3, false);
        Answer answer10 = new Answer(10, "Ruby là một trong những ngôn ngữ lập trình phổ có cấu trúc theo dạng trình hướng đối ngoại và lập trình viên có thể linh hoạt thay đổi các yếu tố cần thiết.", question4, true);
        Answer answer11 = new Answer(11, "Ruby là một nền tảng lập trình được phát triển bởi Microsoft, chạy trên hệ điều hành Microsoft Window.", question4, false);
        Answer answer12 = new Answer(12, "Ruby là một công cụ cho phép chúng ta thao tác với API, phổ biến nhất là REST.", question4, false);
        Answer answer13 = new Answer(13, "Classloader là một hệ thống con của JVM được sử dụng để tải các lớp và các interface.", question5, true);
        Answer answer14 = new Answer(14, "Classloader là một công cụ cho phép chúng ta thao tác với API, phổ biến nhất là REST.", question5, false);
        Answer answer15 = new Answer(15, "Classloader là một ngôn ngữ lập trình được sử dụng rộng rãi để viết mã cho các ứng dụng web.", question5, false);
        Answer answer16 = new Answer(16, ".NET hỗ trợ 44 ngôn ngữ khác nhau.", question6, true);
        Answer answer17 = new Answer(17, ".NET hỗ trợ 40 ngôn ngữ khác nhau.", question6, false);
        Answer answer18 = new Answer(18, ".NET hỗ trợ 43 ngôn ngữ khác nhau.", question6, false);
        Answer answer19 = new Answer(19, "API Testing hay kiểm thử API là hoạt động kiểm thử giao diện lập trình ứng dụng trực tiếp mà không tác động gì tới client.", question7, true);
        Answer answer20 = new Answer(20, "API Testing là một nền tảng lập trình được phát triển bởi Microsoft, chạy trên hệ điều hành Microsoft Window.", question7, false);
        Answer answer21 = new Answer(21, "API Testing là một ngôn ngữ lập trình được sử dụng rộng rãi để viết mã cho các ứng dụng web.", question7, false);
        Answer answer22 = new Answer(22, "là 1 ruby gem đóng vai trò là ORM", question8, true);
        Answer answer23 = new Answer(23, "là 1 ruby gem đóng vai trò là ORM", question8, true);
        Answer answer24 = new Answer(24, "là 1 ruby gem đóng vai trò là ORM", question8, true);

        System.out.println("Thông tin câu trả lời");
        answer1.displayAnswerDetails();
        answer2.displayAnswerDetails();

        //Exam
        Exam exam1 = new Exam(1, "ex1", "Java fresher", categoryQuestion1, 30, account1, LocalDate.of(2023, 8, 20));
        Exam exam2 = new Exam(2, "ex2", ".NET fresher", categoryQuestion2, 30, account1, LocalDate.of(2023, 8, 20));
        Exam exam3 = new Exam(3, "ex3", "Postman fresher", categoryQuestion3, 30, account1, LocalDate.of(2023, 8, 20));
        Exam exam4 = new Exam(4, "ex4", "Ruby fresher", categoryQuestion4, 30, account1, LocalDate.of(2023, 8, 20));

        System.out.println("Thông tin đề thi:");
        exam1.displayExamDetails();
        exam2.displayExamDetails();
        exam3.displayExamDetails();
        exam4.displayExamDetails();

        //ExamQuestion
        ExamQuestion examQuestionJava = new ExamQuestion(exam1, examQuestion1);
        ExamQuestion examQuestionDotNET = new ExamQuestion(exam2, examQuestion2);
        ExamQuestion examQuestionPostman = new ExamQuestion(exam3, examQuestion3);
        ExamQuestion examQuestionRuby = new ExamQuestion(exam4, examQuestion4);

        System.out.println("Thông tin câu hỏi thi:");
        examQuestionJava.displayExamQuestionDetails();
        examQuestionDotNET.displayExamQuestionDetails();
        examQuestionPostman.displayExamQuestionDetails();
        examQuestionRuby.displayExamQuestionDetails();
    }
}
