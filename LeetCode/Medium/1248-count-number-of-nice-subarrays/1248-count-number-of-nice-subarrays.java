class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int cnt = 0;
        int st = 0;
        int odd = 0;
        int even = 0;

        for (int end = 0; end < nums.length; end++) {

            if (nums[end] % 2 != 0) {
                odd++;
            }

            while (odd > k) {
                if (nums[st] % 2 != 0) {
                    odd--;
                }
                st++;
                even = 0;
            }

            if (odd == k) {
                even = 0;
                int temp = st;

                while (temp <= end && nums[temp] % 2 == 0) {
                    even++;
                    temp++;
                }

                cnt += even + 1;
            }
        }

        return cnt;
    }
}