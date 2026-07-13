1class Solution {
2    int sumOfWords(String word) {
3		int sum = 0;
4		for(int i = 0; i < word.length(); i++) {
5			int val = word.charAt(i) - 'a';
6			sum = sum * 10 + val;
7		}
8		return sum;
9	}
10    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
11        return sumOfWords(firstWord) + sumOfWords(secondWord) == sumOfWords(targetWord);
12    }
13}