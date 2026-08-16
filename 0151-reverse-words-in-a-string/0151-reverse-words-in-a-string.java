class Solution {
    public String reverseWords(String s) {
        String ans[]=s.trim().split("\\s+");
        String arr[] = new String[ans.length];
        int j=ans.length-1;
        for(int i=0;i<ans.length;i++){
            arr[j]=ans[i];
            j--;
        }
        return  String.join(" ",arr).trim();
    }
}