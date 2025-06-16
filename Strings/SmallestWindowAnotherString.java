class Solution {
    public String smallestWindow(String s1, String s2) {
        if (s2.length() > s1.length()) return "";

        int[] targetFreq = new int[128];
        for (char c : s2.toCharArray()) targetFreq[c]++;

        int[] windowFreq = new int[128];
        int left = 0, minLen = Integer.MAX_VALUE, start = 0;
        int count = 0;

        for (int right = 0; right < s1.length(); right++) {
            char c = s1.charAt(right);
            windowFreq[c]++;

            if (targetFreq[c] != 0 && windowFreq[c] <= targetFreq[c]) {
                count++;
            }

            while (count == s2.length()) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char lChar = s1.charAt(left);
                windowFreq[lChar]--;
                if (targetFreq[lChar] != 0 && windowFreq[lChar] < targetFreq[lChar]) {
                    count--;
                }
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s1.substring(start, start + minLen);
    }
}
