import java.util.*;

public class Singleinheritnce {
    int l;
    int w;
}

class Rectangle extends Singleinheritnce {
    int area;

    public void calarea() {
        area = l * w;
    }

}

    public static void main(String[] args) {
            Rectangle r = new Rectangle();

            r.l = 3;
            r.w = 5;
            r.calarea();
            System.out.println("The Area of rectangle of length \""
                    + r.l + "\" and breadth \"" + r.w + "\" is \"" + r.area + "\"");

        }
