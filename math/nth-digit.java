class Solution {
    public int findNthDigit(int n) {
        long c = 9, s = 1;
		int l = 1;
		while(n > c * l) {
			n -= c * l;
			l++;
			c *= 10;
			s *= 10;
		}
		long t = s + (n - 1) / l;
		String str = Long.toString(t);
		return str.charAt((int)((n-1) % l)) - '0';
    }
}