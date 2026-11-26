class Solution {
    public String reverseWords(String s) {
        String [] arr = s.split("\\s+");
        System.out.println(arr[0]+" ");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]).append(" ");
        }
        return sb.toString().trim();
    }
}