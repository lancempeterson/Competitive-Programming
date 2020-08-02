class Solution {
    private int row = 0;
    private int column = 0;
    private HashSet<Character> subBox1 = new HashSet<>();
    private HashSet<Character> subBox2 = new HashSet<>();
    private HashSet<Character> subBox3 = new HashSet<>();
    private HashSet<Character> subBox4 = new HashSet<>();
    private HashSet<Character> subBox5 = new HashSet<>();
    private HashSet<Character> subBox6 = new HashSet<>();
    private HashSet<Character> subBox7 = new HashSet<>();
    private HashSet<Character> subBox8 = new HashSet<>();
    private HashSet<Character> subBox9 = new HashSet<>();
    
    public boolean isValidSudoku(char[][] board) {
        while (row <= 8 && column <= 8){
            char dig = board[row][column];
            HashSet<Character> set = getSetBasedOnXY(row, column);
            if (dig != '.'){
                if (set.contains(dig)){
                    return false;
                }
                set.add(dig);
                int left = column-1;
                int right = column+1;
                while (left >= 0){
                    if (dig == board[row][left]){
                        return false;
                    }
                    left--;
                }
                while (right <= 8){
                    if (dig == board[row][right]){
                        return false;
                    }
                    right++;
                }
                int up = row-1;
                int down = row+1;
                while (up >= 0){
                    if (dig == board[up][column]){
                        return false;
                    }
                    up--;
                }
                while (down <= 8){
                    if (dig == board[down][column]){
                        return false;
                    }
                    down++;
                }
            }
            if (column == 8){
                row++;
                column = 0;
            }
            else {
                column++;
            }
        }
        return true;
    }
    
    private HashSet<Character> getSetBasedOnXY(int row, int column){
        if ( row <= 2 && column <= 2 ){
            return subBox1;
        } else if ( row <= 2 && (column > 2 && column <= 5) ){
            return subBox2;
        } else if ( row <= 2 && (column > 5 && column <= 8) ){
            return subBox3;
        } else if ( (row > 2 && row <= 5) && column <= 2 ){
            return subBox4;
        } else if ( (row > 2 && row <= 5) && (column > 2 && column <= 5) ){
            return subBox5;
        } else if ( (row > 2 && row <= 5) && (column > 5 && column <= 8) ){
            return subBox6;
        } else if ( (row > 5 && row <= 8) && column <= 2 ){
            return subBox7;
        } else if ( (row > 5 && row <= 8) && (column > 2 && column <= 5) ){
            return subBox8;
        } else {
            return subBox9;
        }
    }
}