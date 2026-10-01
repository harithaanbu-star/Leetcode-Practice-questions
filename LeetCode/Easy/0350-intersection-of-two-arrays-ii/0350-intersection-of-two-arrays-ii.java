class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> list= new ArrayList<>();
        for(int n1:nums1){
            list.add(n1);
        }
        ArrayList<Integer> li2=new ArrayList<>();
        for(int n2:nums2){
            if(list.contains(n2)){
                li2.add(n2);
                list.remove(Integer.valueOf(n2));
            }
        }
        int[] nu=new int[li2.size()];
        for(int i=0;i<li2.size();i++){
                nu[i]=li2.get(i);
        }
        return nu;
    }
}