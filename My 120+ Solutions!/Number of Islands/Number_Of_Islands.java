class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0){
            return 0;
        }
        int num = 0;
        int depth = grid.length;
        for (int row = 0; row < depth; row++){
            for (int col = 0; col < grid[row].length; col++){
                if (grid[row][col] == '1'){
                   num += countAndSinkIsland(grid,row,col); 
                }
            }
        }
        return num;
    }
    public int countAndSinkIsland(char[][] grid,int row, int col){
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[row].length || 
           grid[row][col] == '0'){
            return 0;
        }
        grid[row][col] = '0';
        countAndSinkIsland(grid,row + 1,col);
        countAndSinkIsland(grid,row - 1,col);
        countAndSinkIsland(grid,row,col + 1);
        countAndSinkIsland(grid,row,col - 1);
        return 1;
    }
}