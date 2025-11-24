/*Some websites impose certain rules for passwords.
Write a method that checks whether a string is a valid password. Suppose the password rules
are as follows:
 A password must have at least eight characters.
 A password consists of only letters and digits.
 A password must contain at least two digits.
Write a program that prompts the user to enter a password and displays Valid Password if the
rules are followed or Invalid Password otherwise. */
import java.util.*;
public class PasswordChecker {
    public static boolean checkPassword(String str){
        int cd = 0, cl = 0, other = 0;
        int l = str.length();
        for(int i=0;i<l;i++){
            char ch = str.toLowerCase().charAt(i);
            if(ch>='a' && ch<='z'){
                cl++;
            }
            else if(ch>='0' && ch<='9'){
                cd++;
            }
            else{
                other++;
            }
        }
        if(l>=8 && other==0 && cd>=2 && cl!=0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter the password");
        String pass = gb.nextLine();
        boolean res = checkPassword(pass);
        if(res==true)
            System.out.println("Valid Password");
        else
            System.out.println("Invalid password");
        gb.close();
    }
}
