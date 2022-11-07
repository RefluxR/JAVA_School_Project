package school;

import java.util.ArrayList;

public class Subject {
    private int subjectId;
    private String subjectName;
    private int gradeType;
    ArrayList<Student> studentList = new ArrayList<Student>();

    public Subject(String subjectName, int subjectId) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
    }

    //Getter Setter
    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
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
