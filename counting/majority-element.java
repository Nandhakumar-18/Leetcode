class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
		for(int num : nums) m.put(num, m.getOrDefault(num, 0) + 1);
		int max = 0, val = 0;;
		for(Map.Entry<Integer,Integer> entry : m.entrySet()) {
			if(entry.getValue() > max) {
				max = entry.getValue();
				val = entry.getKey();
			}
		}
		return val;
    }
}