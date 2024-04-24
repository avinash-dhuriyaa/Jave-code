public class LeaPyar {
    public static void main(String[] args) {
        int year = 2021;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {

                    System.out.println(year + " this is leap year");
                } else {
                    System.out.println(year + " this i not leap year");
                }
            } else {
                System.out.println(year + " this is leap year");
            }
        } else {
            System.out.println(year + " this is not leap year");
        }

    }
}
