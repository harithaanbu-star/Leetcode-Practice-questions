class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
       // Arrays.sort(queries);
        // if(nums[0]>queries[0]) return new int[] {};
        int j=0;
        int m=queries.length;
        int n=nums.length;
        int[] q= new int[m];
        while(j<m ){
            int sum=0;
            int len =0;
            for(int i=0;i<n;i++){
                sum+=nums[i];
                if(sum<=queries[j]) len++;
                else{
                    break;
                }
            }
            q[j]=len;
            j++;
        }
        return q;
    }
}