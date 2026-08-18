class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int max = 1, a = nums[0], b = nums[nums.length - 1];
        for(int i = 2; i <= Math.min(a,b); i++){
            if(a % i == 0 && b % i == 0){
                if(i > max);
                max = i;
            }
        }
        return max;
    }
}