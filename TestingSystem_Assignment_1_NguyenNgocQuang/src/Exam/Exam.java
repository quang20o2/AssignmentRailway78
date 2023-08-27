package Exam;

import CategoryQuestion.CategoryQuestion;
import Account.Account;

import java.time.LocalDate;

public class Exam {
    private int examID;
    private String code;
    private String title;
    private CategoryQuestion categoryID;
    private int duration;
    private Account creatorID;
    private LocalDate createDate;

    //Constructor

    public Exam(int examID, String code, String title, CategoryQuestion categoryID, int duration, Account creatorID, LocalDate createDate) {
        this.examID = examID;
        this.code = code;
        this.title = title;
        this.categoryID = categoryID;
        this.duration = duration;
        this.creatorID = creatorID;
        this.createDate = createDate;
    }

    //Getter and Setter cho ExamID
    public int getExamID() {
        return examID;
    }

    public void setExamID(int examID) {
        this.examID = examID;
    }

    //Getter and Setter cho Code
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    //Getter and Setter cho Title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //Getter and Setter cho CategoryID
    public CategoryQuestion getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(CategoryQuestion categoryID) {
        this.categoryID = categoryID;
    }

    //Getter and Setter cho Duration
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    //Getter and Setter cho CreatorID
    public Account getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(Account creatorID) {
        this.creatorID = creatorID;
    }

    //Getter and Setter cho CreateDate
    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public void displayExamDetails(){
        System.out.println("ExamID: " + examID);
        System.out.println("Code: " + code);
        System.out.println("Title: " + title);
        System.out.println("CategoryID: " + categoryID.getCategoryID());
        System.out.println("Duration: " + duration);
        System.out.println("CreatorID: " + creatorID.getAccountID());
        System.out.println("CreateDate: " + createDate);
        System.out.println("\n");
    }
}
