public class Fctorial {
    public static void main(String arg[]) {
        int n = 5, fact = 1;

        for (int i = 1; i <= n; i++) {

            fact = fact * i;
        }

        System.out.println("factoral=" + fact);
    }
}