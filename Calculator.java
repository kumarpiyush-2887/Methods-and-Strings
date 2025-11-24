/*Design a Simple Calculator using methods in java containing the following functionalities,
namely, with Addition, Subtraction, Multiplication, Remainder, Division and Square Root. The
signature of the methods are given below.

 public static int additionSimple(int x, int y)
 Two inputs, x and y. Return the result of adding x to y.

 public static int subtractionSimple(int x, int y)
 Two inputs, x and y. Return the result of subtracting x from y i.e y-x.

 public static int multiplicationSimple(int x, int y)
 Two inputs, x and y. Return the result of multiplying x to y i.e. x*y.

 public static double divisionSimple(int x, int y)
 Two inputs, x and y. Return the result of dividing y by x. Please check whether
x is zero before dividing.


 public static int remainderSimple(int n, int m)
 Please make sure that remainderSimple() takes two inputs, namely, a number
(int) n and a number (int) m. The method should return the remainder of n
divided by m.

 public static double squareRootSimple(int n)
 Takes one input, namely a number n, and returns the square root of the number.
The return should be double. Please kindly make sure that the number n is
positive. */
public class Calculator {
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
}
