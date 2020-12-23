package CH1;

public class StringCompression {

    public static String solution(String str) {

        if (str.equals("")) {
            return str;
        }

        char currentChar = str.charAt(0);
        StringBuilder res = new StringBuilder();
        int currentCharCount = 0;
        for (char ch :
                str.toCharArray()) {
            if (ch == currentChar) {
                currentCharCount = currentCharCount + 1;
            } else {
                res.append(currentChar);
                res.append(currentCharCount);
                currentCharCount = 1;
                currentChar = ch;
            }
        }
        res.append(currentChar);
        res.append(currentCharCount);

        if (str.length() < res.length()) {
            return str;
        }
        return res.toString();

    }
}
