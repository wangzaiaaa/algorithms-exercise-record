package 程序员面试金典;

import java.util.Arrays;

public class 零矩阵0108 {
    int [][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
    public void setZeroes(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return;
        }else{
            int [] row = new int[matrix.length];
            int [] col = new int[matrix[0].length];
            Arrays.fill(row,1);
            Arrays.fill(col,1);
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[0].length; j++){
                    if(matrix[i][j] == 0){
                        row[i] = 0;
                        col[j] = 0;
                    }
                }
            }
            for(int i = 0; i < matrix.length; i++){
                for (int j = 0; j < matrix[0].length; j++){
                    matrix[i][j] *= (row[i] * col[j]);
                }
            }
        }
    }

}


