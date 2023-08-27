package ExamQuestion;

import Exam.Exam;
import Question.Question;

import java.util.ArrayList;
import java.util.List;

public class ExamQuestion {
    private Exam examID;
    private List<Question> questionID;

    public ExamQuestion(){
        questionID = new ArrayList<>();
    }

    //Constructor
    public ExamQuestion(Exam examID, List<Question> questionID) {
        this.examID = examID;
        this.questionID = questionID;
    }

    //Getter and Setter cho ExamID
    public Exam getExamID() {
        return examID;
    }

    public void setExamID(Exam examID) {
        this.examID = examID;
    }

    //Getter and Setter cho QuestionID
    public List<Question> getQuestionID() {
        return questionID;
    }

    public void setQuestionID(List<Question> questionID) {
        this.questionID = questionID;
    }

    public void displayExamQuestionDetails() {
        System.out.println("ExamID: " + examID.getExamID());
        System.out.println("QuestionID: ");
        for (Question question : questionID) {
            System.out.println(question.getQuestionID());
        }
        System.out.print("\n");
    }
}