public class EvenOdd {
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int number = 4; // Change this to the number you want to check

        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}

// using recusion
public class EvenOdd {
    public static boolean isEven(int number) {
        if (number == 0) {
            return true;
        } else if (number == 1) {
            return false;
        } else {
            return isEven(number - 2);
        }
    }

    public static void main(String[] args) {
        int number = 4; // Change this to the number you want to check

        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }}

    // using switch statement
    int num = 8;

    switch(num%2)
    {
  case 0:
    System.out.println("The number is even.");
    break;
  case 1:
    System.out.println("The number is odd.");
    break;
}
