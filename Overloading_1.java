/*Write a java program to calculate the area of triangle, square, circle, rectangle by 
using method overloading. */
import java.util.*;
public class Overloading_1 {
    public static double area(double radius){
        return Math.PI*Math.pow(radius,2);
    }
    public static double area(int side){
        return Math.pow(side,2);
    }
    public static double area(int length, int breadth){
        return length*breadth;
    }
    public static double area(double base, double height){
        return 0.5*base*height;
    } 

    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        double rad = gb.nextDouble();
        System.out.println("Area of circle is: "+area(rad));

        System.out.println("Enter side of square:");
        int s = gb.nextInt();
        System.out.println("Area of square is: "+area(s));

        System.out.println("Enter length and breadth of rectangle");
        int len = gb.nextInt();
        int bre = gb.nextInt();
        System.out.println("Area of rectangle is: "+area(len, bre));

        System.out.println("Enter base and height of triangle:");
        double base = gb.nextDouble();
        double height = gb.nextDouble();
        System.out.println("Area of the triangle is: "+area(base,height));

        gb.close();
    }
}
