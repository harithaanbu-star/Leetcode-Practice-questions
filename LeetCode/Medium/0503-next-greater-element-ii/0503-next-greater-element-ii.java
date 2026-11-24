class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr = new int[nums.length];
        int n=nums.length;
        Stack<Integer> st = new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            int index=i%n;
            while(!st.isEmpty() && st.peek()<=nums[index]){
                st.pop();
            }
            if(i<n){
            if(st.isEmpty()){
                arr[index]=-1;
            }else{
                arr[index]=st.peek();
            }
            }
        st.push(nums[index]);
        }
    return arr;
    }
}