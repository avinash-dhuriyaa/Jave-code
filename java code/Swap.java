class Swap {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        b = b * b - a;
        a = b - a;
        b = b - a;
        a = b - a;

        System.out.println(a);
        System.out.println(b);

    }
}