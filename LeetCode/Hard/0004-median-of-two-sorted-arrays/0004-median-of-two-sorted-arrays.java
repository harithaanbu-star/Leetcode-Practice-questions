class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        if (nums1.length == 0) {
            if (n % 2 == 0) {
                double index = (double) (nums2[n / 2] + nums2[(n / 2) - 1]) / 2;
                return index;
            }
            return (double) (nums2[n / 2]);
        } else if (nums2.length == 0) {
            if (n % 2 == 0) {
                double index = (double) (nums1[n / 2] + nums1[(n / 2) - 1]) / 2;
                return index;
            }
            return (double) nums1[n / 2];
        }
        int[] arr = new int[n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n) {

            if (j < nums1.length && k < nums2.length) {

                if (nums1[j] <= nums2[k]) {
                    arr[i] = nums1[j];
                    i++;
                    j++;
                } else {
                    arr[i] = nums2[k];
                    i++;
                    k++;
                }
            }

            else if (j >= nums1.length && k < nums2.length) {

                arr[i] = nums2[k];
                i++;
                k++;
            }

            else if (k >= nums2.length && j < nums1.length) {

                arr[i] = nums1[j];
                i++;
                j++;
            }
        }
        if (n % 2 == 0) {
            double index = (double) (arr[n / 2] + arr[(n / 2) - 1]) / 2;
            return index;
        }
        return (double) arr[n / 2];
    }
}