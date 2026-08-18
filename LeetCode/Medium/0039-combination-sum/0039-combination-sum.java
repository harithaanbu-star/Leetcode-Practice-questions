class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,target,0,new ArrayList<>(),res);
        return res;
    }
    static void backtrack(int[] cand,int t , int s,List<Integer> ans,List<List<Integer>> res){
        if(t==0){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=s;i<cand.length;i++){
            if(cand[i]>t){
                
                break;
            }ans.add(cand[i]);
            backtrack(cand,t-cand[i],i,ans,res);
            ans.remove(ans.size()-1);
        }
    }
}