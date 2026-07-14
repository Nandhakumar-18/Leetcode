1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int[] res = new int[nums.length * 2];
4        int idx = 0;
5        for(int num : nums) res[idx++] = num;
6        for(int num : nums) res[idx++] = num;
7        return res;
8    }
9}