class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> li =new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    li.add(1);
                }
                else{
                    li.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            }
            list.add(li);
        }
        return list;
    }
}