class Solution {
    public int[] plusOne(int[] digits) {

        // Traverse from the last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            // If the digit is less than 9, simply increment and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If the digit is 9, it becomes 0 and carry moves left
            digits[i] = 0;
        }

        // If we reach here, all digits were 9
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;

        return ans;
    }
}