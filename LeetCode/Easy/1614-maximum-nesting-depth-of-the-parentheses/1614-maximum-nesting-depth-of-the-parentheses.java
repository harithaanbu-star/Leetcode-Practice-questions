class Solution {
    public int maxDepth(String s) {
        int dep=0;
        int maxdep=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                dep++;
                maxdep=Math.max(dep,maxdep);
            }else if (s.charAt(i)==')'){
                dep--;
            }
        }
        return maxdep;
    }
}