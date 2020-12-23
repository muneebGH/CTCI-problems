package CH1;

//TODO: Resolve inner box bugs
public class RotateMatrix {
    public void solution(int[][] mat) {
        int start=0;
        for(int i=mat[0].length-1;i>0;i=i-2){
            rotateBox(mat,i,i,start,start);
            start++;
        }
    }

    private void rotateBox(int[][] box, int lastRow,int lastCol, int startRow, int startCol) {

        for(int i=startRow;i<=lastRow;i++){
            for(int j=startCol;j<=lastCol;j++){
                System.out.print(box[i][j]+" ");
            }
            System.out.println();
        }
        int nextColIndex = lastCol;
        int nextRowIndex = startRow;
        int storedNum = box[startRow][startCol];
        boolean rowTurn=true;

        for (int i = 0; i <= (lastRow-startRow)*4; i++) {
            int temp = box[nextRowIndex][nextColIndex];
            box[nextRowIndex][nextColIndex] = storedNum;
            storedNum=temp;
            rowTurn=!rowTurn;
            if(i!=0 && i%4==0){
                nextRowIndex++;
                storedNum=box[nextRowIndex][nextColIndex];
            }
            if(rowTurn){
                int tempCol=nextColIndex;
                nextColIndex=lastCol-nextRowIndex;
                nextRowIndex=tempCol;

            }else {
                int tempRow=nextRowIndex;
                nextRowIndex=nextColIndex;
                nextColIndex=lastRow-tempRow;
            }

        }

    }

}
