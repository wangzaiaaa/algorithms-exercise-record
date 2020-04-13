package leetcode;

public class 岛屿数量200 {
    int res = 0;
    int [][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
    public int numIslands(char[][] grid) {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    res++;
                    dfs(grid,i,j);
                }
            }
        }
        return res;
    }
    public void dfs(char [][] grid,int x,int y){
        if(x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == '0'){
            return;
        }else{
            grid[x][y] = '0';
            for(int i = 0; i < dir.length; i++){
                dfs(grid,x + dir[i][0],y + dir[i][1]);
            }
        }
    }

}
