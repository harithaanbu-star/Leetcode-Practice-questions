class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String s:cpdomains){
            String arr [] =s.split(" ");
            int count =Integer.parseInt(arr[0]);
            String domain = arr[1];
            while(domain != null){
            map.put(domain,map.getOrDefault(domain,0)+count);
            int dot=domain.indexOf(".");
            if(dot==-1) break;
            domain=domain.substring(dot+1);
            
            }
        }
         List<String> list = new ArrayList<>();
         for(Map.Entry<String,Integer> m:map.entrySet()){
            String res =m.getValue()+" "+m.getKey();
            list.add(res);
         }
         return list;
    }
}