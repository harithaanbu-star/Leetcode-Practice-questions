class Solution {
    public int countDigits(int num) {
        List<Integer> list = new ArrayList<>();
        int x=num;
        int cnt=0;
        while(num>0){
            list.add(num%10);
            num=num/10;
        }
        for(int nu:list){
            if(x%nu==0) cnt++;
        }
        return cnt;
    }
}