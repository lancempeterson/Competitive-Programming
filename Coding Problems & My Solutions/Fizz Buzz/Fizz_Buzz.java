class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> arrayList = new ArrayList<String>();
        for ( int i = 1; i <= n; i++ ){
            String s = "";
            if (i % 3== 0){
                s = s+"Fizz";
            }
            if (i % 5 == 0){
                s = s+"Buzz";
            }
            if (s.equals("")){
                arrayList.add(""+i);
            }
            else {
                arrayList.add(""+s);
            }
        }
        return arrayList;
    }
}