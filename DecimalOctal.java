/*
Write a Java Program that reads a decimal integer from the user and converts it to
its octal representation.
Implement a method to perform the conversion:
public static String decimalToOctal(int decimal);
Use this method in the main method to display the octal equivalent of the input
decimal number.
*/
import java.util.*;
public class DecimalOctal {

    public static String decimalToOctal(int decimal){
        String octal = "";
        while(decimal!=0){
            int remainder = decimal%8;
            octal = remainder+octal;
            decimal/=8;
        }
        return octal;
    }
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        int num = gb.nextInt();
        int octal = Integer.parseInt(decimalToOctal(num));
        System.out.println("Octal representation: "+octal);
        gb.close();
    }
}
