class Solution {
    fun fizzBuzz(n: Int): List<String> {
        var list: MutableList<String> = mutableListOf<String>()
        for ( x in 1 until n+1 ){
            var s: String = ""
            if ( x % 3 == 0 ){
                s += "Fizz"
            }
            if ( x % 5 == 0 ){
                s += "Buzz"
            }
            if ( x % 3 != 0 && x % 5 != 0 ){
                s = x.toString()
            }
            list.add(s)
        }
        return list
    }
}