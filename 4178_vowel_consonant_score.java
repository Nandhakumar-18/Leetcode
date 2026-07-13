class Solution {
    public int vowelConsonantScore(String s) {
        int v = 0, c = 0;
        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        for (char ch : s.toCharArray()) {
            if (!Character.isLetter(ch)) continue;
            if (vowels.contains(ch)) v++;
            else c++;
        }
        if (c == 0) return 0;
        return v / c;
    }
}