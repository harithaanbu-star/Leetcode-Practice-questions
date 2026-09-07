class Solution {
    public int diagonalPrime(int[][] nums) {
        int maxv=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i][i];
            int b=nums[i][nums.length-i-1];
            if(isPrime(a)){
                maxv=Math.max(maxv,a);
            }
            if(isPrime(b)){
                maxv=Math.max(maxv,b);
            }
        }
        return maxv;
    }
    static boolean isPrime(int x){
        if(x<=1) return false;
        if(x==2 || x==3) return true;
        for(int i=2;i*i<=x;i++){
            if(x%i==0) return false;
        }
        return true;
    }
}