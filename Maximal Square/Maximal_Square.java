class Solution {
    public int maximalSquare(char[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] == '1'){
                    max = Math.max(max, 1);
                    int length = 1;
                    boolean completed = true;
                    while (completed){
                        completed = canCompleteRing(matrix,length,j,i);
                        if (completed){
                            max = Math.max(max, (length+1)*(length+1));
                            length++;
                        }
                    }
                }
            }
        }
        return max;
    }
    public boolean canCompleteRing(char[][] matrix, int length, int x, int y){
        for (int down = length; down > 0; down--){//Go Down
            y++;
            if (y >= matrix.length || matrix[y][x] != '1'){
                return false;
            }
        }
        for (int right = length; right > 0; right--){//Go Right
            x++;
            if (x >= matrix[0].length || matrix[y][x] != '1'){
                return false;
            }
        }
        for (int up = length; up > 0; up--){//Go Up
            y--;
            if (y < 0 || matrix[y][x] != '1'){
                return false;
            }
        }
        for (int left = length; left > 0; left--){//Go Left
            x--;
            if (x < 0 || matrix[y][x] != '1'){
                return false;
            }
        }
        return true;
    }
}