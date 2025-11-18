import java.util.Scanner;

class WrongAge extends Exception {
    public WrongAge() {
        super("Age Error");
    }

    public WrongAge(String message) {
        super(message);
    }
}

class InputScanner {
    protected static Scanner s = new Scanner(System.in);
}

class Father extends InputScanner {
    protected int fatherAge;

    
    public Father(int fatherAge) throws WrongAge {
        this.fatherAge = fatherAge;
        if (fatherAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
    }

    public void display() {
        System.out.println("Father's age is: " + fatherAge);
    }
}

class Son extends Father {
    private int sonAge;

    
    public Son(int fatherAge) throws WrongAge {
        super(fatherAge); 
        System.out.print("Enter son's age: ");
        sonAge = s.nextInt();

        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to father's age");
        } else if (sonAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
    }

    public void display() {
        System.out.println("Son's age is: " + sonAge);
    }
}

public class inheritancetree {
    public static void main(String[] args) {
        try {
            
            System.out.print("Enter father's age: ");
            int fatherAge = InputScanner.s.nextInt();

            
            Father father = new Father(fatherAge);
            father.display();

            
            Son son = new Son(fatherAge);
            son.display(); 
        } catch (WrongAge e) {
            System.out.println("Error: " + e.getMessage()); 
        }
    }
}
