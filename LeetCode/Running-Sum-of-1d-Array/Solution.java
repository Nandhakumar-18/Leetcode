1class Solution {
2    public int[] runningSum(int[] nums) {
3        int[] sum = new int[nums.length];
4        sum[0] = nums[0];
5        int idx = 1;
6        while(idx < nums.length) {
7        	for(int i = 1; i < sum.length; i++) {
8        		sum[i] = sum[i-1] + nums[i];
9        	}
10        	idx++;
11        }
12        return sum;
13    }
14}