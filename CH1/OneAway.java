package CH1;

public class OneAway {
    public static boolean solution(String a,String b){
        if(a.length()==b.length() || a.length()-b.length()==1 || a.length()-b.length()==-1){
            int count=0;
            if(a.length()!=b.length()){
                count=1;
            }
            int[] map=new int[26];
            for (char ch :
                    a.toCharArray()) {
                map[ch - 97]++;
            }

            for (char ch :
                    b.toCharArray()) {
                if(map[ch-97]==0){
                    count=count+1;
                }

                if(count==2){
                    return false;
                }


            }
            return true;
        }else{
            return false;
        }


    }

}
