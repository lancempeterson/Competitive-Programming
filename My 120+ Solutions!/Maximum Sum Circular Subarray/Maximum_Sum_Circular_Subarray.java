class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int[] B = A.clone();
        boolean allNeg = true;
        int maxNeg = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++){
            if (A[i] > 0){
                allNeg = false;
            } else {
                maxNeg = Math.max(maxNeg, A[i]);
            }
            A[i] = 0 - A[i];
        }
        if (allNeg){
            return maxNeg;
        }
        int max = 0;
        int max_here = 0;
        for (int i = 0; i < B.length; i++){
            max_here += B[i];
            if (max_here < 0){
                max_here = 0;
            }
            max = Math.max(max, max_here);
        }
        int nonWrapMax = max;
        max = max_here = 0;
        int total = 0;
        for (int i = 0; i < A.length; i++){
            total += A[i];
            max_here += A[i];
            if (max_here < 0){
                max_here = 0;
            }
            max = Math.max(max, max_here);
        }
        int wrapMax = -(total) + max;
        return Math.max(nonWrapMax, wrapMax);
    }
}