class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int n= tickets.length;
        int cnt=0;
        if(n<=k) return -1;
        for(int i=0;i<tickets.length;i++){
            list.add(tickets[i]);
        }while(list.size()>0 &&  list.get(k)>0 ){
            int re=list.get(0)-1;
            list.remove(0);
            cnt++;
            if(k==0 && re ==0){
                return cnt;
            }
            if(re!=0){
            list.add(re);
            }
            
            if(k!=0){
                k=k-1;
            }else {
                k=list.size()-1;
            }
            
        }
        return cnt;
    }
}