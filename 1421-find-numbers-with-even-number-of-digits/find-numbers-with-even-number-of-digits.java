class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
		for(int x : nums) {
			String str = Integer.toString(x);
			if(str.length() %2 == 0) count++;
		}
		return count;
    }
}