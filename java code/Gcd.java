import java.util.Scanner;

public class Gcd {
    public static int GCD(int x, int y) {
        if (y == 0) {
            return x;
        }
        return GCD(y, x % y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first num");
        int x = sc.nextInt();
        System.out.println("enter a second num");
        int y = sc.nextInt();
        System.out.println(GCD(x, y) + " this is your GCD");

    }

}
