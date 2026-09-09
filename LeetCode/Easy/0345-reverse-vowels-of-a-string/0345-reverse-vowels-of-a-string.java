class Solution {
    public String reverseVowels(String s) {
        int l=0;
        int r=s.trim().length()-1;
        String a="";
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        char[] arr = s.toCharArray();
        r=arr.length-1;
        while(l<=r){
            if(list.contains(arr[l]) && list.contains(arr[r])){
                char te=arr[l];
                arr[l]=arr[r];
                arr[r]=te;
                l++;
                r--;
            }
            else if(!list.contains(arr[l])){
                l++;
            }
            else if(!list.contains(arr[r])){ 
                r--;}
        }
        return String.valueOf(arr);
    }
}