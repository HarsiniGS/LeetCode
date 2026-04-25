class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            String s = String.valueOf(i);
            int n = s.length();
            if (n % 2 != 0) continue;
            int half = n / 2, left = 0, right = 0;
            for (int j = 0; j < half; j++) {
                left += s.charAt(j) - '0';
                right += s.charAt(j + half) - '0';
            }
            if (left == right) count++;
        }
        return count;
    }
}