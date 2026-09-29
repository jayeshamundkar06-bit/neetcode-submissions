class Solution {
    public long minEnd(int n, int x) {
        long ans = x;
        long k = n - 1;
        long bit = 1;

        while (k > 0) {
            if ((x & bit) == 0) {
                if ((k & 1) == 1) {
                    ans |= bit;
                }
                k >>= 1;
            }
            bit <<= 1;
        }

        return ans;
    }
}