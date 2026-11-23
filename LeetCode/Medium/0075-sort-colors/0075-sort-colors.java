class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int one =0;
        int two =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)zero++;
            else if(nums[i]==1) one++;
            else if(nums[i]==2) two++;
        }
       // System.out.print(zero + "    "+one+"    "+two);
        int ind =0;
            for(int z=0;z<zero;z++){
                nums[ind]=0;
               // System.out.print(ind + "    ");
                ind++;

            }
            //System.out.println();
            for(int o=0;o<one;o++){
                nums[ind]=1;
              //  System.out.print(ind + "    ");
                ind++;
            }
            //System.out.println();
            for(int t=0;t<two;t++){
                nums[ind]=2;
                ind++;
                //System.out.print(ind + "    ");
            }
        
    }
}