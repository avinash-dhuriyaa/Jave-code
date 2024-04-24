public class Rectangle {
    // public static void main(String[] args) {
    // double length = 5.0;
    // double width = 10.0;
    // double area = length * width;
    // System.out.println("Area of rectangle: " + area);
    // }
    // }
    public class Incre {
        void Increorder(int n) {
            if (n == 1) {
                System.out.println(1);
                return;
            }
            Increorder(n - 1);
            System.out.println(n);
        }

        public void main(String[] args) {
            int n = 10;
            // System.out.println(n);
            Increorder(n);
        }
    }
}