package TypeQuestion;

public class TypeQuestion {
    private int typeID;
    private String typeName;

    public TypeQuestion(int typeID, String typeName) {
        this.typeID = typeID;
        this.typeName = typeName;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void displayTypeQuestionDetails(){
        System.out.println("TypeID: " + typeID);
        System.out.println("TypeName: " + typeName);
        System.out.println("\n");
    }
}
