package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 太平洋大西洋水流问题417 {
    int [][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> res = new ArrayList<>();
        if(matrix == null || matrix.length == 0) return res;
        int row = matrix.length,col = matrix[0].length;
        int [][] visited = new int[row][col];
        int [][] ocean1 = new int[row][col];
        int [][] ocean2 = new int[row][col];
        for(int i = 0; i < col; i++){
            ocean1[0][i] = 1;
            dfs(ocean1,0,i,matrix[0][i],visited,matrix);
        }
        for(int i = 0; i < row; i++){
            ocean1[i][0] = 1;
            dfs(ocean1,i,0,matrix[i][0],visited,matrix);
        }
        for(int i = 0; i < row; i++){
            Arrays.fill(visited[i],0);
        }
        for(int i = 0; i < row; i++){
            ocean2[i][col - 1] = 1;
            dfs(ocean2,i,col - 1,matrix[i][col - 1],visited,matrix);
        }
        for(int i = 0; i < col; i++){
            ocean2[row - 1][i] = 1;
            dfs(ocean2,row - 1,i,matrix[row-1][i],visited,matrix);
        }
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(ocean1[i][j] + ocean2[i][j] == 2){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }
    public void dfs(int [][] ocean,int x,int y,int preHeight,int [][] visited,int [][] matrix){
        if(x < 0 || x >= ocean.length || y < 0 || y >= ocean[0].length || visited[x][y] == 1 || matrix[x][y] < preHeight){
            return;
        }
        visited[x][y] = 1;
        ocean[x][y] = 1;
        for(int i = 0; i < directions.length; i++){
            dfs(ocean,x + directions[i][0],y + directions[i][1],matrix[x][y],visited,matrix);
        }
    }
}
