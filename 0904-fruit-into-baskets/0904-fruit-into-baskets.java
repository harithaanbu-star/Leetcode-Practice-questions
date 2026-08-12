class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int start =0;
        int end=0;
        int minlen=Integer.MIN_VALUE;
        while(end<fruits.length){
            map.put(fruits[end],map.getOrDefault(fruits[end],0)+1);
            if(map.size()>2){
                map.put(fruits[start],map.getOrDefault(fruits[start],0)-1);
                if(map.get(fruits[start])==0){
                    map.remove(fruits[start]);
                     
                }
               start++;
            }
            minlen=Math.max(minlen,end-start+1);
            end++;
        }
        return minlen;
    }
}