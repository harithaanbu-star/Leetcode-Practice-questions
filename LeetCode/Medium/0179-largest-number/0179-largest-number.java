class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        if(arr[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
       // if(arr[0]=="0") return "0";
        for(int j=0;j<nums.length;j++){
            sb.append(arr[j]);
        }
      //  if(sb.get(0)==0) return "0";
        return String.valueOf(sb);
    }
}