class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> list = new HashSet<>();
        for(int n1:nums1){
            set.add(n1);
        }
        for(int n2:nums2){
            if(set.contains(n2)){
                list.add(n2);
            }
        }
        int[] ans=new int[list.size()];
        int i=0;
        for(int se:list){
            ans[i]=se;
            i++;
        }
        return ans;
    }
}