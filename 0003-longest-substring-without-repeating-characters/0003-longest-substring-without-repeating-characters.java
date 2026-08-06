class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> f = new HashMap<>();

        int low = 0;
        int res = 0;
        int n = s.length();

        for (int high = 0; high < n; high++) {

            char ch = s.charAt(high);
            f.put(ch, f.getOrDefault(ch, 0) + 1);

            while (f.get(ch) > 1) {
                char left = s.charAt(low);

                f.put(left, f.get(left) - 1);

                if (f.get(left) == 0) {
                    f.remove(left);
                }

                low++;
            }

            res = Math.max(res, high - low + 1);
        }

        return res;
    }
}