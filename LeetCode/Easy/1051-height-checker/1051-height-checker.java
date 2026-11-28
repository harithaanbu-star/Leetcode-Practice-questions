class Solution {
    public int heightChecker(int[] heights) {
        int[ ] newheigh = Arrays.copyOf(heights,heights.length);
        Arrays.sort(heights);
        int cnt= 0;
        for(int i=0;i<heights.length;i++){
            System.out.println(newheigh[i]+"  "+heights[i]);
            if(newheigh[i]!=heights[i])
            cnt++;
        }
        return cnt;
    }
}