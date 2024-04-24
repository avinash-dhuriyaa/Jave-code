
public class Prime {
    public static void main(String[] args) {
        int n = 5;
        if (isPrime(n)) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// using recrusion
public class Main {
    public static void main(String[] args) {
        int n = 5;
        if (isPrime(n, 2)) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }

    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return n == 2;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }
}

// all prime 1-100
public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// using recrusion
public class Main {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            printPrime(i, 2);
        }
    }

    public static void printPrime(int n, int i) {
        if (n <= 2) {
            if (n == 2) {
                System.out.println(n);
            }
            return;
        }
        if (n % i == 0) {
            return;
        }
        if (i * i > n) {
            System.out.println(n);
            return;
        }
        printPrime(n, i + 1);
    }
}