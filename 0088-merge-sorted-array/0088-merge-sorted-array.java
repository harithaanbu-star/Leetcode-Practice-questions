class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
        int[] nums3=nums1.clone();
        while(j<m && k<n){
            if(nums3[j]<=nums2[k]){
                nums1[i]=nums3[j];
                j++;
            }else{
                nums1[i]=nums2[k];
                k++;
            }
            i++;
        }
        while( k<n )nums1[i++]=nums2[k++]; 
        while(j<m )nums1[i++]=nums3[j++];
    }
}