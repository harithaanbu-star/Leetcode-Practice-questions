class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
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
        return list.get(rowIndex);
    }
}