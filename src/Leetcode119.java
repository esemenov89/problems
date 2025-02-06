import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Leetcode119 {

    /*

Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

Example 1:
Input: rowIndex = 3
Output: [1,3,3,1]

Example 2:
Input: rowIndex = 0
Output: [1]

Example 3:
Input: rowIndex = 1
Output: [1,1]


Constraints:
0 <= rowIndex <= 33

Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?
    */

    public static void main(String[] args) {
        Leetcode119 solution = new Leetcode119();
        long startDate = new Date().getTime();
        int rowIndex = 3;
        System.out.println(rowIndex);
        List<Integer> result = solution.getRow(rowIndex);
        System.out.println(result);
        System.out.println("milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        // Output: [1,3,3,1]
        startDate = new Date().getTime();
        int rowIndex2 = 0;
        System.out.println(rowIndex2);
        List<Integer> result2 = solution.getRow(rowIndex2);
        System.out.println(result2);
        System.out.println("milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: [1]
        int rowIndex3 = 33;
        System.out.println(rowIndex3);
        List<Integer> result3 = solution.getRow(rowIndex3);
        System.out.println(result3);
        System.out.println("milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: [1,1]
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result;
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }
        result = triangle.get(rowIndex);
        return result;
    }
}