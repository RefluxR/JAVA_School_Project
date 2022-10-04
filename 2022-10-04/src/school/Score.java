package school;

public class Score {
    private int studentID;
    private Subject subject;
    private int point;

    public Score(int studentID, Subject subject, int point) {
        this.studentID = studentID;
        this.subject = subject;
        this.point = point;
    }

    //Getter Setter
    public int getStudentId() {
        return studentID;
    }

    public void setStudentId(int studentId) {
        this.studentID = studentId;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    //Method
    public String toString() {
        return "학번: " + studentID + ", " + subject.getSubjectName() + ": " + point;
    }
}
