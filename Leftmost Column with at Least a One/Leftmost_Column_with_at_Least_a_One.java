/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> dims = binaryMatrix.dimensions();
        int n = dims.get(0);
        int m = dims.get(1);
        int leftMost = Integer.MAX_VALUE;
        for (int row = 0; row < n; row++){
            int start = 0;
            int end = m-1;
            while (start <= end){
                int mid = start + ((end - start)/2);
                int midval = binaryMatrix.get(row,mid);
                if (midval == 0){
                    start = mid + 1;
                } else {
                    leftMost = Math.min(leftMost, mid);
                    end = mid - 1;
                }
            }
        }
        if (leftMost == Integer.MAX_VALUE){
            return -1;
        }
        return leftMost;
    }
}