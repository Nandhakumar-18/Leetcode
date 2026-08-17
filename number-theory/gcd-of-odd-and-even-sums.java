class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = 0, evenSum = 0;
        for(int i = 1; i <= n * 2; i++) {
        	if(i % 2 == 0) evenSum += i;
        	else oddSum += i;
        }
        return findGCD(oddSum,evenSum);
    }

    int findGCD(int a, int b) {
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}