class Solution {
    public String reverseStr(String s, int k) {
        char [] arr = s.toCharArray();
        int i=0;
        if(k>=s.length()){
            StringBuilder sb = new StringBuilder(s);
            return String.valueOf(sb.reverse());
        }
        while((i)<s.length()){
            int end= Math.min(i+k,s.length());
            StringBuilder sb = new StringBuilder(s.substring(i,end));
            String sss=String.valueOf(sb.reverse());
            int n=0;
            int j=i;
            while(n<sss.length()){
            
                arr[j] =sss.charAt(n);
                n++;
                j++;
            }
            i=i+(2*k);
        }
        return String.valueOf(arr);
    }
}