class Solution {
    public int divide(int dividend, int divisor) {
        int cnt=0;
        if(dividend <=Integer.MIN_VALUE  && divisor ==-1 ){
            return Integer.MAX_VALUE ;
        }if(dividend >=Integer.MAX_VALUE  && divisor ==-1 ){
             return -dividend ;
        }
        boolean neg= (divisor<0) ^ (dividend<0);
            long a =Math.abs((long) divisor);
            long b =Math.abs((long) dividend);
    
        while(a<=b){
           b-=a;            
            cnt++;
        }
        if(neg){
                cnt=-cnt;
            }
        if(cnt>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return cnt;
    }
}