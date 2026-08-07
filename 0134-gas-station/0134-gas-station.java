class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gassum=0;
        int costsum=0;
        for(int i=0;i<gas.length;i++){
            gassum+=gas[i];
            costsum+=cost[i];
        }
        if(gassum<costsum) return -1;
        int startIndex=0;
        int gasinit=0;
        int curgas=0;
        for(int j=0;j<gas.length;j++){
            curgas+=gas[j]-cost[j];
            if(curgas<0){
            startIndex=j+1;
            curgas=0;
        }
        }
        return startIndex;
    }
}