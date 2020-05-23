class Solution {
    public String frequencySort(String s) {
        if (s == null || s.length() < 3){
            return s;
        }
        int[] ar = new int[256];
        for (char c : s.toCharArray()){
            ar[c]++;
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> ar[b] - ar[a]);
        for (int i = 0; i < ar.length; i++){
            pq.offer((char) i);
        }
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()){
            Character c = pq.poll();
            for (int i = 0; i < ar[c]; i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}