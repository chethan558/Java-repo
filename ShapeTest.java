import java.util.Scanner;

abstract class Shape {
    int a, b;

    abstract void printArea();
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        a = length;
        b = breadth;
    }

    void printArea() {
        System.out.println("Area of Rectangle: " + (a * b));
    }
}

class Triangle extends Shape {
    Triangle(int base, int height) {
        a = base;
        b = height;
    }

    void printArea() {
        System.out.println("Area of Triangle: " + (0.5 * a * b));
    }
}

class Circle extends Shape {
    Circle(int radius) {
        a = radius;
    }

    void printArea() {
        System.out.println("Area of Circle: " + (Math.PI * a * a));
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter length of Rectangle: ");
        int rectLength = sc.nextInt();
        System.out.println("Enter breadth of Rectangle: ");
        int rectBreadth = sc.nextInt();
        Rectangle r = new Rectangle(rectLength, rectBreadth);

        
        System.out.println("Enter base of Triangle: ");
        int triBase = sc.nextInt();
        System.out.println("Enter height of Triangle: ");
        int triHeight = sc.nextInt();
        Triangle t = new Triangle(triBase, triHeight);

        
        System.out.println("Enter radius of Circle: ");
        int circleRadius = sc.nextInt();
        Circle c = new Circle(circleRadius);

        
        r.printArea();
        t.printArea();
        c.printArea();

        sc.close();
    }
}
