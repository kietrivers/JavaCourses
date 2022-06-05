package Day6;
import  java.util.Random;
public class Task3 {
    public static void main(String[] args){
        Teacher teacher = new Teacher("Math", "Teacher");
        Student student = new Student("Student");
        teacher.evaluate(student);

    }
}




class Student {
    private String name;

    public String getName() {
        return name;
    }

    public Student(String name) {
        this.name = name;
    }
}
class Teacher{
    private String name;
    private String lesson;

    public String getName() {
        return name;
    }

    public String getLesson() {
        return lesson;
    }

    public Teacher(String lesson, String name) {
        this.lesson = lesson;
        this.name = name;
    }
    public void evaluate (Student student) {
        Random random = new Random();
        int randomGrade = random.nextInt(5) + 2;
        String grade = "";
        switch(randomGrade) {
            case 2:
                grade = "F";
                break;
            case 3:
                grade = "C/D";
                break;
            case 4:
                grade = "B";
                break;
            default:
                grade = "A";
                break;

        }
        System.out.println("Teacher " + this.name + " graded : " + student.getName() + " in the subject: " + this.lesson +
                " with grade: " + grade);


    }

}