package CH1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.IntConsumer;

public class CheckPermutations {
    public static boolean checkPermutation(String str, String str2) {
        StringBuilder target = new StringBuilder(str2);
        for (char c :
                str.toCharArray()) {
            int index = target.indexOf(String.valueOf(c));
            if (index != -1) {
                target.deleteCharAt(index);
            }
        }

        return target.toString().length() == 0;
    }
}
