class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> li1= new ArrayList<>();
        List<Integer> li2 = new ArrayList<>();
        int len =Math.min(nums1.length,nums2.length);
        int x=0;
        int y=0;
        if(nums1.length<=nums2.length){
            x=1;
        }
        if(nums2.length<nums1.length){
            y=1;
        }
        for(int i=0;i<nums1.length;i++){
            li1.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            li2.add(nums2[j]);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<len;i++){
            if(x==1){
                if(li2.contains(nums1[i]) && !ans.contains(nums1[i])){
                    ans.add(nums1[i]);
                }
            }
            if(y==1){
                if(li1.contains(nums2[i]) && !ans.contains(nums2[i])){
                    ans.add(nums2[i]);
                }
            }
        }
        int[] fin = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            fin[i]=ans.get(i);
        }
        return fin;
    }
}