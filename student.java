package CIE;

public class student {
    protected String usn;
    protected String name;
    protected String sem;

    public student(String usn, String name, String sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }

    public String getUsn() {
        return usn;
    }

    public String getName() {
        return name;
    }

    public String getSem() {
        return sem;
    }
}
