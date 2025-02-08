package org.just.codeforces;

import java.util.Scanner;

public class Codeforces158A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] points = new int[n];
        for (int i = 0; i < n; i++) {
            points[i] = in.nextInt();
        }
        int countMembersToNextRound = 0;
        for (int i = 0; i < n; i++) {
            if (points[i] > 0 && points[i] >= points[k - 1]) {
                countMembersToNextRound++;
            }
        }
        System.out.println(countMembersToNextRound);
    }
}