package 剑指offer;

public class 机器人的运动范围13 {
    int [][] direction = {{0,1},{0,-1},{1,0},{-1,0}};
    public int movingCount(int m, int n, int k) {
        if(m <= 0 || n <= 0) return 0;
        else if(k <= 0) return 1;
        int [][] matrix = new int[m][n];
        int [][] visited = new int[m][n];
        return move(matrix,visited,0,0,k);
    }
    public boolean check(int x,int y,int k){
        int res = 0;
        while (x != 0){
            res += (x % 10);
            x /= 10;
        }
        while (y != 0){
            res += (y % 10);
            y /= 10;
        }
        return res <= k;
    }
    public int move(int [][] matrix,int [][] visited,int x,int y,int k){
        if(x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length || visited[x][y] == 1 || !check(x,y,k)){
            return 0;
        }else{
            int res= 1;
            visited[x][y] = 1;
            for (int i = 0; i < direction.length; i++){
                res += move(matrix,visited,x+direction[i][0],y+direction[i][1],k);
            }
            return res;
        }
    }
}
