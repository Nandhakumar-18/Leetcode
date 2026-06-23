class Solution {
    public int countEven(int num) {
        Set<String> set = new HashSet<>();
		for(int i = 2; i <= num; i++) {
			set.add(String.valueOf(i));
		}
		int count = 0;
		for(String s : set) {
			int sum = 0;
			for(int i = 0; i < s.length(); i++) sum += (int)s.charAt(i);
			if(sum % 2 == 0) count++;
		}
		return count;
    }
}