package school;

import java.util.ArrayList;

public class Student {
    private int studentID;
    private String studentName;
    private Subject majorSubject;
    private ArrayList<Score> scoreList = new ArrayList<Score>();

    public Student(int studentID, String studentName, Subject majorSubject, ArrayList<Score> scoreList) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.majorSubject = majorSubject;
        this.scoreList = scoreList;
    }

    //Method

    public void addSubjectScore(Score score) {
        scoreList.add(score);
    }
    
    //Getter Setter
    
    public int getStudentID() {
        return studentID;
    }
    
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
    
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName() {
        this.studentName = studentName;
    }

    public Subject getMajorSubject() {
        return majorSubject;
    }

    public void setMajorSubject(Subject majorSubject) {
        this.majorSubject = majorSubject;
    }

    public ArrayList<Score> getScoreList() {
        return scoreList;
    }

    public void setScoreList(ArrayList<Score> scoreList) {
        this.scoreList = scoreList;
    }

    public static void main(String[] args) {
        
    }
}
