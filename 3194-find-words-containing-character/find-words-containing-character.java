class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> indexes = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            String str = words[i];
            for(char ch : str.toCharArray()){
                if(ch == x & !indexes.contains(i)) indexes.add(i);
            }
        }
        return indexes;
    }
}