package 剑指offer;

public class 矩阵中的路径12 {
    int [][] direction = {{0,-1},{0,1},{1,0},{-1,0}};
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0 || word == null || word.equals("")){
            return false;
        }
        int [][] visited = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                if(isExist(board,word,0,i,j,visited)) return true;
            }
        }
        return false;
    }
    public boolean isExist(char [][] board,String word,int step,int x,int y,int [][] visited){
        if(step == word.length()) return true;
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || visited[x][y] == 1 || board[x][y] != word.charAt(step)){
            return false;
        }else{
            visited[x][y] = 1;
            boolean res = false;
            for(int i = 0; i < direction.length; i++){
                res = (res || isExist(board,word,step+1,x+direction[i][0],y+direction[i][1],visited));
            }
            visited[x][y] = 0;
            return res;
        }
    }
}
