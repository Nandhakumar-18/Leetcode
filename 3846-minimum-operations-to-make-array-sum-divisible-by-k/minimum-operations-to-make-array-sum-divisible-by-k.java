class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
		for(int n : nums) sum += n;
		if(sum > k) return sum % k;
		if(sum < k) return sum;
		return 0;
    }
}