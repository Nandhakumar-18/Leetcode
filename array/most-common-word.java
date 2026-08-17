class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z0-9]", " ");
		HashSet<String> bannedWords = new HashSet<>(Arrays.asList(banned));
		HashMap<String, Integer> frequency = new HashMap<>();
		for(String word : paragraph.split("\\s+")){
			if(!word.isEmpty() && !bannedWords.contains(word)) {
				frequency.put(word, frequency.getOrDefault(word, 0) + 1);
			}
		}
		String mostFrequent = "";
		int maxCount = 0;
		for(Map.Entry<String, Integer> entry : frequency.entrySet()) {
			if(entry.getValue() > maxCount) {
				maxCount = entry.getValue();
				mostFrequent = entry.getKey();
			}
		}
		return mostFrequent;
    }
}