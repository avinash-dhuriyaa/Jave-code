import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the area of the circle: ");
        double area = scanner.nextDouble();
        double radius = Math.sqrt(area / Math.PI);
        System.out.println("Radius of circle: " + radius);
    }
}
