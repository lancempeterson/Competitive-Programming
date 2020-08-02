class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length < 2){
            return true;
        }
        int a = 0;
        int b = 1;
        int rise = coordinates[b][1] - coordinates[a][1];
        int run = coordinates[b][0] - coordinates[a][0];
        if (run == 0){
            return false;
        }
        double slope = (double) rise/run;
        while (b < coordinates.length){
            int _rise = coordinates[b][1] - coordinates[a][1];
            int _run = coordinates[b][0] - coordinates[a][0];
            if (_run == 0 || slope != (double)(_rise/_run)){
                return false;
            }
            a++;
            b++;
        }
        return true;
    }
}