class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set = new LinkedHashSet<>();
        for(int num : nums){
                 set.add(num);
        }
        int [] ne= new int[set.size()];
        int i=0;
        for(int n: set){
            ne[i]=n;
            i++;
        }
        int large=Integer.MIN_VALUE;
        int second=0;
        int third=0;
            for(int j=0;j<ne.length;j++){
                if(ne[j]>large){
                    third=second;
                    second=large;
                    large=ne[j];
                }else{
                    if(ne[j]>second){
                        third=second;
                        second=ne[j];
                    }else if (ne[j]>third){
                        third=ne[j];
                    }
                }
            }
        if(set.size()>=3) return third;
        else{ 
            return large;
        }
    }
}