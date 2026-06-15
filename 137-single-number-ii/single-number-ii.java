class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
		int val = 0;
		for(int num : nums) m.put(num, m.getOrDefault(num, 0) + 1);
		for(Map.Entry<Integer,Integer> entry : m.entrySet()) {
			if(entry.getValue() == 1) val = entry.getKey();
		}
		return val;
    }
}