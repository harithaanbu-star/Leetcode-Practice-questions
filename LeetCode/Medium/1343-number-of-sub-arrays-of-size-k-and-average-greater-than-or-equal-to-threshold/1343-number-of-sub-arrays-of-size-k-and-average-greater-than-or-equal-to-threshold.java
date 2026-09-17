class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int st =0;
        int end = k;
        int sum=0;
        int cnt=0; 
        for(int i=st;i<end;i++){
            sum+=arr[i];
        }
        if(sum/k >=threshold) cnt++;
        while(end<arr.length){
            sum-=arr[st];
            sum+=arr[end];
            if(sum/k >=threshold) cnt++;
            st++;
            end++;
        }


        return cnt;
    }
}