package TestingSystem_Assignment_1_HoangTuanHung;

import java.time.LocalDate;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        // question 2
        // insert data for Department

        Department dep1 = new Department();
        dep1.DepartmentID = 1;
        dep1.DepartmentName = "Sale";

        Department dep2 = new Department();
        dep2.DepartmentID = 2;
        dep2.DepartmentName = "Marketing";

        Department dep3 = new Department();
        dep3.DepartmentID = 3;
        dep3.DepartmentName = "Accounting";

        // insert data for Position
        Position pt1 = new Position();
        pt1.PositionID = 1;
        pt1.PositionName = PositionName.PM;

        Position pt2 = new Position();
        pt2.PositionID = 2;
        pt2.PositionName = PositionName.DEV;

        Position pt3 = new Position();
        pt3.PositionID = 3;
        pt3.PositionName = PositionName.TEST;

        // insert data for Account
        Account ac1 = new Account();
        ac1.AccountID = 1;
        ac1.Email = "ac1@gmail.com";
        ac1.UserName = "ac1";
        ac1.FullName = "abc";
        ac1.DepartmentID = dep1;
        ac1.PositionID = pt1;
        ac1.CreateDate = LocalDate.of(2022, 11, 10);

        Account ac2 = new Account();
        ac2.AccountID = 2;
        ac2.Email = "ac2@gmail.com";
        ac2.UserName = "ac2";
        ac2.FullName = "def";
        ac2.DepartmentID = dep2;
        ac2.PositionID = pt2;
        ac2.CreateDate = LocalDate.of(2022, 12, 12);

        Account ac3 = new Account();
        ac3.AccountID = 3;
        ac3.Email = "ac3@gmail.com";
        ac3.UserName = "ac3";
        ac3.FullName = "ghi";
        ac3.DepartmentID = dep3;
        ac3.PositionID = pt3;
        ac3.CreateDate = LocalDate.of(2022, 10 ,10);

        // insert data for Group
        Group g1 = new Group();
        g1.GroupID = 1;
        g1.GroupName = "Group 1";
        g1.CreatorID = ac1;
        g1.CreateDate = LocalDate.of(2022, 11, 20);

        Group g2 = new Group();
        g2.GroupID = 2;
        g2.GroupName = "Group 2";
        g2.CreatorID = ac2;
        g2.CreateDate = LocalDate.of(2022, 12, 12);

        Group g3 = new Group();
        g3.GroupID = 3;
        g3.GroupName = "Group 3";
        g3.CreatorID = ac3;
        g3.CreateDate = LocalDate.of(2022, 10 ,10);

        // insert data for GroupAccount
        GroupAccount ga1 = new GroupAccount();
        ga1.GroupID = g1;
        ga1.AccountID = ac1;
        ga1.JoinDate = LocalDate.of(2022, 11, 25);

        GroupAccount ga2 = new GroupAccount();
        ga2.GroupID = g2;
        ga2.AccountID = ac2;
        ga2.JoinDate = LocalDate.of(2022, 12, 30);

        GroupAccount ga3 = new GroupAccount();
        ga3.GroupID = g3;
        ga3.AccountID = ac3;
        ga3.JoinDate = LocalDate.of(2022, 10, 25);

        // insert data for TypeQuestion
        TypeQuestion tp1 = new TypeQuestion();
        tp1.TypeID = 1;
        tp1.TypeName = TypeName.ESSAY;

        TypeQuestion tp2 = new TypeQuestion();
        tp2.TypeID = 2;
        tp2.TypeName = TypeName.MULTIPLE_CHOICE;

        TypeQuestion tp3 = new TypeQuestion();
        tp3.TypeID = 3;
        tp3.TypeName = TypeName.ESSAY;

        // insert data for CategoryQuestion
        CategoryQuestion cq1 = new CategoryQuestion();
        cq1.CategoryID = 1;
        cq1.CategoryName = CategoryName.JAVA;

        CategoryQuestion cq2 = new CategoryQuestion();
        cq2.CategoryID = 2;
        cq2.CategoryName = CategoryName.POSTMAN;

        CategoryQuestion cq3 = new CategoryQuestion();
        cq3.CategoryID = 3;
        cq3.CategoryName = CategoryName.SQL;

        // insert data for Question
        Question q1 = new Question();
        q1.QuestionID = 1;
        q1.Content = "Content 1";
        q1.CategoryID = cq1;
        q1.TypeID = tp1;
        q1.CreatorID = ac1;
        q1.CreateDate = LocalDate.of(2022, 11 , 30);

        Question q2 = new Question();
        q2.QuestionID = 2;
        q2.Content = "Content 2";
        q2.CategoryID = cq2;
        q2.TypeID = tp2;
        q2.CreatorID = ac2;
        q2.CreateDate = LocalDate.of(2023, 01, 01);

        Question q3 = new Question();
        q3.QuestionID = 3;
        q3.Content = "Content 3";
        q3.CategoryID = cq3;
        q3.TypeID = tp3;
        q3.CreatorID = ac3;
        q3.CreateDate = LocalDate.of(2022, 11, 01);

        // insert data for Answer
        Answer a1 = new Answer();
        a1.AnswerID = 1;
        a1.Content = "Answer 1";
        a1.QuestionID = q1;
        a1.isCorrect = true;

        Answer a2 = new Answer();
        a2.AnswerID = 2;
        a2.Content = "Answer 2";
        a2.QuestionID = q2;
        a2.isCorrect = false;

        Answer a3 = new Answer();
        a3.AnswerID = 3;
        a3.Content = "Answer 3";
        a3.QuestionID = q3;
        a3.isCorrect = false;

        // insert data for Exam
        Exam ex1 = new Exam();
        ex1.ExamID = 1;
        ex1.Code = "Ex1";
        ex1.Title = "Exam 1";
        ex1.Duration = 60;
        ex1.CreatorID = ac1;
        ex1.CreateDate = LocalDate.of(2022, 11 , 30);

        Exam ex2 = new Exam();
        ex2.ExamID = 2;
        ex2.Code = "Ex2";
        ex2.Title = "Exam 2";
        ex2.Duration = 180;
        ex2.CreatorID = ac2;
        ex2.CreateDate = LocalDate.of(2023, 01, 01);

        Exam ex3 = new Exam();
        ex3.ExamID = 3;
        ex3.Code = "Ex3";
        ex3.Title = "Exam 3";
        ex3.Duration = 120;
        ex3.CreatorID = ac3;
        ex3.CreateDate = LocalDate.of(2022, 11, 01);

        // insert data for ExamQuestion
        ExamQuestion eq1 = new ExamQuestion();
        eq1.ExamID = ex1;
        eq1.QuestionID = q1;

        ExamQuestion eq2 = new ExamQuestion();
        eq2.ExamID = ex2;
        eq2.QuestionID = q2;

        ExamQuestion eq3 = new ExamQuestion();
        eq3.ExamID = ex3;
        eq3.QuestionID = q3;

        // question 3
        System.out.println("Gia tri can in");
    }

}
