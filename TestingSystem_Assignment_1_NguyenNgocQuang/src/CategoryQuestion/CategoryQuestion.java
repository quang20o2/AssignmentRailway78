package CategoryQuestion;

public class CategoryQuestion {
    private int categoryID;
    private String categoryName;

    //Constructor
    public CategoryQuestion(int categoryID, String categoryName) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
    }

    //Getter and Setter cho CategoryID
    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    //Getter and Setter cho CategoryName
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void displayCategoryQuestionDetails(){
        System.out.println("CategoryID: "+ categoryID);
        System.out.println("CategoryName: "+ categoryName);
        System.out.println("\n");
    }
}
