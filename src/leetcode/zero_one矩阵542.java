package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class zero_one矩阵542 {
    int [][] dir = {{-1,0},{1,0},{0,1},{0,-1}};
    public int[][] updateMatrix(int[][] matrix) {
       bfs(matrix);
       return matrix;
    }
    public void bfs(int [][] matrix){
      Queue<Point> queue = new LinkedList<>();
      for(int i = 0; i < matrix.length; i++){
          for(int j = 0; j < matrix[i].length; j++){
              if(matrix[i][j] == 0){
                  queue.offer(new Point(i,j,0));
              }else{
                  matrix[i][j] = matrix.length + matrix[0].length;
              }
          }
      }
      Point p;
      while (!queue.isEmpty()){
          p = queue.poll();
          matrix[p.x][p.y] = p.v;
          for(int i = 0; i < dir.length; i++){
              int X = p.x + dir[i][0],Y = p.y + dir[i][1];
              if(X >= 0 && X < matrix.length && Y >= 0 && Y < matrix[0].length && matrix[X][Y] > 1 + p.v){
                  matrix[X][Y] = 1 + p.v;
                  queue.offer(new Point(X,Y,p.v + 1));
              }
          }
      }
    }


}
class Point{
    int x,y,v;
    Point(int x,int y,int v){
        this.x = x;
        this.y = y;
        this.v = v;
    }
}

