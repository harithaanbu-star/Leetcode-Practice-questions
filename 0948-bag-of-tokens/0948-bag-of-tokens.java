class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int maxScore=0;
        int newScore=0;
        int left=0;
        int right=tokens.length-1;

        while(left<=right){
            if(tokens[left]<=power){
            power-=tokens[left];
            newScore++;
            maxScore=Math.max(newScore,maxScore);
            left++;
            }
            else if(newScore>0){
                newScore=maxScore-1;
                power+=tokens[right];
                right--;
            }else{
                break;
            }
        }
        return maxScore;
    }
}