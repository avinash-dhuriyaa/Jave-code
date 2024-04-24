import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter a elment");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < n / 2; i++) {
            int tem = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = tem;
        }
        System.out.println("this is reserse num");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");

        }

    }
}
