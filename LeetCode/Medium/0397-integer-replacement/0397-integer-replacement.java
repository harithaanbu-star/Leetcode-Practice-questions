class Solution {
    public int integerReplacement(int num) {
        long n=num;
        int cnt=0;
        while(n>1){
            if(n%2 ==0){
                n/=2;
                cnt++;
            }else{
                if( n==3 ||n%4 ==1){
                    n-=1;
                   // System.out.println("1");
                }else {
                    n+=1;
                }
                cnt++;
            }
        }
        return cnt;
    }
}