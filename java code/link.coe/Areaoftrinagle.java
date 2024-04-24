import java.util.Scanner;

public class Areaoftrinagle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter height ");
        ;
        int h = sc.nextInt();
        System.out.println("Enter weight");
        int w = sc.nextInt();
        int area = h * w / 2;
        System.out.println("area is " + area);

    }
}
