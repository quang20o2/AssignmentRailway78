package entity;

import java.time.LocalDate;
import java.util.Date;

public class Exam {

    public int id;
    public String code;
    public String title;
    public CategoryQuestion categoryQuestion;
    public int duration;
    public Account creator;
    public LocalDate createDate;
    public Date birthDay;
    public Question[] questions;
}
