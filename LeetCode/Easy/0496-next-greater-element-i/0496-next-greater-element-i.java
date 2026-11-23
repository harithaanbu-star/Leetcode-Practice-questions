class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int[] arr2 = new int[nums2.length];
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && nums2[i]>=st.peek()){
                st.pop();
            }
            if(st.isEmpty()){
               // st.push(nums2[i]);
                arr2[i]=-1;
            }else{
                arr2[i]=st.peek();
            }
            st.push(nums2[i]);
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int j=0;j<nums2.length;j++){
            map.put(nums2[j],arr2[j]);
        }
        int[] arr = new int[nums1.length];
        for(int k=0;k<nums1.length;k++){
            arr[k]=map.get(nums1[k]);
        }
        return arr;
    }
}