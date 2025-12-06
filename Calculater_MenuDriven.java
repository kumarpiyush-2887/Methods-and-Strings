/* Design a Simple Calculator using methods in Java that provides the following
operations: Addition, Subtraction, Multiplication, Division, Remainder, and Square
Root. The method signatures are given below:
public static int additionSimple(int x, int y)
• Takes two integers x and y. Returns x + y.
public static int subtractionSimple(int x, int y)
• Takes two integers x and y. Returns y – x.
public static int multiplicationSimple(int x, int y)
• Takes two integers x and y. Returns x * y.
public static double divisionSimple(int x, int y)
• Takes two integers x and y. Returns y / x.
• Check if x is zero before dividing.
public static int remainderSimple(int n, int m)
• Takes two integers n and m. Returns n % m.
public static double squareRootSimple(int n)
• Takes one integer n. Returns the square root of n.
• Ensure n is positive.
The calculator must function like a real calculator. Therefore, the program should
display a menu and run continuously. The user should be able to choose an operation
repeatedly until selecting an option to exit the program.  */
import java.util.*;
public class Calculater_MenuDriven {
    public static int additionSimple(int x, int y){
        return x+y;
    }
    public static int subtractionSimple(int x, int y){
        return y-x;
    }
    public static int multiplicationSimple(int x, int y){
        return x*y;
    }
    public static double divisionSimple(int x, int y){
        return y/x;
    }
    public static int remainderSimple(int n, int m){
        return n%m;
    }
    public static double squareRootSimple(int n){
        return Math.sqrt(n);
    }

    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
            int ch = -1;

            while(true){
                System.out.println("----- SIMPLE CALCULATOR -----");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Remainder");
                System.out.println("6. Square root");
                System.out.println("7. Exit");

                System.out.println("Choose an option:");
                ch = gb.nextInt();

                switch (ch){
                    case 1:
                        System.out.println("Enter first number(x)");
                        int x = gb.nextInt();
                        System.out.println("Enter second number(y)");
                        int y = gb.nextInt();
                        System.out.println("Result (x + y) = "+additionSimple(x, y));
                        break;

                    case 2:
                        System.out.println("Enter first number(x)");
                        int a = gb.nextInt();
                        System.out.println("Enter second number(y)");
                        int b = gb.nextInt();
                        System.out.println("Result (y - x) = "+subtractionSimple(a, b));
                        break;

                    case 3:
                        System.out.println("Enter first number(x)");
                        int m = gb.nextInt();
                        System.out.println("Enter second number(y)");
                        int n = gb.nextInt();
                        System.out.println("Result (x * y) = "+multiplicationSimple(m, n));
                        break;

                    case 4:
                        System.out.println("Enter first number(x)");
                        int c = gb.nextInt();
                        System.out.println("Enter second number(y)");
                        int d = gb.nextInt();
                        if(c!=0)
                            System.out.println("Result (y / x) = "+divisionSimple(c, d));
                        else
                            System.out.println("Division by zero not possible.");
                        break;

                    case 5:
                        System.out.println("Enter first number(x)");
                        int e = gb.nextInt();
                        System.out.println("Enter second number(y)");
                        int f = gb.nextInt();
                        System.out.println("Result (x % y) = "+remainderSimple(e, f));
                        break;

                    case 6:
                        System.out.println("Enter number for square root:");
                        int num = gb.nextInt();
                        if(num>=0)
                            System.out.println("Result: "+squareRootSimple(num));
                        else
                            System.out.println("Enter a positive number.");
                        break;

                    case 7:
                        System.out.println("Exiting.. Thank you!");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Wrong choice.");
                }
                System.out.println();
            }
        }
    }



