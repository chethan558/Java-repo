import java.util.Scanner;
class triangle{
    double base;
    double height;
    triangle(double  base, double  height){
        
        this.base=base;
        this.height=height;
    }
    void area(){
        double trianglearea=0.5*base*height;
        System.out.println("The area of triangle:"+trianglearea);
        return;
    
    }
    
}
public class demo{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base:");
        double base=sc.nextDouble();
        System.out.println("Enter the height:");
        double height=sc.nextDouble();
        triangle obj=new triangle(base,height);
        obj.area();
        
    }
    
}
give method overriding