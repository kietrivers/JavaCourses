package Day9.Task1;

public class Teacher extends Human {
    private final String subjectName;

    public String getGroupName() {
        return subjectName;
    }

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("This teacher has name: " + this.name + ". This teacher professes subject: " + subjectName);
    }
}
