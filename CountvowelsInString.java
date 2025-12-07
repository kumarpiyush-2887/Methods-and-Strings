/*Write java method called count accepts a string as input and returns the number of vowels in
it. The method header is given below.
public static int count(String str)
For example, count ("Welcome") returns 2. */
import java.util.*;
public class CountvowelsInString {
    public static int count(String str){
        int l = str.length();
        int sum = 0;
        for(int i=0;i<l;i++){
            char ch = str.toLowerCase().charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner gb = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = gb.nextLine();
        int vowels = count(str);
        System.out.println("Number of vowels in \""+str+"\" is: "+vowels);
        gb.close();
    }
}
