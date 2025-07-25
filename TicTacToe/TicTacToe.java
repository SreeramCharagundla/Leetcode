package TicTacToe;

public class TicTacToe {

    public int[][] board;
    private int n;

    public TicTacToe(int n) {
        board = new int[n][n];
        this.n = n;
    }

    public int move(int row, int col, int player) {
        board[row][col] = player;
        if(checkRow(row,player)|| checkColumn(col,player) || (row==col && checkDiagonal(player)) || (col == n-row-1 && checkAntiDiagonal(player)))
            return player;

        return 0;
    }

    private boolean checkDiagonal(int player){
        for(int row = 0; row<n;row++){
            if(board[row][row]!=player) return false;
        }
        return true;
    }

    private boolean checkAntiDiagonal(int player){
        for(int row = 0; row<n;row++){
            if(board[row][n-row-1]!=player) return false;
        }
        return true;
    }

    private boolean checkColumn(int col, int player){
        for(int row = 0; row<n; row++){
            if(board[row][col]!=player) return false;
        }
        return true;
    }

    private boolean checkRow(int row, int player){
        for(int col = 0; col<n; col++){
            if(board[row][col]!=player) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe(3);

        System.out.println(ticTacToe.move(0, 0, 1)); 
        System.out.println(ticTacToe.move(0, 2, 2)); 
        System.out.println(ticTacToe.move(2, 2, 1)); 
        System.out.println(ticTacToe.move(1, 1, 2)); 
        System.out.println(ticTacToe.move(2, 0, 1)); 
        System.out.println(ticTacToe.move(1, 0, 2)); 
        System.out.println(ticTacToe.move(2, 1, 1)); 
    }
}
