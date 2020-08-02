class FirstUnique {

    Set<Integer> all;
    Set<Integer> set;
    
    public FirstUnique(int[] nums) {
        all = new HashSet<>();
        set = new LinkedHashSet<>();
        for (int num : nums){
            add(num);
        }
    }
    
    public int showFirstUnique() {
        if (set.size() > 0){
            return set.iterator().next();
        }
        return -1;
    }
    
    public void add(int value) {
        if (!all.contains(value)){
            all.add(value);
            set.add(value);
        } else {
            if (set.contains(value)){
                set.remove(value);
            }
        }
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */