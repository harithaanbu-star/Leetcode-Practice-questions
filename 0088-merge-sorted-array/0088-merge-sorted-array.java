class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int k=0;
        int[] num=nums1.clone();
        while(i<m && j<n){
            if(num[i]<=nums2[j]){
                nums1[k]=num[i];
                k++;
                i++;
            }else if(nums2[j]<num[i]){
                nums1[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<m && j==n){nums1[k]=num[i];i++;k++;}
        while(j<n && i==m){nums1[k]=nums2[j]; j++;k++;}
    }
}