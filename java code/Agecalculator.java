
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Agecalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dateOfBirth = scanner.nextLine();
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.parse(dateOfBirth);
        Period age = Period.between(birthday, today);
        System.out.printf("You are %d years, %d months, and %d days old.\n",
                age.getYears(), age.getMonths(), age.getDays());
        System.out.println("Your Date of Birth : " + birthday);
        System.out.println("Today's Date : " + today);
    }
}