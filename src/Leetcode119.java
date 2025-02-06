import java.util.Arrays;
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
        //Output: [1, 33, 528, 5456, 40920, 237336, 1107568, 4272048, 13884156, 38567100, 92561040, 193536720, 354817320, 573166440, 818809200, 1037158320, 1166803110, 1166803110, 1037158320, 818809200, 573166440, 354817320, 193536720, 92561040, 38567100, 13884156, 4272048, 1107568, 237336, 40920, 5456, 528, 33, 1]
    }

    public List<Integer> getRow(int rowIndex) {
        Integer[] rowBefore = new Integer[rowIndex + 1];
        Integer[] row = new Integer[rowIndex + 1];
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    rowBefore[j] = 1;
                    row[j] = 1;
                } else {
                    row[j] = rowBefore[j] + rowBefore[j - 1];
                }
            }
            rowBefore = Arrays.copyOf(row, rowIndex + 1);
        }
        return Arrays.asList(row);
    }
}