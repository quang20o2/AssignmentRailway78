package Position;

public class Position {
    private int positionID;
    private String positionName;

    // Constructor
    public Position(int positionID, String positionName) {
        this.positionID = positionID;
        this.positionName = positionName;
    }

    // Getter and Setter cho positionID
    public int getPositionID() {
        return positionID;
    }

    public void setPositionID(int positionID) {
        this.positionID = positionID;
    }

    // Getter and Setter cho positionName
    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public void displayPositionDetails(){
        System.out.println("Position ID: " + positionID);
        System.out.println("Position Name: " + positionName);
        System.out.println("\n");
    }
}
