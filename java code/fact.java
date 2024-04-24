import java.util.*;

public class fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n, fact = 1;
        n = sc.nextInt();
        while (n > 0) {
            fact = fact * n;
            n = n - 1;
        }
        System.out.println("this fact no = " + fact + " Ans ");

    }
}
