class Solution {
    public int lengthOfLongestSubstring(String s) {

        int max = 0;
        String window = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            while (window.indexOf(ch) != -1) {
                window = window.substring(1);
            }
            window += ch;
            max = Math.max(max, window.length());
        }

        return max;
    }
}
