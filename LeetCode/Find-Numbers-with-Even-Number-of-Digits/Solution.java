1class Solution {
2    public int findNumbers(int[] nums) {
3        int count = 0;
4		for(int x : nums) {
5			String str = Integer.toString(x);
6			if(str.length() %2 == 0) count++;
7		}
8		return count;
9    }
10}