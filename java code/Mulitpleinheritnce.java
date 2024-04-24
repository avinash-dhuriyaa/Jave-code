public class Mulitpleinheritnce {
    void a() {
        System.out.println("A");
    }

}

class B extends A {
    void a() {
        System.out.println("class B");
    }
}

class C extends B {
    void a();

    {
        System.out.println("class c");
    }
}
class D extends C{
    public static void main(String[] args) {
        
    }

}