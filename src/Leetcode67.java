import java.util.Arrays;

public class Leetcode67 {

/*    Example 1:

    Input: a = "11", b = "1"
    Output: "100"
    Example 2:

    Input: a = "1010", b = "1011"
    Output: "10101"*/

    public static void main(String[] args) {
        Leetcode67 solution = new Leetcode67();
        System.out.println(solution.addBinary("11", "1"));
        System.out.println(solution.addBinary("1010", "1011"));
    }

    public String addBinary(String a, String b) {
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        int k = Math.max(a.length(), b.length());
        char[] subResultChar = new char[k + 1];
        char[] charToAdd;
        Arrays.fill(subResultChar, '0');
        if (aChar.length > bChar.length) {
            System.arraycopy(aChar, 0, subResultChar, 1, k);
            charToAdd = bChar;
        } else {
            System.arraycopy(bChar, 0, subResultChar, 1, k);
            charToAdd = aChar;
        }
        char[] resultChar;
        boolean needPlusOne = false;
        for (int i = charToAdd.length - 1; i >= 0; i--) {
            if (charToAdd[i] == subResultChar[k] && charToAdd[i] == '1') {
                if (needPlusOne) {
                    subResultChar[k--] = '1';
                } else {
                    subResultChar[k--] = '0';
                }
                needPlusOne = true;
            } else if (charToAdd[i] == subResultChar[k] && charToAdd[i] == '0') {
                if (needPlusOne) {
                    subResultChar[k--] = '1';
                } else {
                    subResultChar[k--] = '0';
                }
                needPlusOne = false;
            } else {
                if (needPlusOne) {
                    subResultChar[k--] = '0';
                    needPlusOne = true;
                } else {
                    subResultChar[k--] = '1';
                    needPlusOne = false;
                }
            }
        }
        if (aChar.length != bChar.length) {
            for (; k >= 0; k--) {
                if (needPlusOne) {
                    if (subResultChar[k] == '1') {
                        subResultChar[k] = '0';
                        needPlusOne = true;
                    } else if (subResultChar[k] == '0') {
                        subResultChar[k] = '1';
                        needPlusOne = false;
                    }
                }
            }
        } else {
            if (needPlusOne) {
                subResultChar[k] = '1';
            }
        }
        if (subResultChar[0] == '0') {
            resultChar = new char[subResultChar.length - 1];
            System.arraycopy(subResultChar, 1, resultChar, 0, subResultChar.length - 1);
        } else {
            resultChar = subResultChar;
        }
        return new String(resultChar);
    }
}