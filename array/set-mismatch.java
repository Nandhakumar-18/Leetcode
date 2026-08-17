class Solution {
    public int[] findErrorNums(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        int uSum = 0;
        int aSum = 0;
        int eSum = (nums.length * (nums.length + 1)) / 2;
        for(int n : nums) {
        	set.add(n);
        	aSum += n;
        }
        for(int x : set) uSum += x;
        int duplicate = (int) (aSum - uSum);
        int missing = (int) (eSum - uSum);
        return new int[]{duplicate, missing};
    }
}