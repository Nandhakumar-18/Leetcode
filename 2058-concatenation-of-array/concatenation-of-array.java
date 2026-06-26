class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        int idx = 0;
        for(int num : nums) res[idx++] = num;
        for(int num : nums) res[idx++] = num;
        return res;
    }
}