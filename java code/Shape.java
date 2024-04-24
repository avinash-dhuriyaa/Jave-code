public class Shape {
    int length;
    int breadth;
}

public class Rectangle extends Shape {
    int area;

    public void calcualteArea() {
        area = length * breadth;
    }

    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        // Assigning values to Shape class attributes
        r.length = 10;
        r.breadth = 20;
        // Calculate the area
        r.calcualteArea();
        System.out.println("The Area of rectangle of length \""
                + r.length + "\" and breadth \"" + r.breadth + "\" is \"" + r.area + "\"");
    }
}