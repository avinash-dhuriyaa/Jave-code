class Foo {
    static String text = "Foo";
}

class Bar extends Foo {
    void printText() {
        System.out.println(Foo.text);
    }
}

class Test {
    public static void main(String[] args) {
       System.out.println(Bar.text);
     }
}