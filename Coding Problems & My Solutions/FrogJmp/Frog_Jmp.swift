import Foundation
import Glibc

// you can write to stdout for debugging purposes, e.g.
// print("this is a debug message")

public func solution(_ X : Int, _ Y : Int, _ D : Int) -> Int {
    if D < 1 || X < 1 || Y < 1 {
        return -1
    }
    var remainingDistance = Y
    remainingDistance -= X
    var hops = 0
    //while remainingDistance >= 0 {
        //remainingDistance -= D
        //hops += 1
    //}
    //return hops
    // Use integer division for O(1) time complexity.
    return (remainingDistance + D - 1) / D
}
