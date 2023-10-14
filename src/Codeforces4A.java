import java.util.Scanner;

public class Codeforces4A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        System.out.println(w % 2 == 0 && w > 2 ? "YES" : "NO");
    }
}