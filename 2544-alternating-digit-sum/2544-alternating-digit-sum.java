class Solution {
    public int alternateDigitSum(int n) {
        int x=n;
        int cnt=0;
        long div=1;
        while(n!=0){
            n/=10;
            div*=10;
            cnt++;
        }
        div/=10;
        int sum=0;
        for(int i=0;i<cnt;i++){
          if(i%2==0) {
            sum+=(int) x/div;
            
          }else{
            sum-=(int)x/div;
          } 
           x%=div;
           div/=10;
        }
        
        
        return sum;
    }
}