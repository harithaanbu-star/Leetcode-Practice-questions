class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,map.get(num)+1);
            }
        }
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getValue()<=1){
                return m.getKey();
            }
        }
        return -1;
    }
}