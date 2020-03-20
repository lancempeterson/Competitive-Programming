class Solution {
    fun uniquePaths(m: Int, n: Int): Int {
        /**
        M = 3, N = 2
           M    
           0 1 2
     N  0  0 2 0
        1  1 0 3
        arr[N][M]
        arr[1][2] = 3
        arr[1][0] = 1
        arr[0][1] = 2
        */
        var arr = arrayOf<Array<Int>>()
        for (i in 0 until n){
            var array = arrayOf<Int>()
            for ( j in 0 until m ){
                array += 0
            }
            arr += array
        }
        for ( i in 0 until m ){
            arr[0][i] = 1
        }
        for ( i in 0 until n ){
            arr[i][0] = 1
        }
        for ( i in 1 until m ){
            for ( j in 1 until n ){
                arr[j][i] = arr[j][i-1] + arr[j-1][i]
            }
        }
        return arr[n-1][m-1]
    }
}