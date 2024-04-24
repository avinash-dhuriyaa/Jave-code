import java.lang.Math;

public class Math {
    public static void main(String[] args) {
        double x = -10.5;
        double y = 5.3;
        double z = 0.0;

        // absolute value of x
        System.out.println(Math.abs(x)); // prints "10.5"

        // ceiling of x
        System.out.println(Math.ceil(x)); // prints "-10.0"

        // floor of x
        System.out.println(Math.floor(x)); // prints "-11.0"

        // max of x and y
        System.out.println(Math.max(x, y)); // prints "5.3"

        // min of x and y
        System.out.println(Math.min(x, y)); // prints "-10.5"

        // x raised to the power of y
        System.out.println(Math.pow(x, y)); // prints "0.0003868562622766613"

        // square root of y
        System.out.println(Math.sqrt(y)); // prints "2.305505046330389"

        // the value of pi
        System.out.println(Math.PI); // prints "3.141592653589793"

        // the value of e
        System.out.println(Math.E); // prints "2.718281828459045"
    }
}
