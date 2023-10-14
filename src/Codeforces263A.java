import java.util.Scanner;

public class Codeforces263A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        int m = 5;
        int[][] matrix = new int[n][m];
        int iPos = 0;
        int jPos = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = in.nextInt();
                if (matrix[i][j] == 1) {
                    iPos = i + 1;
                    jPos = j + 1;
                }
            }
        }
        System.out.println(Math.abs(3 - iPos) + Math.abs(3 - jPos));
    }
}