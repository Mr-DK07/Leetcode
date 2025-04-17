class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3];
        int res = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            count[s.charAt(end) - 'a']++;

            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                res += s.length() - end;
                count[s.charAt(start) - 'a']--;
                start++;
            }
        }
        return res;
    }
}