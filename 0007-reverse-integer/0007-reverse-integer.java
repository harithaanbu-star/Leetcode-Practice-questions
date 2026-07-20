class Solution {
    public int reverse(int x) {
        int max= Integer.MAX_VALUE;
        int min= Integer.MIN_VALUE;
        int z=0;
        while(x!=0){
            int last=x%10;
           
            if(z>max/10 || (z==max/10 &&last>max%10))  return 0;
            if(z<min/10 || (z==min/10 && last<min%10) ) return 0;
             z=z*10+last;
            x=x/10;
        }
        return z;
    }
}