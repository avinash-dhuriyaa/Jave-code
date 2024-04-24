import javax.annotation.processing.ProcessingEnvironment;

public class Solution {
    public static void main(String[] args) {
        int a = 50;
        int b = 100;
        int c = (a > b) ? a : b;
        System.out.println(c);
    }
}
