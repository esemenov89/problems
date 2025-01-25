package studyplan.leetcode75;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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
        int[][] grid = new int[][]{{3,2,1},{1,7,6},{2,7,7}};
        System.out.println("grid");
        System.out.println(solution.equalPairs(grid) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: true
    }

    public int equalPairs(int[][] grid) {
        int result = 0;
        return result;
    }
}