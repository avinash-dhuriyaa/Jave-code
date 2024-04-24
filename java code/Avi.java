
import java.util.Scanner;

public class Avi {

    public static void main(String[] args) {
        int rows, cols;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many columns? ");
        cols = keyboard.nextInt();

        if (cols % 2 == 0) {
            int col2 = cols;
            int spaces = (cols / 2 - 1);
            int ASTS = 2;
            int test = (col2 / 2);
            while (cols > (col2 / 2)) {
                for (int x = spaces; x > 0; x--) {
                    System.out.print(" ");
                }
                for (int y = ASTS; y > 0; y--) {
                    System.out.print("*");
                }
                for (int z = spaces; z > 0; z--) {
                    System.out.print(" ");
                }
                System.out.println();
                cols--;
                ASTS += 2;
                spaces--;
            }
            spaces = (cols / 2 - 1);
            while (cols > 0) {

                if (test != (col2 / 2)) {
                    for (int x = spaces; x < (cols / 2); x++) {
                        System.out.print(" ");
                    }
                    spaces -= 2;

                }

                for (int a = ASTS - 2; a > 0; a--) {
                    System.out.print("*");

                }
                test++;
                System.out.println();
                cols--;
                ASTS -= 2;

            }
        }
    }
}