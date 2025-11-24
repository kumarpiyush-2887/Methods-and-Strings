/*Write a program to find the first non-repeated character in a given String, for example, 
if the given String is "Java" then the first non-repeated character is "J".     */
import java.util.*;
public class NonRepeatingLetter {
    public static int nonRepeating(String str){
        int l = str.length();
        int i;
        for(i=0;i<l;i++){
            char ch = str.charAt(i);
            int count = 0;
            for(int j=0;j<l;j++){
                char nch = str.charAt(j);
                if(ch==nch && i!=j)
                    count++;
            }
            if(count==0){
                return i;
            }
        }
        return -1;
    }

        public static void main(String[] args) {
            Scanner gb = new Scanner(System.in);
            System.out.println("Enter a string:");
            String str = gb.nextLine();
            int position = nonRepeating(str);
            if(position==-1)
                System.out.println("No non-repeating alphabets.");
            else
                System.out.println("First non-repeating alphabet is: "+str.charAt(position));
            gb.close();
        }

    }

