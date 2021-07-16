class Solution {
    func numIslands(_ grid: [[Character]]) -> Int {
        var grid = grid
        var numIslands = 0
        for (i, row) in grid.enumerated() {
            for (j, _) in row.enumerated() {
                if grid[i][j] == "1" {
                    numIslands += 1
                    sinkIsland(&grid, i, j)
                }
            }
        }
        return numIslands
    }
    
    func sinkIsland(_ grid: inout [[Character]], _ i: Int, _ j: Int) {
        if i < 0 || i >= grid.count || j < 0 || j >= grid[i].count {
            return 
        }
        if grid[i][j] == "0" {
            return
        }
        grid[i][j] = "0"
        // Up
        sinkIsland(&grid, i, j - 1)
        // Down
        sinkIsland(&grid, i, j + 1)
        // Left 
        sinkIsland(&grid, i - 1, j)
        // Right
        sinkIsland(&grid, i + 1, j)
    }
}