class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map =  new HashMap<>();
        for(int n : nums) map.put(n, map.getOrDefault(n,0)+1);
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                int freq1 = map.get(nums[j]);
                int freq2 = map.get(nums[j + 1]);
                if (freq1 > freq2) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
                else if (freq1 == freq2 && nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}