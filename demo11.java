import java.util.Scanner;

class triangle {
    double base;
    double height;

    triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void area() {
        double triangleArea = 0.5 * base * height;
        System.out.println("Area of Triangle: " + triangleArea);
    }
}

class rightTriangle extends triangle {

    rightTriangle(double base, double height) {
        super(base, height);
    }

    @Override
    void area() {
        double triangleArea = 0.5 * base * height;
        System.out.println("Area of Right Triangle: " + triangleArea);
    }
}

public class demo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        triangle obj = new rightTriangle(base, height);
        obj.area();    

        sc.close();
    }
}
