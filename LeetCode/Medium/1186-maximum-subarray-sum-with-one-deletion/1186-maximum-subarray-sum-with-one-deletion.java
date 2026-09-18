class Solution {
    public int maximumSum(int[] arr) {
        if(arr.length==1) return arr[0];
        int[] prefix = new int[arr.length];
        int[] prefixdel = new int[arr.length];
        
        prefix[0]=arr[0];
        prefixdel[0]=0;
        int maxval =Math.max(prefix[0],Integer.MIN_VALUE);
        for(int i=1;i<arr.length;i++){
            prefix[i]=Math.max(prefix[i-1]+arr[i],arr[i]);
            prefixdel[i]=Math.max(prefix[i-1],prefixdel[i-1]+arr[i]);
            maxval=Math.max(prefix[i],maxval);
            maxval=Math.max(maxval,prefixdel[i]);
        }
        return maxval;
    }
}