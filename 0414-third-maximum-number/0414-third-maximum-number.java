class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new LinkedHashSet<>();
        for(int num : nums){
                 set.add(num);
        }
        
        int large=Integer.MIN_VALUE;
        int second=0;
        int third=0;
            for(int nu:set){
                if(nu>large){
                    third=second;
                    second=large;
                    large=nu;
                }else{
                    if(nu>second){
                        third=second;
                        second=nu;
                    }else if (nu>third){
                        third=nu;
                    }
                }
            }
        if(set.size()>=3) return third;
        else{ 
            return large;
        }
    }
}