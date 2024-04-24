import java.time.LocalDate;
import java.time.Period;

public class Abhishek {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1995, 8, 23);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);
        System.out.println(
                "Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");
    }
}