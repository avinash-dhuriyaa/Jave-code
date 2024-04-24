import java.util.Scanner;

class Av {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if (n / 2 == 0) {
            System.out.println("even num");
        } else {
            System.out.println("odd num");

        }
    }
}
