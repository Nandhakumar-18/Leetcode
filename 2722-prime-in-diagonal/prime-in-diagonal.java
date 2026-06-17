class Solution {
    public int diagonalPrime(int[][] nums) {
        int largestPrime = 0;
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				if(i == j || i + j == nums.length - 1) {
					int num = nums[i][j];
		            boolean prime = num > 1;
		            for (int k = 2; k * k <= num; k++) {
		            	if (num % k == 0) {
		            		prime = false;
			                break;
			            }
			        }
			        if (prime && num > largestPrime) {
			        	largestPrime = num;
			        }
				}
			}
		}
		return largestPrime;
    }
}