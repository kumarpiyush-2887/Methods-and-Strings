/*Write a Java method that accept three integers and check whether they are consecutive 
are not. Return true or false.
Expected Output:
Input the first number: 15
Input the second number: 16
Input the third number: 17
Check whether the three said numbers are consecutive or not!
True
*/
import java.util.*;
public class Consecutive {
    public static boolean checkConsecutivity(int a, int b, int c){
        if(a+1==b && b+1==c)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Input the first number:");
        int n1 = gb.nextInt();
        System.out.println("input the second number:");
        int n2 = gb.nextInt();
        System.out.println("Input the third number:");
        int n3 = gb.nextInt();
        boolean res = checkConsecutivity(n1,n2,n3);
        System.out.println("Check whether the three said numbers are consecutive or not!");
        System.out.println(res);
        gb.close();
    }
}
