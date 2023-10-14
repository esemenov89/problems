import java.util.Map;
import java.util.Scanner;

public class Leetcode13 {

    private static final Map<Character, Integer> romanSymbols = Map.of('I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String roman = in.next();
        Leetcode13 leetcode = new Leetcode13();
        System.out.println(leetcode.romanToInt(roman));
    }

    public int romanToInt(String s) {
        int result = 0;
        char[] roman = s.toCharArray();
        for (int i = 0; i < roman.length; i++) {
            if (i != roman.length - 1 && romanSymbols.get(roman[i]) < romanSymbols.get(roman[i + 1])) {
                if (romanSymbols.get(roman[i]) < romanSymbols.get(roman[i + 1])) {
                    result += romanSymbols.get(roman[i + 1]) - romanSymbols.get(roman[i]);
                    i++;
                }
            } else {
                result += romanSymbols.get(roman[i]);
            }
        }
        return result;
    }
}