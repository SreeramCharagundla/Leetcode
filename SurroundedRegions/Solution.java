public class Solution {
    public static void main(String[] args) {
        char[][] board = {{'X','X','X','X'},
                          {'X','O','O','X'},
                          {'X','O','O','X'},
                          {'X','X','X','O'}};
        
        char[][] ans = solve(board);
        for(char c[]:ans){
            for(char a:c){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }

    public static char[][] solve(char[][] board){

        int rows = board.length;
        int cols = board[0].length;
        char[][] ans = new char[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                ans[i][j]=board[i][j];
            }        
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(ans[i][j]=='O' && (i-1)>=0 && (j-1)>=0 && (i+1)<rows && (j+1)<cols && ans[i][j+1]=='O' && ans[i+1][j]=='O' && ans[i+1][j+1]=='O'){                    
                    ans[i][j]='X';
                    ans[i][j+1]='X';
                    ans[i+1][j]='X';
                    ans[i+1][j+1]='X';
                }
            }        
        }


        return ans;
    }
}
