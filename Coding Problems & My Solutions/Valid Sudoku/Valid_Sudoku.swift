class Solution {
    var subBox1: Set<Character> = []
    var subBox2: Set<Character> = []
    var subBox3: Set<Character> = []
    var subBox4: Set<Character> = []
    var subBox5: Set<Character> = []
    var subBox6: Set<Character> = []
    var subBox7: Set<Character> = []
    var subBox8: Set<Character> = []
    var subBox9: Set<Character> = []
    func getSubBoxNo(_ i: Int, _ j: Int) -> Int {
        if i < 3 && j < 3 {
            return 1
        }
        else if i < 3 && (j >= 3 && j < 6) {
            return 2
        }
        else if i < 3 && j >= 6 {
            return 3
        }
        else if (i >= 3 && i < 6) && j < 3 {
            return 4
        }
        else if (i >= 3 && i < 6) && (j >= 3 && j < 6) {
            return 5
        }
        else if (i >= 3 && i < 6) && j >= 6 {
            return 6
        }
        else if i >= 6 && j < 3 {
            return 7
        }
        else if i >= 6 && (j >= 3 && j < 6) {
            return 8
        } else {
            return 9
        }
    }
    func isValidSudoku(_ board: [[Character]]) -> Bool {
        for (i, row) in board.enumerated() {
            for (j, cell) in row.enumerated() {
                if board[i][j] == "." {
                    continue
                }
                // Check if Valid Row
                var a = 0
                while a < row.count {
                    if a != j && board[i][a] == board[i][j] {
                        return false
                    }
                    a += 1
                }
                // Check if Valid Col
                var b = 0
                while b < board.count {
                    if b != i && board[b][j] == board[i][j] {
                        return false
                    }
                    b += 1
                }
                // Check if Valid SubBox
                switch getSubBoxNo(i, j) {
                    case 1:
                        if subBox1.contains(board[i][j]) {
                            return false
                        }
                        subBox1.insert(board[i][j])
                    case 2:
                        if subBox2.contains(board[i][j]) {
                            return false
                        }
                        subBox2.insert(board[i][j])
                    case 3: 
                        if subBox3.contains(board[i][j]) {
                            return false
                        }
                        subBox3.insert(board[i][j])
                    case 4:
                        if subBox4.contains(board[i][j]) {
                            return false
                        }
                        subBox4.insert(board[i][j])
                    case 5:
                        if subBox5.contains(board[i][j]) {
                            return false
                        }
                        subBox5.insert(board[i][j])
                    case 6:
                        if subBox6.contains(board[i][j]) {
                            return false
                        }
                        subBox6.insert(board[i][j])
                    case 7:
                        if subBox7.contains(board[i][j]) {
                            return false
                        }
                        subBox7.insert(board[i][j])
                    case 8:
                        if subBox8.contains(board[i][j]) {
                            return false
                        }
                        subBox8.insert(board[i][j])
                    default:
                        if subBox9.contains(board[i][j]) {
                            return false
                        }
                        subBox9.insert(board[i][j])
                }
            }
        }
        return true
    }
}