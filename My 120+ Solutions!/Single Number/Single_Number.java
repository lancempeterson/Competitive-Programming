class Solution {
    public int singleNumber(int[] nums) {
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for ( int i = 0; i < nums.length; i++ ){
    //         int val = 0;
    //         if (map.get(nums[i]) != null) {
    //         	val = map.get(nums[i]);
    //         }
    //         map.put(nums[i], val + 1);
    //     }
    //     for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
    //     	if ( entry.getValue() == 1 ) {
    //     		System.out.println(""+entry.getKey());
    //     		return entry.getKey();
    //     	}
    //     }
    //     return 0;
        int b = 0;
		for ( int i = 0; i < nums.length; i++ ) {
			b ^= nums[i];
		}
		return b;
    }  
}