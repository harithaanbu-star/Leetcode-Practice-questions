class Solution {
    public int countCommas(int n) {
        if(n<1000) return 0;
        if(n>=1000 && n<100000){
            return n-1000+1;
        }return 2*(n-100000 +1)+(100000-9999)-2+9000;
    }
}