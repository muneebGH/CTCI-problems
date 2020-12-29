package CH1;

import java.util.HashMap;
import java.util.HashSet;

//TODO: do it in constant space
public class ZeroMatrix {
    public void solution(int[][] matrix){
        //m+n space solution
        HashSet<Integer> rowSet=new HashSet<>();
        HashSet<Integer> colSet=new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]==0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(rowSet.contains(i)|| colSet.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }


    }

}
