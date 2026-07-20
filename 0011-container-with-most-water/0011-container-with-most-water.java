class Solution {
    public int maxArea(int[] height) {
        int i=0;
        
        int j=height.length-1;
        int area=0;
        int length;
        int high=0;
        int newarea;
        while(i<j){
         length=j-i;
        if(height[i]<=height[j]){
         high=height[i];
         i++;
        }else if (height[i]>height[j]){
         high = height[j];
         j--;
        }
        newarea=length*high;
        area=Math.max(area,newarea);
        }
        return area ;
    }
}