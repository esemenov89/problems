package org.just.leetcode;

public class Leetcode70 {

/*    Example 1:

    Input: n = 2
    Output: 2
    Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
    Example 2:

    Input: n = 3
    Output: 3
    Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step*/

    public static void main(String[] args) {
        Leetcode70 solution = new Leetcode70();
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 4;
        int n5 = 5;
        int n6 = 6;
        int n7 = 23;
        int n8 = 45;
        System.out.println(n1 + " = " + solution.climbStairs(n1));
        System.out.println(n2 + " = " + solution.climbStairs(n2));
        System.out.println(n3 + " = " + solution.climbStairs(n3));
        System.out.println(n4 + " = " + solution.climbStairs(n4));
        System.out.println(n5 + " = " + solution.climbStairs(n5));
        System.out.println(n6 + " = " + solution.climbStairs(n6));
        System.out.println(n7 + " = " + solution.climbStairs(n7));
        System.out.println(n7 + " = " + solution.climbStairs(n8));
    }

    public int climbStairs(int n) {
        // Сколько вариантов набора пинкода из 4 цифр: 10 в степени 4 - 1
        // так как у меня 2 цифры то получается 2 в степени n - 1
        // Не тут чето еще нужно
        // 1
        // 1
        ///
        // 2
        // 1 + 1
        // 2
        ///
        // 3
        // 1 + 1 + 1
        // 2 + 1
        // 1 + 2
        ///
        // 4
        // 1 + 1 + 1 + 1
        // 2 + 2
        // 2 + 1 + 1
        // 1 + 2 + 1
        // 1 + 1 + 2
        ///
        // 5
        // 1 + 1 + 1 + 1 + 1
        // 2 + 1 + 1 + 1
        // 1 + 2 + 1 + 1
        // 1 + 1 + 2 + 1
        // 1 + 1 + 1 + 2
        //
        // 2 + 2 + 1
        // 2 + 1 + 2
        // 2 + 1 + 1
        // 1 + 2 + 2
        ///
        // 6
        // 1 + 1 + 1 + 1 + 1 + 1
        // 2 + 2 + 2
        // 2 + 1 + 1 + 1 + 1
        // 1 + 2 + 1 + 1 + 1
        // 1 + 1 + 2 + 1 + 1
        // 1 + 1 + 1 + 2 + 1
        // 1 + 1 + 1 + 1 + 2
        //
        // 2 + 2 + 1 + 1
        // 2 + 1 + 2 + 1
        // 2 + 1 + 1 + 2
        // 1 + 2 + 2 + 1
        // 1 + 1 + 2 + 2
        //
        //
        // Кол-во позиций равно n - максимальное число позиций
        // Кол-во позиций равно n/2 (+ 1 если нечетное)- минимальное число позиций
        // Итого 1 позиция с единицами,
        // Если берем 1 двойку то кол во позиций уменьшается на 1, но кол-во вариантов становится кол-во позиций
        if (n == 3) {
            return 3;
        }
        boolean isEven = n % 2 == 0;
        int result = isEven ? 2 : 1;
        int k = n - 1;
        while (k > 2) {
            result = result + k;
            k = k - 1;
        }

        return result;
    }
}
