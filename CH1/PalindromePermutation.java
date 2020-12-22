package CH1;

public class PalindromePermutation {

    public static boolean solution(String str){
        int count=0;

        for (char ch :
                str.toCharArray()) {
            if(ch==' '){
                continue;
            }
            if(str.indexOf(ch)==str.lastIndexOf(ch))
            {
                count+=1;
            }
            if(count==2){
                return false;
            }
        }

        return  true;
    }
}
