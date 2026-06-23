class Solution {
    public boolean validDigit(int n, int x) {
        String[] digits = String.valueOf(n).split("");
		int count = 0;
		for(String s : digits) {
			if(Integer.parseInt(s) == x) count++;
		}
		return Integer.parseInt(digits[0]) != x && count >= 1;
    }
}