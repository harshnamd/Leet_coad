class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int totalcost = 0;
        int c = 0;
        int s = 0;
        for (int i = 0; i < gas.length; i++) {
            totalgas += gas[i];
            totalcost += cost[i];
        }
        if (totalgas < totalcost) {
            return -1;
        }
        for(int i = 0 ; i < gas.length ; i++){
            c += gas[i] - cost[i];
            if(c < 0){
                s = i + 1;
                c = 0;
            }
        }
        return s;
    }
}