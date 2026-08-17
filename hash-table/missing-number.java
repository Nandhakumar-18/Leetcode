class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> l = new HashSet<>();
        for(int num : nums) l.add(num);
        for(int i = 0; i <= l.size(); i++){
            if(!l.contains(i)) return i;
        }
        return -1;
    }
}