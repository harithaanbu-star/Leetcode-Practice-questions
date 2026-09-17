class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int st=0;
        int end=0;
        int cnt=0;
        int maxcnt=0;
        while(end<fruits.length){
            map.put(fruits[end],map.getOrDefault(fruits[end],0)+1);
            while(map.size()>2){
                map.put(fruits[st],map.getOrDefault(fruits[st],0)-1);
                if(map.get(fruits[st])==0){
                    map.remove(fruits[st]);
                }
                st++; 
            }
            maxcnt=Math.max(maxcnt,end-st+1);
            end++;
        }
        return maxcnt;
    }
}