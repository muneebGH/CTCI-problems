package CH1;

public class RotateMatrix {
    public void solution(int[][] mat) {
        //take transpose
        int n=mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        //flip

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n/2); j++) {
               int temp=mat[i][j];
               mat[i][j]=mat[i][n-1-j];
               mat[i][n-1-j]=temp;
            }
        }

    }




}
