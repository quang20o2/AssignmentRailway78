package Question;
import Account.Account;
import CategoryQuestion.CategoryQuestion;
import TypeQuestion.TypeQuestion;

import java.time.LocalDate;
public class Question {
    private int questionID;
    private String content;
    private CategoryQuestion categoryID;
    private TypeQuestion typeID;
    private Account creatorID;
    private LocalDate createDate;

    //Constructor
    public Question(int questionID, String content, CategoryQuestion categoryID, TypeQuestion typeID, Account creatorID, LocalDate createDate) {
        this.questionID = questionID;
        this.content = content;
        this.categoryID = categoryID;
        this.typeID = typeID;
        this.creatorID = creatorID;
        this.createDate = createDate;
    }


    //Getter and Setter cho QuestionID
    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    //Getter and Setter cho Content
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //Getter and Setter cho categoryID
    public CategoryQuestion getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(CategoryQuestion categoryID) {
        this.categoryID = categoryID;
    }

    //Getter and Setter cho typeID
    public TypeQuestion getTypeID() {
        return typeID;
    }

    public void setTypeID(TypeQuestion typeID) {
        this.typeID = typeID;
    }

    //Getter and Setter cho creatorID
    public Account getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(Account creatorID) {
        this.creatorID = creatorID;
    }

    //Getter and Setter cho createDate
    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public void displayQuestionDetails() {
        System.out.println("Question ID: " + questionID);
        System.out.println("Content: " + content);
        System.out.println("Category: " + categoryID.getCategoryName());
        System.out.println("Type: " + typeID.getTypeName());
        System.out.println("Creator: " + creatorID.getUserName());
        System.out.println("Create Date: " + createDate);
        System.out.println("\n");
    }
}

