import java.util.Scanner;

public class Areaofcircale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Radius");
        double r = sc.nextDouble();
        double Area = (22 * r * r) / 7;
        System.out.println(Area);
    }

}
