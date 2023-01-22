import Foundation
import Glibc

// you can write to stdout for debugging purposes, e.g.
// print("this is a debug message")

public func solution(_ A : inout [Int]) -> Int {
    // Set Subtraction
    //let N = A.count
    //let arr = Array(1...N)
    //let setA = Set(A)
    //let setB = Set(arr)
    //return setB.subtracting(setA).first ?? 0
    // Sum of Integers
    // S = N (a + b) / 2
    // S = 5 (1 + 5) / 2
    // S = 30 / 2 = 15
    let expectedCount = A.count + 1
    let expectedSum = (expectedCount * (1 + expectedCount)) / 2
    let actualSum = A.reduce(0, +)
    return expectedSum - actualSum
}