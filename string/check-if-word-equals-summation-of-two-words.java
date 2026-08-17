class Solution {
    int sumOfWords(String word) {
		int sum = 0;
		for(int i = 0; i < word.length(); i++) {
			int val = word.charAt(i) - 'a';
			sum = sum * 10 + val;
		}
		return sum;
	}
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return sumOfWords(firstWord) + sumOfWords(secondWord) == sumOfWords(targetWord);
    }
}