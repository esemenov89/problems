public class Leetcode14 {

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        Leetcode14 leetcode = new Leetcode14();
        System.out.println(leetcode.longestCommonPrefix(strs));
        strs = new String[]{"flower", "rlow", "klight"};
        System.out.println(leetcode.longestCommonPrefix(strs));
        strs = new String[]{"ab", "a"};
        System.out.println(leetcode.longestCommonPrefix(strs));
        strs = new String[]{"reflower", "flow", "flight"};
        System.out.println(leetcode.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        String answer = "";
        if (strs.length == 0) {
            return answer;
        }
        answer = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < answer.length()) {
                answer = strs[i];
            }
        }
        String str;
        for (String s : strs) {
            str = s;
            for (int j = 0; j < str.length() && j < answer.length(); j++) {
                if (str.charAt(j) != answer.charAt(j)) {
                    answer = str.substring(0, j);
                }
            }
        }
        return answer;
    }
}