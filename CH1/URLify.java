package CH1;

public class URLify {
    public static String solution(String str) {
        int originalLength = str.stripTrailing().length();
        char[] arr = str.toCharArray();
        for (int i = 0; i < originalLength; i++) {
            if (arr[i] == ' ') {
                arr[i] = '%';
                shiftArrayToRight(arr, i + 1);
                arr[i + 1] = '2';
                arr[i + 2] = '0';
                i += 2;
            }
        }

        return String.valueOf(arr);
    }

    private static void shiftArrayToRight(char[] arr, int from) {
        //assuming that array have available space
        for (int i = arr.length - 1; i >= from + 2; i--) {
            arr[i] = arr[i - 2];
        }
    }
}
