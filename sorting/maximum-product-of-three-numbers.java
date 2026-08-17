class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int last = nums[nums.length - 1];
        int secLast = nums[nums.length - 2];
        int thirLast = nums[nums.length - 3];
        int first = nums[0];
        int sec = nums[1];
        int prod1 = last * secLast * thirLast;
        int prod2 = first * sec * last;
        return Math.max(prod1,prod2);
    }
}