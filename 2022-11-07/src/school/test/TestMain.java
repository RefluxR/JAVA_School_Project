package school.test;

import school.School;
import school.Subject;
import school.report.GenerateGradeReport;
import school.utils.Define;

public class TestMain {
    private School school = School.getInstance();
    private Subject korean;
    private Subject math;
    private GenerateGradeReport gradeReport = new GenerateGradeReport();

    public static void main(String[] args) {
        TestMain test = new TestMain();

        test.createSubject();


    }

    public void createSubject() {
        korean = new Subject("국어", Define.KOREAN);
        math = new Subject("수학", Define.MATH);

        school.addSubject(korean);
        school.addSubject(math);
    }
}
