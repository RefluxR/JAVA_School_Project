package school;

import java.util.ArrayList;

public class Subject {
    private int subjectID;
    private String subjectName;
    private int gradeType;
    ArrayList<Student> studentList = new ArrayList<Student>();

    public Subject(String subjectName, int subjectID) {
        this.subjectName = subjectName;
        this.subjectID = subjectID;
    }

    //Getter Setter
    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getGradeType() {
        return gradeType;
    }

    public void setGradeType(int gradeType) {
        this.gradeType = gradeType;
    }

    //Method
    public void register(Student student) {
        studentList.add(student);
    }

}
