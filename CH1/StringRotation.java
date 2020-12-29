package CH1;

public class StringRotation {
    public static Boolean solution(String s1,String s2){
        int rotateIndex=s1.indexOf(s2.charAt(0));
        if(rotateIndex<0) return false;
        if(isSubstring(s2,s1.substring(rotateIndex))){
            s1=s1.substring(0,rotateIndex);
            s2=s2.substring(s2.length()-rotateIndex);
            return s1.equals(s2);
        }

        return false;
    }
    public static boolean isSubstring(String str, String sub) {
        return str.indexOf(sub) >= 0;
    }
}
