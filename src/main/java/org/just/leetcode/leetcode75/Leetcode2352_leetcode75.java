package org.just.leetcode.leetcode75;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Leetcode2352_leetcode75 {

/*

Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.
A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).


Example 1:
Input: grid = [[3,2,1],[1,7,6],[2,7,7]]
Output: 1
Explanation: There is 1 equal row and column pair:
- (Row 2, Column 1): [2,7,7]

Example 2:
Input: grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
Output: 3
Explanation: There are 3 equal row and column pairs:
- (Row 0, Column 0): [3,1,2,2]
- (Row 2, Column 2): [2,4,2,2]
- (Row 3, Column 2): [2,4,2,2]


Constraints:
n == grid.length == grid[i].length
1 <= n <= 200
1 <= grid[i][j] <= 10^5

*/

    public static void main(String[] args) {
        Leetcode2352_leetcode75 solution = new Leetcode2352_leetcode75();
        long startDate = new Date().getTime();
        int[][] grid = new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        System.out.println("grid");
        solution.printGrid(grid);
        System.out.println(solution.equalPairs(grid) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 1
        startDate = new Date().getTime();
        int[][] grid2 = new int[][]{{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
        System.out.println("grid2");
        solution.printGrid(grid2);
        System.out.println(solution.equalPairs(grid2) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 3
        startDate = new Date().getTime();
        int[][] grid3 = new int[200][200];
        System.out.println("grid3");
        for (int[] ints : grid3) {
            Arrays.fill(ints, 100000);
        }
        solution.printGrid(grid3);
        System.out.println(solution.equalPairs(grid3) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 40000
        startDate = new Date().getTime();
        int[][] grid4 = new int[][]{{1}};
        System.out.println("grid4");
        solution.printGrid(grid4);
        System.out.println(solution.equalPairs(grid4) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 1
        startDate = new Date().getTime();
        int[][] grid5 = new int[][]{{11, 1}, {1, 11}};
        System.out.println("grid5");
        solution.printGrid(grid5);
        System.out.println(solution.equalPairs(grid5) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 1
    }

    public int equalPairs(int[][] grid) {
        int result = 0;
        Map<Integer, String> rowsMap = new HashMap<>();
        Map<Integer, String> columnsMap = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (j == 0) {
                    rowsMap.put(i, String.valueOf(grid[i][j]));
                } else {
                    rowsMap.put(i, rowsMap.get(i) + "-" + grid[i][j]);
                }
                if (i == 0) {
                    columnsMap.put(j, String.valueOf(grid[i][j]));
                } else {
                    columnsMap.put(j, columnsMap.get(j) + "-" + grid[i][j]);
                }
            }
        }
        for (int i = 0; i < rowsMap.size(); i++) {
            for (int j = 0; j < columnsMap.size(); j++) {
                if (rowsMap.get(i).equals(columnsMap.get(j))) {
                    result++;
                }
            }
        }
        return result;
    }

    private void printGrid(int[][] grid) {
        for (int[] ints : grid) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}