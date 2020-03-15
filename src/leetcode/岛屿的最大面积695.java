package leetcode;

public class 岛屿的最大面积695 {
    int [][] direction = {{0,1},{0,-1},{-1,0},{1,0}};
    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int res = 0;
        int [][] visited = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                res = Math.max(res,maxArea(grid,i,j,visited));
            }
        }
        return res;
    }
    public int maxArea(int [][] grid,int x,int y,int [][] visited){
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 0 || visited[x][y] == 1){
            return 0;
        }else{
            visited[x][y] = 1;
            int res = 1;
            for(int i = 0; i < direction.length; i++){
                res += maxArea(grid,x+direction[i][0],y+direction[i][1],visited);
            }
            return res;
        }

    }
}
