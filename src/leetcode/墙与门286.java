package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class 墙与门286 {
    public static final int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
    public static final int Inf = 0x7fffffff;
    public void wallsAndGates(int[][] rooms) {
        bfs(rooms);
    }
    public void bfs(int [][] rooms){
        if(rooms == null || rooms.length == 0){
            return;
        }
        Queue<point> queue = new LinkedList<>();
        int row = rooms.length,col = rooms[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(rooms[i][j] == 0){
                    queue.offer(new point(i,j,0));
                }
            }
        }
        point p;
        while (!queue.isEmpty()){
            p = queue.poll();
            for (int i = 0; i < directions.length; i++){
                int x = p.x + directions[i][0],y = p.y + directions[i][1];
                if(x >=0 && x < row && y >= 0 && y < col && rooms[x][y] != -1 && rooms[x][y] > p.dis + 1){
                    rooms[x][y] = p.dis + 1;
                    queue.offer(new point(x,y,p.dis + 1));
                }
            }
        }
    }
}
class point{
    int x,y,dis;
    point(int x,int y,int dis){
        this.x = x;
        this.y = y;
        this.dis = dis;
    }
}
