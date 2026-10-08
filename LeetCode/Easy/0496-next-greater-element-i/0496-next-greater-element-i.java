class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> nge = new  HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
        while(!st.isEmpty() && nums2[i]>=st.peek()){
            st.pop();
        }nge.put(nums2[i],st.isEmpty() ? -1 : st.peek());
        st.push(nums2[i]);
        
        }
        for(int j=0;j<nums1.length;j++){
            nums1[j]=nge.get(nums1[j]);
        }return nums1;
    }
}