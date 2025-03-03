class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);

        int last = 0;
        int res = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int val = mp.get(s.charAt(i));
            if (last <= val) {
                res += val;
                last = val;
            } else {
                res -= val;
            }
        }
        return res;
    }
}