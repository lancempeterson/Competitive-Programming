class Solution {
    func rotate(_ matrix: inout [[Int]]) {
        matrix.reverse()
        for i in 0..<matrix.count {
            for j in i+1..<matrix[i].count {
                var temp = matrix[i][j]
                matrix[i][j] = matrix [j][i]
                matrix[j][i] = temp
            }
        }
        // for (i, row) in matrix.enumerated() {
        //     for (j, cell) in matrix.enumerated() {
        //         if j != 0 {
        //             continue
        //         }
        //         matrix[i].reverse()
        //     }
        // }
    }
}