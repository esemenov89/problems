package org.just.leetcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Leetcode118 {

    /*

Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
Input: numRows = 1
Output: [[1]]

Constraints:
1 <= numRows <= 30
    */

    public static void main(String[] args) {
        Leetcode118 solution = new Leetcode118();
        long startDate = new Date().getTime();
        int numRows = 5;
        System.out.println(numRows);
        List<List<Integer>> result = solution.generate(numRows);
        solution.print(result);
        System.out.println("milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        startDate = new Date().getTime();
        int numRows2 = 30;
        System.out.println(numRows2);
        List<List<Integer>> result2 = solution.generate(numRows2);
        solution.print(result2);
        System.out.println("milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
        int numRows3 = 1;
        System.out.println(numRows3);
        List<List<Integer>> result3 = solution.generate(numRows3);
        solution.print(result3);
        System.out.println("milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(row);
        }
        return result;
    }

    private void print(List<List<Integer>> result) {
        for (int i = 0; i < result.size(); i++) {
            if (i == 0) {
                System.out.print("[");
            }
            for (int j = 0; j < result.get(i).size(); j++) {
                if (j == 0) {
                    System.out.print("[");
                }
                System.out.print(result.get(i).get(j));
                if (j == result.get(i).size() - 1) {
                    System.out.print("]");
                } else {
                    System.out.print(",");
                }
            }
            if (i == result.size() - 1) {
                System.out.print("]");
            } else {
                System.out.print(",");
            }
        }
    }
}