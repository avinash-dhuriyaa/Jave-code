import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        // Base case
        if (n == 0)
            return 1;

        // int A = factorial(n - 1); ham aise bhi kar sakte hai
        // int B = n * A;
        // return B;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num to find factorial");
        int num = sc.nextInt();
        // int as = factorial(num); yaha pe ek dusra vari ban kr bhi call skte the
        System.out.println(factorial(num));

    }
}
