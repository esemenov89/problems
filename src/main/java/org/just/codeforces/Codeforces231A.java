package org.just.codeforces;

import java.util.Scanner;

public class Codeforces231A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int countGuys = 3;
        int countForResolve = 2;
        int n = in.nextInt();
        int[][] matrix = new int[n][countGuys];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < countGuys; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        int lineSum = 0;
        int resolveSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < countGuys; j++) {
                lineSum += matrix[i][j];
            }
            if (lineSum >= countForResolve) {
                resolveSum++;
            }
            lineSum = 0;
        }
        System.out.println(resolveSum);
    }
}