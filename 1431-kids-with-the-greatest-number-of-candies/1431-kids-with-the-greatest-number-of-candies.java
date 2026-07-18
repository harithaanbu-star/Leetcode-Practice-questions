class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     int maxelem=0;
     for(int num:candies){
        if(num>maxelem) maxelem =num;
     }
    
     
     List<Boolean> list = new ArrayList<>();
     for(int i=0;i<candies.length;i++){
        list.add(candies[i]+extraCandies>=maxelem);
     }
     return list;
    }
}