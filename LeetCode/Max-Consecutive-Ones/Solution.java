1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int maxCount = 0, currentCount = 0;
4        for(int x : nums){
5            if(x == 1) currentCount++;
6            else{
7                maxCount = Math.max(maxCount, currentCount);
8                currentCount = 0;
9            }
10        }
11        return maxCount > currentCount ? maxCount : currentCount;
12    }
13}