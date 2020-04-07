class Solution {
    public int countElements(int[] arr) {
        if ( arr.length < 2 ){
            return 0;
        }
        int count = 0;
        Arrays.sort(arr);
        int a = 0;
        int b = 1;
        while ( b < arr.length ){
            if ( arr[a] == arr[b] ){
                b++;
            }
            else if ( arr[a] + 1 == arr[b] ){
                count++;
                a++;
                b = a+1;
            }
            else {
                a++;
                b = a+1;
            }
        }
        return count;
    }
}