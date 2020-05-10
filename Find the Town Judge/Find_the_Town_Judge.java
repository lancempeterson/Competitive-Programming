class Solution {
    public int findJudge(int N, int[][] trust) {
        if (trust.length == 0 && N == 1){
            return 1;
        }
        int[] trusters = new int [N];
        int[] trusted = new int [N];
        for (int[] person : trust){
            trusters[person[0] - 1]++;
            trusted[person[1] - 1]++;
        }
        for (int i = 0; i < N; i++){
            if (trusters[i] == 0 && trusted[i] == N - 1){
                return i+1;
            }
        }
        return -1;
    }
}