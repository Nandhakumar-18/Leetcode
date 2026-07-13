1class Solution {
2    public int vowelConsonantScore(String s) {
3        int v = 0, c = 0;
4        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
5        for (char ch : s.toCharArray()) {
6            if (!Character.isLetter(ch)) continue;
7            if (vowels.contains(ch)) v++;
8            else c++;
9        }
10        if (c == 0) return 0;
11        return v / c;
12    }
13}