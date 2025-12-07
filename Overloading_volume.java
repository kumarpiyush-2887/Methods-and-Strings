/*
Write a java program to calculate the volume of 3D shapes like cube, cuboid, sphere,
cylinder by using method overloading.
Formula and method header:
Volume of cube V = side3
public static double volume(int side)
Volume of cuboid V = length × breadth × height
CO6
CO4
CO5
2. 3. public static double volume(double length, double width,
double height)
Volume of sphere V = 4
3
× π × r3
public static double volume(double radius)
Volume of Cylinder V = π × r2 × h
public static double volume(double radius, double height)
*/

import java.util.Scanner;

public class Overloading_volume {
    public static double volume(double radius){
        return 4.0/3*Math.PI*Math.pow(radius,3);
    }
    public static double volume(int side){
        return Math.pow(side,3);
    }
    public static double volume(double length, double breadth, double height){
        return length*breadth*height;
    }
    public static double volume(double radius, double height){
        return Math.PI*Math.pow(radius,2)*height;
    } 

    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        int ch = -1;
        while(true){
            System.out.println("===VOLUME CALCULATOR(Method Overloading)===");
            System.out.println("1. Volume of Cube\n2. Volume of Cuboid\n3. Volume of Sphere");
            System.out.println("4. Volume of Cylinder\n5. Exit");
            System.out.println("Enter your choice.");
            ch = gb.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter side of cube.");
                    int s = gb.nextInt();
                    System.out.println("Volume of square is: "+volume(s));
                    break;

                case 2:
                    System.out.println("Enter length, breadth and height of cuboid.");
                    double l = gb.nextDouble();
                    double b = gb.nextDouble();
                    double h = gb.nextDouble();
                    System.out.println("Volume of Rectangle is: "+volume(l,b,h));
                    break;

                case 3:
                    System.out.println("Enter radius of sphere.");
                    double rad = gb.nextDouble();
                    System.out.println("Volume of sphere is: "+volume(rad));
                    break;
                
                case 4:
                    System.out.println("Enter radius and height of cylinder");
                    double r = gb.nextDouble();
                    double h = gb.nextDouble();
                    System.out.println("Volume of cylinder is: "+volume(r,h));
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
