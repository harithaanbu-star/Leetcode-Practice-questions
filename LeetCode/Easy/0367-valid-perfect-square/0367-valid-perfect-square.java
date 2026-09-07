class Solution {
    public boolean isPerfectSquare(int num) {
        long low =1;
        long high =num;
        while(low<=high){
            long mid =low+(high-low)/2;
            if(mid*mid == num && num%mid==0){
                return true;
            }
            if(mid*mid<num){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;
    }
}