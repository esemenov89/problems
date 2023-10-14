import java.util.Scanner;

public class Codeforces112A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next().toLowerCase();
        String str2 = in.next().toLowerCase();
        int result = str1.compareTo(str2);
        if (result < 0) {
            result = -1;
        }
        if (result > 0) {
            result = 1;
        }
        System.out.println(result);
    }
}