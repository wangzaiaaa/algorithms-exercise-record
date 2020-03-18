package 程序员面试金典;

public class 旋转矩阵0107 {
    public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return;
        }else{
            int len = matrix.length;

            for(int i = 0; i < len; i++){
                for(int j = i + 1; j < len; j++){
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = tmp;
                }
            }
            for (int i = 0; i < len / 2; i++){
                for(int j = 0; j < len; j++){
                    int tmp = matrix[j][i];
                    matrix[j][i] = matrix[j][len-i-1];
                    matrix[j][len-i-1] = tmp;
                }
            }
        }
    }

}
