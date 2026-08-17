class Solution {
    public String truncateSentence(String s, int k) {
        String res = "";
		String[] words = s.split(" ");
		for(int i = 0; i < k; i++) {
			res += words[i] + " ";
		}
		return res.trim();
    }
}