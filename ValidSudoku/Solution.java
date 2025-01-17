import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        
        for(int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char current = board[i][j];
                if(current != '.'){
                    // Check row
                    if(!rows[i].add(current)){
                        return false;
                    }
                    // Check column
                    if(!cols[j].add(current)){
                        return false;
                    }
                    // Check box
                    int boxIndex = (i / 3) * 3 + j / 3;
                    if(!boxes[boxIndex].add(current)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}