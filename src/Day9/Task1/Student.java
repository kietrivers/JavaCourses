package Day9.Task1;

public class Student extends Human {
    private final String groupName;

    public String getGroupName() {
        return groupName;
    }

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("This student has name: " + this.name + ". This student studies in group: " + groupName);
    }
}
