class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // agar last digit 9 rhe to like that 129 on that case
            if (digits[i] == 9) {
                digits[i] = 0;
            }
        }

        // agar puri like 999 rhe to esmei to size of array nhad jayega on that case ham esmei array ka size badha denge and index of 0 pe 1 daal denge
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}