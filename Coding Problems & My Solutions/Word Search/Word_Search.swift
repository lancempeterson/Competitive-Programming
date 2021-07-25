class Solution {
    func exist(_ board: [[Character]], _ word: String) -> Bool {
        var target = Array(word)
        for (i, row) in board.enumerated() {
            for (j, cell) in row.enumerated() {
                if cell == target[0] {
                    var board = board
                    var wordExists = false
                    generatePaths(target, 0, &board, i, j, &wordExists)
                    if wordExists {
                        return true
                    }
                }
            }
        }
        return false
    }
    
    func generatePaths(_ target: [Character], _ index: Int, _ board: inout [[Character]], _ i: Int, _ j: Int, _ wordExists: inout Bool) {
        if i < 0 || i >= board.count || j < 0 || j >= board[i].count || board[i][j] == "*" {
            if index >= target.count {
                wordExists = true
            }
            return
        }
        if index >= target.count {
            wordExists = true
            return
        }
        if board[i][j] == target[index] {
            var board = board
            board[i][j] = "*"
            // Try Up
            generatePaths(target, index + 1, &board, i - 1, j, &wordExists)
            // Try Down
            generatePaths(target, index + 1, &board, i + 1, j, &wordExists)
            // Try Left
            generatePaths(target, index + 1, &board, i, j - 1, &wordExists)
            // Try Right
            generatePaths(target, index + 1, &board, i, j + 1, &wordExists)
        }
    }
}