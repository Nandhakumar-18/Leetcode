class Solution {
    public int alternateDigitSum(int n) {
        String[] arr = String.valueOf(n).split("");
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			if(i%2 == 0) sum += Integer.valueOf(arr[i]);
			else sum -= Integer.valueOf(arr[i]);
		}
		return sum;
    }
}