import java.util.Scanner;


class Subject {
    int subjectMarks;
    double credits;
    int grade;
}


class Student {
    String name, usn;
    double SGPA;
    Scanner s;
    Subject[] subject;

    Student() {
        s = new Scanner(System.in);
        subject = new Subject[8];  
        for(int i = 0; i < 8; i++) {
            subject[i] = new Subject();
        }
    }

    
    void getStudentDetails() {
        System.out.print("Enter student name: ");
        name = s.nextLine();
        System.out.print("Enter student USN: ");
        usn = s.nextLine();
    }

    
    void getMarks() {
        for(int i = 0; i < 8; i++) {
            System.out.println("Subject " + (i+1) + ":");
            System.out.print("Enter marks (out of 100): ");
            subject[i].subjectMarks = s.nextInt();
            
            if(subject[i].subjectMarks > 100 || subject[i].subjectMarks < 0) {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                i--;  
                continue;
            }
            System.out.print("Enter credits: ");
            subject[i].credits = s.nextDouble();

            
            subject[i].grade = (subject[i].subjectMarks / 10) + 1;
            if(subject[i].grade == 11) {
                subject[i].grade = 10;
            }
            if(subject[i].subjectMarks < 40) {
                subject[i].grade = 0;
            }
        }
    }

    
    void computeSGPA() {
        int effectiveScore = 0;
        int totalCredits = 0;
        for(int i = 0; i < 8; i++) {
            effectiveScore += (subject[i].grade * subject[i].credits);
            totalCredits += subject[i].credits;
        }
        SGPA = (double) effectiveScore / (double) totalCredits;
    }

    
    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.printf("SGPA: %.2f\n", SGPA);
    }
}


public class studentsgpa {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.getStudentDetails();
        student1.getMarks();
        student1.computeSGPA();
        student1.display();
        Student student2=new Student();
        student2.getStudentDetails();
        student2.getMarks();
        student2.computeSGPA();
        student2.display();
    }
}
