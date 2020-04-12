class Solution {
    public int lastStoneWeight(int[] stones) {
        int lastStoneWeight = 0;
        int destroyedStones = 0;
        int length = stones.length;
        Arrays.sort(stones);
        while (destroyedStones < length - 1){
            if ( stones[length-1] == stones[length-2] ){
                stones[length-1] = -1;
                destroyedStones++;
            } else {
                stones[length-1] -= stones[length-2];
            }
            stones[length-2] = -1;
            destroyedStones++;
            Arrays.sort(stones);
        }
        if (destroyedStones < length){
            lastStoneWeight = stones[length-1];
        }
        return lastStoneWeight;
    }
}