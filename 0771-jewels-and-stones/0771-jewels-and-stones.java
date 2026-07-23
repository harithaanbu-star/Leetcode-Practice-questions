class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int cnt=0;
        Set<Character> set = new LinkedHashSet<>();

        for(int i=0;i<jewels.length();i++){
            set.add(jewels.charAt(i));
        }
        for(int j=0;j<stones.length();j++){
            if(set.contains(stones.charAt(j))) cnt++;
        }
        return cnt;
    }
}