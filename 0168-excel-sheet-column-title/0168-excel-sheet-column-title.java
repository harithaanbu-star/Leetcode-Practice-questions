class Solution {
    public String convertToTitle(int columnNumber) {
        String title="";
        int n=columnNumber;
        while(n!=0){
            int digit = n%26;
            if (digit==0){digit=26 ;
           n=(n/26) -1 ;}
           else{
            n/=26;
           }
            title= (char)(digit+64) + title;
         
        }
        return title;
    }
}