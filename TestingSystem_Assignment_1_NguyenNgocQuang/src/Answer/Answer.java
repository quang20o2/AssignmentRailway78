package Answer;
import Question.Question;
public class Answer {
    private int answerID;
    private String content;
    private Question questionID;
    private boolean isCorrect;

    // Constructors
    public Answer(int answerID, String content, Question questionID, boolean isCorrect) {
        this.answerID = answerID;
        this.content = content;
        this.questionID = questionID;
        this.isCorrect = isCorrect;
    }

    //Getter and Setter cho Answer

    public int getAnswerID() {
        return answerID;
    }

    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }

    //Getter and Setter cho Content
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //Getter and Setter cho Question
    public Question getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Question questionID) {
        this.questionID = questionID;
    }

    //Getter and Setter cho isCorrect
    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public void displayAnswerDetails(){
        System.out.println("AnswerID: " + answerID);
        System.out.println("Content: " + content);
        System.out.println("Question: " + questionID.getContent());
        System.out.println("Correct: " + isCorrect);
        System.out.println("\n");
    }

}