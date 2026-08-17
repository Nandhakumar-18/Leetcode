class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
		int l = searchWord.length(), idx = 1;
		for(String word : words) {
			if(word.length() >= l) {
				if(searchWord.equals(word.substring(0, l))) return idx;
			}
			idx++;
		}
		return -1;
    }
}