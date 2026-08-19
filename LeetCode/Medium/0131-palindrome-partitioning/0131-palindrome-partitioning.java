class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backtrack(res,s,0,new ArrayList<>());
        return res;
    }
    static void backtrack(List<List<String>> res , String s , int i , List<String> ans){
        
        if(i==s.length()){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int j=i;j<s.length();j++){
            String ss = s.substring(i,j+1);
            if(isPalindrome(ss)){
                ans.add(ss);
            
            backtrack(res,s,j+1,ans);
            ans.remove(ans.size()-1);
        }
    }}
    static boolean isPalindrome(String pal){
        int left=0;
        int right=pal.length()-1;
        while(left<=right){
            if(pal.charAt(left)!=pal.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}