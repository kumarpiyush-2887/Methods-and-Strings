/*A regular polygon is an n-sided polygon in which all sides are of the same length and
all angles have the same degree (i.e., the polygon is both equilateral and equiangular).
Write a method that returns the area of a regular polygon using the following header:

public static double area(int n, double side)
*/
import java.util.*;
public class AreaPolygon{
    public static double area(int n, double side){
        double tan = Math.sin(Math.PI/n)/Math.cos(Math.PI/n);
        double a = (n*Math.pow(side,2))/(4*tan);
        return a;
    }
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter the number of sides of polygon:");
        int nOfSides = gb.nextInt();
        System.out.println("Enter length of side of the polygon:");
        double s = gb.nextDouble();
        double areaOfPolygon = area(nOfSides,s);
        System.out.println("Area of a "+nOfSides+" sided polygon with side= "+s+" is: "+areaOfPolygon);
        gb.close();
    }
}