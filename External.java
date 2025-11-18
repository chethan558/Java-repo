package SEE;

import CIE.student;

public class External extends student {
    private int[] externalMarks = new int[5];  

    public External(String usn, String name, String sem, int[] externalMarks) {
        super(usn, name, sem);
        this.externalMarks = externalMarks;
    }

    public int[] getExternalMarks() {
        return externalMarks;
    }
}
