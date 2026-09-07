class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=1;
        if(num<=1) return false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0) sum+=i;
            
            
         //System.out.println(sum);   
        }
        return sum==num;
    }
}