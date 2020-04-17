package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 二进制矩阵中的最短路径1091 {
    int [][] directions = {{0,-1},{-1,-1},{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1}};
    private class Point{
        int x,y,path;
        Point(int x,int y,int path){
            this.x = x;
            this.y = y;
            this.path = path;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] != 0){
            return -1;
        }
        int row = grid.length,col = grid[0].length;
        int [][] dis = new int[row][col];
        for (int i = 0; i < row; i++){
            Arrays.fill(dis[i],row + col);
        }
        Point first = new Point(0,0,1);
        Queue<Point> queue = new LinkedList<>();
        queue.offer(first);
        Point p;
        while (!queue.isEmpty()){
            p = queue.poll();
            if(p.x == row- 1 && p.y == col - 1){
                return p.path;
            }
            for(int i = 0; i < directions.length; i++){
                int x = p.x + directions[i][0],y = p.y + directions[i][1];
                if(x >= 0 && x < row && y >= 0 && y < col && grid[x][y] == 0 && dis[x][y] > p.path + 1){
                    dis[x][y] = p.path + 1;
                    queue.offer(new Point(x,y,p.path + 1));
                }
            }
        }
        return -1;
    }

}

