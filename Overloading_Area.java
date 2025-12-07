/*Write a java program to calculate the area of triangle, square, circle, rectangle by 
using method overloading. */
import java.util.*;
public class Overloading_Area {
    public static double area(double radius){
        return Math.PI*Math.pow(radius,2);
    }
    public static double area(int side){
        return Math.pow(side,2);
    }
    public static double area(int length, int breadth){
        return length*breadth;
    }
    public static double area(double a, double b, double c){
        double s = (a+b+c)/2;
        double ar = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return ar;
    } 

    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        int ch = -1;
        while(true){
            System.out.println("===AREA CALCULATOR(Method Overloading)===");
            System.out.println("1. Area of Square\n2. Area of rectangle\n3. Area of circle");
            System.out.println("4. Area of triangle\n5. Exit");
            System.out.println("Enter your choice.");
            ch = gb.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter side of square.");
                    int s = gb.nextInt();
                    System.out.println("Area of square is: "+area(s));
                    break;

                case 2:
                    System.out.println("Enter length and breadth of rectangle.");
                    int l = gb.nextInt();
                    int b = gb.nextInt();
                    System.out.println("Area of Rectangle is: "+area(l,b));
                    break;

                case 3:
                    System.out.println("Enter radius of circle.");
                    double rad = gb.nextDouble();
                    System.out.println("Area of circle is: "+area(rad));
                    break;
                
                case 4:
                    System.out.println("Enter three sides of triangle");
                    double s1 = gb.nextDouble();
                    double s2 = gb.nextDouble();
                    double s3 = gb.nextDouble();
                    System.out.println("Area of triangle is: "+area(s1,s2,s3));
                    break;

                case 5:
                    System.out.println("Exiting...!!");
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Wrong Choice");
            }
        }

    }
}
