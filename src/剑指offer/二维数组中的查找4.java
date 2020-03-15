package 剑指offer;

import java.security.PublicKey;

public class 二维数组中的查找4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }else{
            return find(matrix,target,0,matrix[0].length-1);
        }
    }
    public boolean find(int [][] matrix,int target,int x,int y){
        if(x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length){gi
            return false;
        }else{
            if(matrix[x][y] == target){
                return true;
            }else if(target > matrix[x][y]){
                return find(matrix,target,x+1,y);
            }else{
                return find(matrix,target,x,y-1);
            }
        }
    }
}
