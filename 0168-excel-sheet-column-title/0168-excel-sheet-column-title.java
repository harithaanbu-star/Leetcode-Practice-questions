class Solution {
    public String convertToTitle(int columnNumber) {
        String title="";
        int n=columnNumber;
        while(n!=0){
            n=n-1;
            int digit = n%26;
            n=n/26;
            title=(char)(digit+65) +title;
         
        }
        return title;
    }
}