public class Leetcode20 {

    public static void main(String[] args) {
        Leetcode20 leetcode = new Leetcode20();
        String s = "()"; // true
        System.out.println(leetcode.isValid(s));
        s = "()[]{}"; // true
        System.out.println(leetcode.isValid(s));
        s = "(]"; // false
        System.out.println(leetcode.isValid(s));
        s = "([])"; // true
        System.out.println(leetcode.isValid(s));
        s = "([()]){}"; // true
        System.out.println(leetcode.isValid(s));
        s = "([())){}"; // false
        System.out.println(leetcode.isValid(s));
        s = "{}[]{}"; // true
        System.out.println(leetcode.isValid(s));
        s = "{}[}{]"; // false
        System.out.println(leetcode.isValid(s));
    }

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    if (i == s.length() - 1) {
                        return false;
                    }
                    if (s.charAt(i + 1) == ')') {
                        s = getSubstring(i, s);
                        i = -1;
                    }
                    break;
                case '[':
                    if (i == s.length() - 1) {
                        return false;
                    }
                    if (s.charAt(i + 1) == ']') {
                        s = getSubstring(i, s);
                        i = -1;
                    }
                    break;
                case '{':
                    if (i == s.length() - 1) {
                        return false;
                    }
                    if (s.charAt(i + 1) == '}') {
                        s = getSubstring(i, s);
                        i = -1;
                    }
                    break;
            }
            if (s.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private String getSubstring(int i, String s) {
        if (i == 0) {
            if (s.length() == 2) {
                return "";
            }
            s = s.substring(2);
        } else {
            s = s.substring(0, i) + s.substring(i + 2);
        }
        return s;
    }
}