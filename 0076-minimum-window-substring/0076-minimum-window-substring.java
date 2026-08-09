
class Solution {
    public String minWindow(String s, String t) {

        int[] freq = new int[128];

        // t ki frequency
        for (char ch : t.toCharArray()) {
            freq[ch]++;
        }

        int low = 0;
        int count = t.length();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        // Expand
        for (int high = 0; high < s.length(); high++) {

            char ch = s.charAt(high);

            // Required character mila
            if (freq[ch] > 0) {
                count--;
            }

            freq[ch]--;

            // Window valid -> shrink
            while (count == 0) {

                // Current valid window
                if (high - low + 1 < minLen) {
                    minLen = high - low + 1;
                    start = low;
                }

                // Remove left character
                char left = s.charAt(low);

                freq[left]++;

                // Required character remove ho gaya
                if (freq[left] > 0) {
                    count++;
                }

                low++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}

