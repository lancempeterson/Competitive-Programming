class Solution {
    public int totalFruit(int[] tree) {
        int windowMax = 0;
        int max = 0;
        int basket1Type = -1;
        int basket2Type = -1;
        int a = 0;
        int b = 0;
        while ( a < tree.length ){
            if ( b >= tree.length ){
                a++;
                b = a;
                max = Math.max(max, windowMax);
                windowMax = 0;
                basket1Type = -1;
                basket2Type = -1;
            }
            else if ( basket1Type == -1 ){
                basket1Type = tree[b];
                windowMax++;
	            b++;
            }
            else if ( basket2Type == -1 && tree[b] != basket1Type ){
                basket2Type = tree[b];
                windowMax++;
	            b++;
            }
            else if (tree[b] != basket1Type && tree[b] != basket2Type){
                a++;
                b = a;
                max = Math.max(max, windowMax);
                windowMax = 0;
                basket1Type = -1;
                basket2Type = -1;
            }
            else {
                windowMax++;
	            b++;
            } 
        }
        return max;
    }
}