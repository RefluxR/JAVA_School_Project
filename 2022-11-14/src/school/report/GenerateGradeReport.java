package school.report;

import school.grade.BasicEvaluation;
import school.grade.GradeEvaluation;
import school.grade.MajorEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.utils.Define;

import java.util.ArrayList;

public class GenerateGradeReport {
    School school = School.getInstance();

    public static final String TITLE = " 수강생 학점\t\t\n";
    public static final String HEADER = "이름\t\t|\t학번\t\t|\t중점과목\t|\t점수\n";
    public static final String LINE = "--------------------------------------\n";
    private StringBuffer buffer = new StringBuffer();

    public String getReport() {
        ArrayList<Subject> subjectList = school.getSubjectList();
        for(int i = 0; i < subjectList.size(); ++i) {
            Subject subject = subjectList.get(i);
            makeHeader(subject);
            makeBody(subject);
            makeFooter();
        }

        return buffer.toString();
    }

    public void makeHeader(Subject subject) {
        buffer.append(GenerateGradeReport.LINE);
        buffer.append(subject.getSubjectName());
        buffer.append(GenerateGradeReport.TITLE);
        buffer.append(GenerateGradeReport.HEADER);
        buffer.append(GenerateGradeReport.LINE);
    }

    public void makeBody(Subject subject) {
        ArrayList<Student> studentList = subject.getStudentList();

        for(int i = 0; i < studentList.size(); ++i) {
            Student student = studentList.get(i);

            buffer.append(student.getStudentName());
            buffer.append("\t|\t");
            buffer.append(student.getStudentId());
            buffer.append("\t|\t");
            buffer.append(student.getMajorSubject().getSubjectName());
            buffer.append("\t\t|\t");

            ArrayList<Score> scoreList = student.getScoreList();
            int majorId = student.getMajorSubject().getSubjectId();

            GradeEvaluation[] gradeEvaluations = { new BasicEvaluation(), new MajorEvaluation() };
            for(int j = 0; j < scoreList.size(); ++j) {
                Score score = scoreList.get(j);
                if(score.getSubject().getSubjectId() == subject.getSubjectId()) {
                    String grade;
                    if(score.getSubject().getSubjectId() == majorId)
                        grade = gradeEvaluations[Define.SAB_TYPE].getGrade(score.getPoint());
                    else
                        grade = gradeEvaluations[Define.AB_TYPE].getGrade(score.getPoint());

                    buffer.append(score.getPoint());
                    buffer.append(":");
                    buffer.append(grade);
                }
            }
            buffer.append("\n");
            buffer.append(GenerateGradeReport.LINE);
        }
    }
    private void makeFooter() {
        buffer.append("\n");
    }

}
