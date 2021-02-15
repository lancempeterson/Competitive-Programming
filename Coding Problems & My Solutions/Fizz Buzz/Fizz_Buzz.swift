class Solution {
    func fizzBuzz(_ n: Int) -> [String] {
        var list = [String]()
        for num in 1...n {
            switch num {
                case let num where num % 3 == 0 && num % 5 == 0:
                    list.append("FizzBuzz")
                case let num where num % 3 == 0:
                    list.append("Fizz")
                case let num where num % 5 == 0:
                    list.append("Buzz")
                default:
                    list.append(String(num))
            }
        }
        return list
    }
}