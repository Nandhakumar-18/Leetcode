class Solution {
    public int countDigits(int num) {
        int count = 0;
		String[] str = String.valueOf(num).split("");
		for(String s : str) {
			int val = Integer.valueOf(s);
			if(num % val == 0) count++;
		}
		return count;
    }
}