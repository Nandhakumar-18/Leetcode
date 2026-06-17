class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] wealth = new int[accounts.length];
		for(int i = 0; i < accounts.length; i++) {
			int sum = 0;
			for(int j = 0; j < accounts[i].length; j++) {
				sum += accounts[i][j];
			}
			wealth[i] = sum;
		}
		Arrays.sort(wealth);
		return wealth[wealth.length-1];
    }
}