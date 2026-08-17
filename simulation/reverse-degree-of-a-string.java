class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			int ascci = 'z' - (int)s.charAt(i) + 1;
			sum += ascci * (i+1);
		}
		return sum;
    }
}