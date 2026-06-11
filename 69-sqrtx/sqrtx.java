class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int result = 0;
        for (long i = 1; i * i <= x; i++) {
            result = (int) i;
        }
        return result;
    }
}