class Solution {
    public int hammingWeight(int n) {
        String x=Integer.toBinaryString(n);
        //System.out.println(x);
        int cnt =0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='1'){
                cnt++;
            }
        }
        return cnt;
    }
}