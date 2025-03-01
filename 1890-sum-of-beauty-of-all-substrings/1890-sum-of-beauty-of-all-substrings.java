class Solution {
    public int beautySum(String s) {
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> hm = new HashMap();

            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);

                hm.put(c, hm.getOrDefault(c, 0) + 1);

                int max = Collections.max(hm.values());
                int min = Collections.min(hm.values());

                total += (max - min);
            }
        }
        return total;
    }
}