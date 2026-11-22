class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
            System.out.println(Arrays.toString(digits));
        }
        int [] ans = new int[digits.length+1];
        System.out.println(Arrays.toString(ans));
        ans[0]=1;
        System.out.println(Arrays.toString(ans));
        return ans;
        
    }
}