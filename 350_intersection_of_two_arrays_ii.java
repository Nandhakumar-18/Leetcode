class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> nums = new ArrayList<>();
        for(int x : nums1) map.put(x, map.getOrDefault(x, 0) + 1);
        for(int n : nums2) {
        	if(map.getOrDefault(n, 0) > 0) {
        		nums.add(n);
        		map.put(n, map.getOrDefault(n, 0) - 1);
        	}
        }
        int[] res = new int[nums.size()];
        for(int i = 0; i < res.length; i++) res[i] = nums.get(i);
        return res;
    }
}