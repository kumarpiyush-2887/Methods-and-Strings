/* Write a method that returns the number of days in a year using the following header:
public static int numberOfDaysInAYear(int year)
Write a java program that displays the number of days in year from 2000 to 2020. */
public class TotalNumberOfDays {
    public static int numberOfDaysInAYear(int year){
        if(year%4==0 && year%100!=0)
            return 366;
        else if (year%400==0)
            return 366;
        else
            return 365;
    }

    public static void main(String[] args) {
        System.out.println("Year\tDays");
        for(int i=2000;i<=2020;i++){
            int days = numberOfDaysInAYear(i);
            System.out.println(i+"\t"+days);
        }
    }
}
