class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int satisfied=0;
        int window=0;
        int maxwind=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                satisfied+=customers[i];
            }if(grumpy[i]==1){
                window+=customers[i];
            }

            if(i>=minutes && grumpy[i-minutes]==1){
                window-=customers[i-minutes];
            }
            maxwind=Math.max(maxwind,window);
        }
        return satisfied+maxwind;
    }
}