class Solution {
    public int alternatingSubarray(int[] nums) {

        int maxlen = 0;
        int len = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            // Start of a new alternating subarray
            if (len == 0) {

                if (nums[i + 1] == nums[i] + 1) {
                    len = 2;
                }

            }
            // Currently expecting -1
            else if (len % 2 == 0) {

                if (nums[i + 1] == nums[i] - 1) {
                    len++;
                } else {
                    len = 0;

                    // This pair itself can start a new sequence
                    if (nums[i + 1] == nums[i] + 1) {
                        len = 2;
                    }
                }
            }
            // Currently expecting +1
            else {

                if (nums[i + 1] == nums[i] + 1) {
                    len++;
                } else {
                    len = 0;
                }
            }

            maxlen = Math.max(maxlen, len);
        }

        return maxlen == 0 ? -1 : maxlen;
    }
}