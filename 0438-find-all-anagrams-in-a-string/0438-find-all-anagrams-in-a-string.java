class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] cnt = new int[26];
        List<Integer> res = new ArrayList<>();
        for (char c : p.toCharArray()) cnt[c - 'a']++;
        int l = 0, r = 0, need = p.length();
        while (r < s.length()) {
            if (cnt[s.charAt(r++) - 'a']-- > 0) need--;
            if (need == 0) res.add(l);
            if (r - l == p.length() && cnt[s.charAt(l++) - 'a']++ >= 0)
                need++;
        }
        return res;
    }
}