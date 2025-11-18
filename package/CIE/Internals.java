package CIE;

public class Internals extends student {
    private int[] internalMarks = new int[5];  // Marks for 5 courses

    public Internals(String usn, String name, String sem, int[] internalMarks) {
        super(usn, name, sem);
        this.internalMarks = internalMarks;
    }

    public int[] getInternalMarks() {
        return internalMarks;
    }
}
