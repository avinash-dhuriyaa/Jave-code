import java.util.Scanner;;

public class Sintheta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n / 2 == 0) {
            // if (n == 2 || n == 5) {
            // System.out.println("not weird");

        } else {
            System.out.println("weird");
        }
        if (n > 20) {
            System.out.println("not weird");
        }
    }

}
