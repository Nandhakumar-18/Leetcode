class Solution {
    public int subtractProductAndSum(int n) {
        String str = String.valueOf(n);
		int product = 1, sum = 0;
		for(String s : str.split("")) {
			product *= Integer.valueOf(s);
			sum += Integer.valueOf(s);
		}
		return product-sum;
    }
}