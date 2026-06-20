class Solution {
    public int differenceOfSum(int[] nums) {
        String str = "";
		int eSum = 0, dSum = 0;
		for(int x : nums) {
			eSum += x;
			str += String.valueOf(x);
		}
		for(String s : str.split("")) dSum += Integer.valueOf(s);
		return Math.abs(eSum-dSum);
    }
}