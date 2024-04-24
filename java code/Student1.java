public class Student1 {
    int age;
    String name;

    Student1() {
        age = 18;
        name = "avi";

    }

    void show() {
        System.out.println(age + " " + name);
    }
}

class Avi {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.show();
    }
}
