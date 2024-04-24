import java.util.LinkedList;

class Link {
    public static class Node {
        int data; // valuse
        Node next; // address of next node

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(2);
        // Node c = new Node(4);
        // Node d = new Node(6);
        a.next = b;
        // b.next = c;
        // c.next = d;

        System.out.println(a.next.data);
    }

}
