import java.util.Scanner;

public class QuadraticEquation 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coefficient a: ");
        double a=sc.nextDouble();
        System.out.println("Enter coefficient b: ");
        double b=sc.nextDouble();
        System.out.println("Enter coefficient c: ");
        double c=sc.nextDouble();
        if (a==0)
        {
           System.out.println("Not a quadratic equation"); 
           do {
            System.out.println("Enter a non zero value for coefficient a: ");
            a=sc.nextDouble();   
           } 
           while(a==0);
        }

        double d=b*b-4*a*c;
        if(d>0)
        {
            double r1=((-b) + (Math.sqrt(d)))/(2*a);
            double r2=((-b) - (Math.sqrt(d)))/(2*a);
            System.out.println("Roots are real and distinct");
            System.out.println("Root 1: "+r1);
            System.out.println("Root 2: "+r2);
        }        
        else if (d==0)
        {
            double r=-b/(2*a);
            System.out.println("Roots are real and equal");
            System.out.println("Root 1 and root 2: "+r);
        }
        else 
        {
            System.out.println("Roots are imaginary.No real solution");
        }
        sc.close();

}

    }
    