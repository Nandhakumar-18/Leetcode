class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, currentCount = 0;
        for(int x : nums){
            if(x == 1) currentCount++;
            else{
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            }
        }
        return maxCount > currentCount ? maxCount : currentCount;
    }
}