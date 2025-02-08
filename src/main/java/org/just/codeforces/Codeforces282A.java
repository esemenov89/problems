package org.just.codeforces;

import java.util.Scanner;

public class Codeforces282A {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String commandPlus = "++";
        String commandMinus = "--";
        int n = in.nextInt();
        String[] commands = new String[n];
        for (int i = 0; i < n; i++) {
            commands[i] = in.next();
        }
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (commands[i].contains(commandPlus)) {
                x++;
            } else if (commands[i].contains(commandMinus)) {
                x--;
            }
        }
        System.out.println(x);
    }
}