class Solution {
    public int[] concatWithReverse(int[] nums) {
        int l = nums.length * 2;
		int[] reverse = new int[nums.length];
		int idx = 0;
		for(int i = nums.length - 1; i >= 0; i--) {
			reverse[idx++] = nums[i];
		}
		int[] res = new int[l];
		int index = 0;
		for(int x : nums) res[index++] = x;
		for(int y : reverse) res[index++] = y;
		return res;
    }
}