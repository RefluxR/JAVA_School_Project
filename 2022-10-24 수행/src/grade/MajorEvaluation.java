package grade;

public class MajorEvaluation implements GradeEvaluation {
    @Override
    public String getGrade(int point) {
        String grade;

        switch (point / 10) {
            case 10:
            case 9:
                grade = (point >= 95 ? "S" : "A");
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }

        return grade;
    }
}
