import java.util.*;

public class Dateyear {
    public static void main(String[] args) {
        int year, month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of the in given month");
        System.out.println("please enter the month");
        month = sc.nextInt();
        System.out.println("please enter a year");
        year = sc.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            System.out.println("total day in the month 31");
        else if ((month == 2) && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("the day is 29 month");
        } else if (month == 2) {
            System.out.println("the is day month 28");
        } else {
            System.out.println("this is 30");
        }
    }
}
