class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> ans = new ArrayList();
        int a = 0;
        int b = 0;
        while (a < A.length && b < B.length){
            int lo = Math.max(A[a][0], B[b][0]);
            int hi = Math.min(A[a][1], B[b][1]);
            if (lo <= hi){
                int[] interval = {lo,hi};
                ans.add(interval);
            }
            if (A[a][1] < B[b][1]){
                a++;
            } else {
                b++;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}