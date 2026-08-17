class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        int idx = 1;
        while(idx < nums.length) {
        	for(int i = 1; i < sum.length; i++) {
        		sum[i] = sum[i-1] + nums[i];
        	}
        	idx++;
        }
        return sum;
    }
}