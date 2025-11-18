import CIE.*;
import SEE.*;
import java.util.Scanner;

public class Main {

    
    public static int[] calculateFinalMarks(int[] internalMarks, int[] externalMarks) {
        int[] finalMarks = new int[5];
        for (int i = 0; i < 5; i++) {
            finalMarks[i] = internalMarks[i] + externalMarks[i];
        }
        return finalMarks;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();  

        for (int i = 0; i < n; i++) {
            
            System.out.print("Enter USN: ");
            String usn = scanner.nextLine();
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Semester: ");
            String sem = scanner.nextLine();

            
            int[] internalMarks = new int[5];
            System.out.println("Enter internal marks for 5 courses for " + name + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Course " + (j + 1) + ": ");
                internalMarks[j] = scanner.nextInt();
            }

            
            int[] externalMarks = new int[5];
            System.out.println("Enter external marks for 5 courses for " + name + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Course " + (j + 1) + ": ");
                externalMarks[j] = scanner.nextInt();
            }

            
            Internals internalStudent = new Internals(usn, name, sem, internalMarks);
            External externalStudent = new External(usn, name, sem, externalMarks);

           
            int[] finalMarks = calculateFinalMarks(internalStudent.getInternalMarks(), externalStudent.getExternalMarks());

           
            System.out.println("\nFinal Marks for Student: " + name + " (" + usn + ", " + sem + " Semester):");
            for (int j = 0; j < 5; j++) {
                System.out.println("  Course " + (j + 1) + ": " + finalMarks[j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
