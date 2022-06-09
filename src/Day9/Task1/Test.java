package Day9.Task1;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Teacher", "Subject");
        Student student = new Student("Student", "Group");
        student.printInfo();
        teacher.printInfo();
        Human human = new Human("Human");
        human.printInfo();
    }
}
