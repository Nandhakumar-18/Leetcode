1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if (nums.length == 0) return 0;
4        int i = 1;
5        for (int j = 1; j < nums.length; j++) {
6            if (nums[j] != nums[i - 1]) {
7                nums[i] = nums[j];
8                i++;
9            }
10        }
11        return i;
12    }
13}