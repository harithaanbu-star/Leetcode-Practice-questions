class Solution {
    public boolean isHappy(int n) {
     
     while(n>4){
        int tot=0;
        while(n!=0){
            tot+=Math.pow(n%10,2);
            n/=10;
        }
        n=tot;
        
     }
     return n==1;
    }
}