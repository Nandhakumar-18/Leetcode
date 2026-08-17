class Solution {
    public long sumAndMultiply(int n) {
        String[] str = String.valueOf(n).split("");
		String S = "";
		int sum = 0;
		for(String s : str) {
			if(Integer.parseInt(s) != 0) {
				S += s;
				sum += Integer.parseInt(s);
			}
		}
        if(S.isEmpty()) return 0;
		return Long.parseLong(S) * sum;
    }
}