package backend;

import entity.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        // Tao ra cac entity.Department

        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Sale";

        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Maketing";

        Department department3 = new Department();
        department3.id = 3;
        department3.name = "Admin";

        Department department4 = new Department();
        department4.id = 4;
        department4.name = "Development";

        Department department5 = new Department();
        department5.id = 5;
        department5.name = "Security";

        // Tao ra cac position

        Position position1 = new Position();
        position1.id = 1;
        position1.name = PositionName.DEV;

        Position position2 = new Position();
        position2.id = 2;
        position2.name = PositionName.TEST;

        Position position3 = new Position();
        position3.id = 3;
        position3.name = PositionName.SCRUM_MASTER;

        Position position4 = new Position();
        position4.id = 4;
        position4.name = PositionName.PM;

        // Tao ra cac account

        Account account1 = new Account();
        account1.id = 1;
        account1.eMail = "nnc1@gmail.com";
        account1.userName = "nnc1";
        account1.fullName = "Nguyen Ngoc Cong";
        account1.department = department4;
        account1.position = position1;
        account1.createDate = LocalDate.of(2020, 12, 20);

        Account account2 = new Account();
        account2.id = 2;
        account2.eMail = "lkt@gmail.com";
        account2.userName = "lkt1";
        account2.fullName = "Le Kien Tran";
        account2.department = department4;
        account2.position = position1;
        account2.createDate = LocalDate.of(2020, 2, 22);

        Account account3 = new Account();
        account3.id = 3;
        account3.eMail = "npn@gmail.com";
        account3.userName = "npn";
        account3.fullName = "nguyen Phuong Nam";
        account3.department = department2;
        account3.position = position2;
        account3.createDate = LocalDate.of(2020, 4, 12);

        Account account4 = new Account();
        account4.id = 4;
        account4.eMail = "ddv@gmail.com";
        account4.userName = "ddv";
        account4.fullName = "Duong Dinh Van";
        account4.department = department2;
        account4.position = position2;
        account4.createDate = LocalDate.of(2021, 8, 28);

        Account account5 = new Account();
        account5.id = 5;
        account5.eMail = "nvt@gmail.com";
        account5.userName = "nvt";
        account5.fullName = "Nguyen Van Truong";
        account5.department = department1;
        account5.position = position3;
        account5.createDate = LocalDate.of(2021, 7, 15);

        Account account6 = new Account();
        account6.id = 6;
        account6.eMail = "hth@gmail.com";
        account6.userName = "hth";
        account6.fullName = "Hoang Tuan Hung";
        account6.department = department1;
        account6.position = position3;
        account6.createDate = LocalDate.of(2022, 2, 2);

        Account account7 = new Account();
        account7.id = 7;
        account7.eMail = "pnk@gmail.com";
        account7.userName = "pnk1";
        account7.fullName = "Pham Ngoc Khanh";
        account7.department = department3;
        account7.position = position4;
        account7.createDate = LocalDate.of(2022, 2, 22);

        Account account8 = new Account();
        account8.id = 8;
        account8.eMail = "nnq@gmail.com";
        account8.userName = "nnq1";
        account8.fullName = "Nguyen Ngoc Quang";
        account8.department = department3;
        account8.position = position4;
        account8.createDate = LocalDate.of(2023, 1, 15);

        Account account9 = new Account();
        account9.id = 9;
        account9.eMail = "lvc@gmail.com";
        account9.userName = "lvc1";
        account9.fullName = "Le Van Chinh";
        account9.department = department5;
        account9.position = position1;
        account9.createDate = LocalDate.of(2020, 8, 12);

        Account account10 = new Account();
        account10.id = 10;
        account10.eMail = "pvd@gmail.com";
        account10.userName = "pvd1";
        account10.fullName = "Phan van Duc";
        account10.department = department5;
        account10.position = position2;
        account10.createDate = LocalDate.of(2022, 4, 18);

        // them gia tri cho group

        Group group1 = new Group();
        group1.id = 1;
        group1.name = "entity.Group 1";
        group1.creator = account1;
        group1.createDate = LocalDate.of(2022, 5, 19);
        Account[] group1Accounts = new Account[3];
        group1Accounts[0] = account1;
        group1Accounts[1] = account2;
        group1Accounts[2] = account3;
        group1.accounts = group1Accounts;

        Group group2 = new Group();
        group2.id = 2;
        group2.name = "entity.Group 2";
        group2.creator = account2;
        group2.createDate = LocalDate.of(2022, 1, 10);
        Account[] group2Accounts = new Account[4];
        group2Accounts[0] = account1;
        group2Accounts[1] = account4;
        group2Accounts[2] = account6;
        group2Accounts[3] = account7;
        group2.accounts = group2Accounts;

        Group group3 = new Group();
        group3.id = 3;
        group3.name = "entity.Group 3";
        group3.creator = account3;
        group3.createDate = LocalDate.of(2021, 10, 10);
        Account[] group3Accounts = new Account[5];
        group3Accounts[0] = account4;
        group3Accounts[1] = account5;
        group3Accounts[2] = account7;
        group3Accounts[3] = account9;
        group3Accounts[4] = account10;
        group3.accounts = group3Accounts;

        // Them gia tri cho entity.GroupAccount

        Group[] account1Groups = new Group[2];
        account1Groups[0] = group1;
        account1Groups[1] = group2;
        account1.groups = account1Groups;

        Group[] account2Groups = new Group[1];
        account2Groups[0] = group1;
        account2.groups = account2Groups;


        Group[] account3Groups = new Group[1];
        account3Groups[0] = group1;
        account3.groups = account3Groups;

        Group[] account4Groups = new Group[2];
        account4Groups[0] = group2;
        account4Groups[1] = group3;
        account4.groups = account4Groups;

        Group[] account5Groups = new Group[1];
        account5Groups[0] = group3;
        account5.groups = account5Groups;

        Group[] account6Groups = new Group[1];
        account6Groups[0] = group2;
        account6.groups = account6Groups;

        Group[] account7Groups = new Group[2];
        account7Groups[0] = group2;
        account7Groups[1] = group3;
        account7.groups = account7Groups;

        Group[] account9Groups = new Group[1];
        account9Groups[0] = group3;
        account9.groups = account9Groups;

        Group[] account10Groups = new Group[1];
        account10Groups[0] = group3;
        account10.groups = account10Groups;


        // Them gia tri cho typequestion

        TypeQuestion typeQuestion1 = new TypeQuestion();
        typeQuestion1.id = 1;
        typeQuestion1.name = TypeName.ESSAY;

        TypeQuestion typeQuestion2 = new TypeQuestion();
        typeQuestion2.id = 2;
        typeQuestion2.name = TypeName.MULTIPLE_CHOICE;

        // Them gia tri cho entity.CategoryQuestion

        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.id = 1;
        categoryQuestion1.name = "Java";

        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        categoryQuestion2.id = 2;
        categoryQuestion2.name = ".NET";

        CategoryQuestion categoryQuestion3 = new CategoryQuestion();
        categoryQuestion3.id = 3;
        categoryQuestion3.name = "SQL";

        CategoryQuestion categoryQuestion4 = new CategoryQuestion();
        categoryQuestion4.id = 4;
        categoryQuestion4.name = "Postman";

        CategoryQuestion categoryQuestion5 = new CategoryQuestion();
        categoryQuestion5.id = 5;
        categoryQuestion5.name = "Ruby";

        CategoryQuestion categoryQuestion6 = new CategoryQuestion();
        categoryQuestion6.id = 6;
        categoryQuestion6.name = "PHP";

        // Them gia tri cho entity.Question

        Question question1 = new Question();
        question1.id = 1;
        question1.content = "entity.Question 1?";
        question1.category = categoryQuestion1;
        question1.typeQuestion = typeQuestion1;
        question1.creator = account9;
        question1.createDate = LocalDate.of(2021, 12, 10);

        Question question2 = new Question();
        question2.id = 2;
        question2.content = "entity.Question 2?";
        question2.category = categoryQuestion2;
        question2.typeQuestion = typeQuestion2;
        question2.creator = account1;
        question2.createDate = LocalDate.of(2022, 10, 10);

        Question question3 = new Question();
        question3.id = 3;
        question3.content = "entity.Question 3?";
        question3.category = categoryQuestion3;
        question3.typeQuestion = typeQuestion2;
        question3.creator = account2;
        question3.createDate = LocalDate.of(2022, 11, 20);

        Question question4 = new Question();
        question4.id = 4;
        question4.content = "entity.Question 4?";
        question4.category = categoryQuestion4;
        question4.typeQuestion = typeQuestion1;
        question4.creator = account5;
        question4.createDate = LocalDate.of(2021, 1, 20);

        Question question5 = new Question();
        question5.id = 5;
        question5.content = "entity.Question 5?";
        question5.category = categoryQuestion5;
        question5.typeQuestion = typeQuestion1;
        question5.creator = account10;
        question5.createDate = LocalDate.of(2022, 10, 20);

        Question question6 = new Question();
        question6.id = 5;
        question6.content = "entity.Question 6?";
        question6.category = categoryQuestion6;
        question6.typeQuestion = typeQuestion2;
        question6.creator = account7;
        question6.createDate = LocalDate.of(2022, 5, 18);

        // Them gia tri answer

        Answer answer1 = new Answer();
        answer1.id = 1;
        answer1.content = "entity.Answer 1.";
        answer1.question = question1;
        answer1.isCorrect = true;

        Answer answer2 = new Answer();
        answer2.id = 2;
        answer2.content = "entity.Answer 2.";
        answer2.question = question2;
        answer2.isCorrect = true;

        Answer answer3 = new Answer();
        answer3.id = 3;
        answer3.content = "entity.Answer 3.";
        answer3.question = question3;
        answer3.isCorrect = false;

        Answer answer4 = new Answer();
        answer4.id = 4;
        answer4.content = "entity.Answer 4.";
        answer4.question = question4;
        answer4.isCorrect = false;

        Answer answer5 = new Answer();
        answer5.id = 5;
        answer5.content = "entity.Answer 5.";
        answer5.question = question5;
        answer5.isCorrect = true;

        Answer answer6 = new Answer();
        answer6.id = 6;
        answer6.content = "entity.Answer 6.";
        answer6.question = question6;
        answer6.isCorrect = true;

        Answer answer7 = new Answer();
        answer7.id = 7;
        answer7.content = "entity.Answer 7.";
        answer7.question = question1;
        answer7.isCorrect = false;

        Answer answer8 = new Answer();
        answer8.id = 8;
        answer8.content = "entity.Answer 8.";
        answer8.question = question2;
        answer8.isCorrect = false;

        // Them gia tri exam

        Exam exam1 = new Exam();
        exam1.id = 1;
        exam1.code = "Railway78_1";
        exam1.title = "title1";
        exam1.categoryQuestion = categoryQuestion1;
        exam1.duration = 120;
        exam1.creator = account1;
        exam1.createDate = LocalDate.of(2022, 5, 17);
        exam1.birthDay = new Date(2022, 10, 10);

        Exam exam2 = new Exam();
        exam2.id = 2;
        exam2.code = "Railway78_2";
        exam2.title = "title2";
        exam2.categoryQuestion = categoryQuestion2;
        exam2.duration = 180;
        exam2.creator = account2;
        exam2.createDate = LocalDate.of(2022, 6, 10);

        Exam exam3 = new Exam();
        exam3.id = 3;
        exam3.code = "Railway78_3";
        exam3.title = "title3";
        exam3.categoryQuestion = categoryQuestion1;
        exam3.duration = 90;
        exam3.creator = account3;
        exam3.createDate = LocalDate.of(2022, 9, 20);

        Exam exam4 = new Exam();
        exam4.id = 4;
        exam4.code = "Railway78_4";
        exam4.title = "title4";
        exam4.categoryQuestion = categoryQuestion1;
        exam4.duration = 60;
        exam4.creator = account4;
        exam4.createDate = LocalDate.of(2022, 10, 15);

        // In thong tin

        System.out.println("Thong tin phong ban so 1:");
        System.out.println("ID: " + department1.id);
        System.out.println("Ten phong ban: " + department1.name);

        System.out.println("*****************************************");

        System.out.println("Thong tin phong ban so 2:");
        System.out.println("ID: " + department2.id);
        System.out.println("Ten phong ban: " + department2.name);
        System.out.println("*****************************************");

        System.out.println("Thong tin vi tri so 1:");
        System.out.println("ID: " + position1.id);
        System.out.println("Ten phong ban: " + position1.name);
        System.out.println("*****************************************");

        System.out.println("Thong tin vi tri so 2:");
        System.out.println("ID: " + position2.id);
        System.out.println("Ten phong ban: " + position2.name);
        System.out.println("*****************************************");

        System.out.println("Thong tin account1:");
        System.out.println("ID: " + account1.id);
        System.out.println("Email: " + account1.eMail);
        System.out.println("Username: " + account1.userName);
        System.out.println("Fullname: " + account1.fullName);
        System.out.println("entity.Department: " + account1.department.name);
        System.out.println("entity.Position: " + account1.position.name);
        System.out.println("Createdate: " + account1.createDate);
        System.out.println("*****************************************");

        System.out.println("Thong tin account2:");
        System.out.println("ID: " + account2.id);
        System.out.println("Email: " + account2.eMail);
        System.out.println("Username: " + account2.userName);
        System.out.println("Fullname: " + account2.fullName);
        System.out.println("entity.Department: " + account2.department.name);
        System.out.println("entity.Position: " + account2.position.name);
        System.out.println("Createdate: " + account2.createDate);
        System.out.println("*****************************************");

        System.out.println("Thong tin account3:");
        System.out.println("ID: " + account3.id);
        System.out.println("Email: " + account3.eMail);
        System.out.println("Username: " + account3.userName);
        System.out.println("Fullname: " + account3.fullName);
        System.out.println("entity.Department: " + account3.department.name);
        System.out.println("entity.Position: " + account3.position.name);
        System.out.println("Createdate: " + account3.createDate);
        System.out.println("*****************************************");

        System.out.println("Thong tin entity.Group so 1:");
        System.out.println("ID: " + group1.id);
        System.out.println("Ten entity.Group: " + group1.name);
        System.out.println("*****************************************");

        System.out.println("Thong tin entity.Group so 2:");
        System.out.println("ID: " + group2.id);
        System.out.println("Ten entity.Group: " + group2.name);
        System.out.println("*****************************************");

        System.out.println("Thong tin entity.TypeQuestion 1:");
        System.out.println("ID: " + typeQuestion1.id);
        System.out.println("Ten Type: " + typeQuestion1.name);
        System.out.println("*****************************************");

        System.out.println("Thong tin entity.TypeQuestion 2:");
        System.out.println("ID: " + typeQuestion2.id);
        System.out.println("Ten Type: " + typeQuestion2.name);
        System.out.println("*****************************************");

        System.out.println("Thong tin entity.CategoryQuestion 1:");
        System.out.println("ID: " + categoryQuestion1.id);
        System.out.println("Ten Category: " + categoryQuestion1.name);
        System.out.println("*****************************************");

        System.out.println("Thong tin entity.CategoryQuestion 2:");
        System.out.println("ID: " + categoryQuestion2.id);
        System.out.println("Ten Category: " + categoryQuestion2.name);
        System.out.println("*****************************************");


        System.out.println("Thong tin entity.CategoryQuestion 3:");
        System.out.println("ID: " + categoryQuestion3.id);
        System.out.println("Ten Category: " + categoryQuestion3.name);
        System.out.println("*****************************************");

        System.out.println("Thong tin entity.Question 1:");
        System.out.println("ID: " + question1.id);
        System.out.println("Content: " + question1.content);
        System.out.println("Category: " + question1.category.id);
        System.out.println("TypequestionID: " + question1.typeQuestion.id);
        System.out.println("Creator: " + question1.creator.fullName);
        System.out.println("CreateDate: " + question1.createDate);
        System.out.println("*****************************************");

        System.out.println("Thong tin entity.Question 2:");
        System.out.println("ID: " + question2.id);
        System.out.println("Content: " + question2.content);
        System.out.println("Category: " + question2.category.id);
        System.out.println("TypequestionID: " + question2.typeQuestion.id);
        System.out.println("Creator: " + question2.creator.fullName);
        System.out.println("CreateDate: " + question2.createDate);
        System.out.println("*****************************************");

        System.out.println("Thong tin entity.Answer 1:");
        System.out.println("ID: " + answer1.id);
        System.out.println("Content: " + answer1.content);
        System.out.println("entity.Question: " + answer1.question.content);
        System.out.println("isCorrect: " + answer1.isCorrect);
        System.out.println("*****************************************");

        System.out.println("Thong tin entity.Answer 2:");
        System.out.println("ID: " + answer2.id);
        System.out.println("Content: " + answer2.content);
        System.out.println("entity.Question: " + answer2.question.content);
        System.out.println("isCorrect: " + answer2.isCorrect);
        System.out.println("*****************************************");


        System.out.println("Thong tin entity.Exam 1:");
        System.out.println("ID: " + exam1.id);
        System.out.println("Code: " + exam1.code);
        System.out.println("Title: " + exam1.title);
        System.out.println("Category: " + exam1.categoryQuestion.id);
        System.out.println("Duration: " + exam1.duration);
        System.out.println("Creator: " + exam1.creator.fullName);
        System.out.println("CreateDate: " + exam1.createDate);
        System.out.println(" birthDay:" + exam1.birthDay);
        System.out.println("*****************************************");

        System.out.println("Thong tin entity.Exam 2:");
        System.out.println("ID: " + exam2.id);
        System.out.println("Code: " + exam2.code);
        System.out.println("Title: " + exam2.title);
        System.out.println("Category: " + exam2.categoryQuestion.id);
        System.out.println("Duration: " + exam2.duration);
        System.out.println("Creator: " + exam2.creator.fullName);
        System.out.println("CreateDate: " + exam2.createDate);
        System.out.println("*****************************************");


        // Flow Control IF

        /*
        entity.Question 1:
                    Kiểm tra account thứ 2
                    Nếu không có phòng ban (tức là department == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban"
                    Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"
         */

        System.out.println("*********entity.Question 1********************");

        if (account2.department == null) {
            System.out.println("Nhan vien nay chua co phong ban ");
        } else {
            System.out.println("entity.Department cua nhan vien nay la:  " + account2.department.name);
        }
        System.out.println("*********entity.Question 2********************");
        /*
        entity.Question 2:
                    Kiểm tra account thứ 2
                    Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
                    Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "entity.Group của nhân viên này là Java Fresher, C# Fresher"
                    Nếu có mặt trong 3 entity.Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều group"
                    Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là người hóng chuyện, tham gia tất cả các group"
         */
        if (account2.groups.length == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else if (account2.groups.length <= 2) {
            System.out.println("entity.Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (account2.groups.length == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }

        System.out.println("*********entity.Question 3********************");

        // entity.Question 3: Sử dụng toán tử ternary để làm entity.Question 1


        System.out.println("***** Toan tu tenary******");
        System.out.println(account2.department == null ? "Nhan vien nay chua co phong ban" : "entity.Department cua nhan vien nay la:  " + account2.department.name);

        /*
        entity.Question 4:
            Sử dụng toán tử ternary để làm yêu cầu sau:
            Kiểm tra entity.Position của account thứ 1
            Nếu entity.Position = Dev thì in ra text "Đây là Developer"
            Nếu không phải thì in ra text "Người này không phải là Developer"
        */

        System.out.println("*********entity.Question 4********************");

        System.out.println(account1.position.name == PositionName.DEV ? "Đây là Developer" : "Người này không phải là Developer");
        /*
        entity.Question 5:
        Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
        Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
        Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
        Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
        Còn lại in ra "Nhóm có nhiều thành viên"
         */

        System.out.println("*********entity.Question 5********************");

        System.out.println("mang 1" + Arrays.toString(group1Accounts));
        System.out.println("mang 1" + Arrays.toString(group2Accounts));
        switch (group1Accounts.length) {
            case 0:
                System.out.println("Nhóm  khong có thành viên");
                break;
            case 1:
                System.out.println("Nhóm có mot thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
        }

        // entity.Question 6:Sử dụng switch case để làm lại entity.Question 2

        System.out.println("--------entity.Question 6----------");

        switch (account2Groups.length) {
            case 0:
                System.out.println("Nhân viên này chưa có group");
                break;
            case 1:
            case 2:
                System.out.println("entity.Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            default:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");

        }

        // entity.Question 7:Sử dụng switch case để làm lại entity.Question 4

        System.out.println("--------entity.Question 7----------");
        switch (account1.position.name) {
            case DEV:
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");
        }


        // FOREACH
        // entity.Question 8: In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ

        System.out.println("--------entity.Question 8----------");

        Account[] accArray = {account1, account2, account3, account4, account5, account6, account7, account8, account9, account10};
        for (int i = 0; i < accArray.length; i++) {
            System.out.println(" Nhan vien thu " + (i + 1) + ": ");
            System.out.println("Email: " + accArray[i].eMail);
            System.out.println("Fullname: " + accArray[i].fullName);
            System.out.println("Phong ban: " + accArray[i].department.name);
        }

        // entity.Question 9: In ra thông tin các phòng ban bao gồm: id và name

        System.out.println("--------entity.Question 9----------");

        Department[] deps = {department1, department2, department3, department4, department5};

        for (int j = 0; j < deps.length; j++) {

            System.out.println(" Phong ban thu " + (j + 1) + ":");
            System.out.println("ID: " + deps[j].id);
            System.out.println("Name: " + deps[j].name);
        }
        // FOREACH
        // entity.Question 10: In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ theo định dạng như sau:
        /*
        Thông tin account thứ 1 là:
        Email: NguyenVanA@gmail.com
        Full name: Nguyễn Văn A
        Phòng ban: Sale
        Thông tin account thứ 2 là:
        Email: NguyenVanB@gmail.com
        Full name: Nguyễn Văn B
        Phòng ban: Marketting
         */
        System.out.println("--------entity.Question 10----------");


        for (int i = 0; i < accArray.length; i++) {
            System.out.println(" Thong tin account thu  " + (i + 1) + " la : ");
            System.out.println("Email: " + accArray[i].eMail);
            System.out.println("Fullname: " + accArray[i].fullName);
            System.out.println("Phong ban: " + accArray[i].department.name);
        }

            /*
            entity.Question 11:
            In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
            Thông tin department thứ 1 là:
            Id: 1
            Name: Sale
            Thông tin department thứ 2 là:
            Id: 2
            Name: Marketing
             */
        System.out.println("--------entity.Question 11----------");


        for (int j = 0; j < deps.length; j++) {

            System.out.println(" Thong tin department thu " + (j + 1) + " la :");
            System.out.println("ID: " + deps[j].id);
            System.out.println("Name: " + deps[j].name);
        }

        //entity.Question 12: Chỉ in ra thông tin 2 account đầu tiên theo định dạng như entity.Question 10

        System.out.println("--------entity.Question 12----------");

        for (int i = 0; i < 2; i++) {
            System.out.println(" Thong tin account thu  " + (i + 1) + " la : ");
            System.out.println("Email: " + accArray[i].eMail);
            System.out.println("Fullname: " + accArray[i].fullName);
            System.out.println("Phong ban: " + accArray[i].department.name);
        }

        // entity.Question 13: In ra thông tin tất cả các account ngoại trừ account thứ 2

        System.out.println("--------entity.Question 13----------");

        for (int k = 0; k < accArray.length; k++) {
            if (k == 1) {
                continue;
            }
            System.out.println(" Thong tin account thu  " + (k + 1) + " la : ");
            System.out.println("Email: " + accArray[k].eMail);
            System.out.println("Fullname: " + accArray[k].fullName);
            System.out.println("Phong ban: " + accArray[k].department.name);

        }
        // entity.Question 14: In ra thông tin tất cả các account có id < 4

        System.out.println("--------entity.Question 14----------");

        for (int i = 0; i < 3; i++) {
            System.out.println(" Thong tin account thu  " + (i + 1) + " la : ");
            System.out.println("Email: " + accArray[i].eMail);
            System.out.println("Fullname: " + accArray[i].fullName);
            System.out.println("Phong ban: " + accArray[i].department.name);
        }

        // entity.Question 15: In ra các số chẵn nhỏ hơn hoặc bằng 20

        System.out.println("--------entity.Question 15----------");

        for (int k = 0; k <= 20; k++) {
            if (k % 2 == 1) {
                continue;
            }
            System.out.println(k);
        }

        // WHILE
        // entity.Question 16: Làm lại các entity.Question ở phần FOR bằng cách sử dụng WHILE kết hợp với lệnh break, continue

        System.out.println("--------entity.Question 16-10----------");

        int i = 0;
        while (i < accArray.length) {
            System.out.println(" Thong tin account thu  " + (i + 1) + " la : ");
            System.out.println("Email: " + accArray[i].eMail);
            System.out.println("Fullname: " + accArray[i].fullName);
            System.out.println("Phong ban: " + accArray[i].department.name);
            i++;
        }

        System.out.println("--------entity.Question 16-11----------");

        int j = 0;
        while (j < deps.length) {
            System.out.println(" Thong tin department thu " + (j + 1) + " la :");
            System.out.println("ID: " + deps[j].id);
            System.out.println("Name: " + deps[j].name);
            j++;

        }

        System.out.println("--------entity.Question 16-12----------");

        i = 0;
        while (i < accArray.length) {
            if (i == 2) {
                break;
            }
            System.out.println(" Thong tin account thu  " + (i + 1) + " la : ");
            System.out.println("Email: " + accArray[i].eMail);
            System.out.println("Fullname: " + accArray[i].fullName);
            System.out.println("Phong ban: " + accArray[i].department.name);
            i++;
        }

        System.out.println("--------entity.Question 16-13----------");
        i = 0;
        while (i < accArray.length) {
            if (i == 1) {
                i++;
                continue;
            }


            System.out.println(" Thong tin account thu  " + (i + 1) + " la : ");
            System.out.println("Email: " + accArray[i].eMail);
            System.out.println("Fullname: " + accArray[i].fullName);
            System.out.println("Phong ban: " + accArray[i].department.name);
            i++;


        }
    }


}


