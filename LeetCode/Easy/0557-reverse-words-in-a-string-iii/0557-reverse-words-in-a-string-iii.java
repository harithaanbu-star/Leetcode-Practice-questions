class Solution {
    public String reverseWords(String s) {
        String [] arr= s.split(" ");
        String ss="";
        for(int i=0;i<arr.length;i++){
        StringBuilder sb = new StringBuilder(arr[i]);
        arr[i]= String.valueOf(sb.reverse());
        ss+=arr[i]+" ";
        }
        return String.join(" ",arr);
    }
}