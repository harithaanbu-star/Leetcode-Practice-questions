class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        
        HashMap<String,Integer> map = new HashMap<>();
        for(List<String> s : responses){
            HashSet<String> set = new HashSet<>(s);
            for(String ss:set){
               
            map.put(ss,map.getOrDefault(ss,0)+1);
        }}
        String ans="";
        int maxcount=0;
        for(Map.Entry<String,Integer> e :map.entrySet()){
            String res=e.getKey();
            int count = e.getValue();
            if(count>maxcount){
                maxcount=count;
                ans=res;
            }else if (count==maxcount && res.compareTo(ans)<0) ans=res;
        }
        return ans;
    }
}