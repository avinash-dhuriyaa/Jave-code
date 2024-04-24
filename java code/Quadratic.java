
//  x^+5x+6 qus (1)
import java.lang.Math;

class Quadratic {
    public static void main(String[] args) {
        double a = 1;
        double b = 4.265f;
        double c = 2.102;
        double x1 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a); // imp formula...
        double x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println(x1);
        System.out.println(x2);

    }
}