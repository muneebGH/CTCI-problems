package CH1;

public class IsUnique {
    public static boolean solution(String str) {

        for (char ch :
                str.toCharArray()) {
            if (str.lastIndexOf(ch) != str.indexOf(ch)) {
                return false;
            }
        }
        return true;
    }

}
