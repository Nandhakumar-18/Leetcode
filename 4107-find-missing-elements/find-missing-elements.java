class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        for(int n : nums) l.add(n);
        Arrays.sort(nums);
        for(int i = nums[0]; i <= nums[nums.length - 1]; i++){
            if(!l.contains(i)) a.add(i);
        }
        return a;
    }
}