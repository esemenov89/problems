import java.util.Scanner;

public class Leetcode9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        Leetcode9 leetcode = new Leetcode9();
        System.out.println(leetcode.isPalindrome(x));
    }

    public boolean isPalindrome(int x) {
        boolean result = true;
        if (x < 10 && x > -1) {
            result = true;
        } else if (x < 0) {
            result = false;
        } else {
            char[] charX = String.valueOf(x).toCharArray();
            for (int i = 0; i < charX.length / 2; i++) {
                if (charX[i] != charX[charX.length - 1 - i]) {
                    result = false;
                }
            }
        }
        return result;
    }
}