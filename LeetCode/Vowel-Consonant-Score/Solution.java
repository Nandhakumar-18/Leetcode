1class Solution {
2    public int vowelConsonantScore(String s) {
3        int v = 0, c = 0;
4
5        Set<Character> vowels = Set.of(
6            'a','e','i','o','u',
7            'A','E','I','O','U'
8        );
9        for (char ch : s.toCharArray()) {
10            if (!Character.isLetter(ch)) continue;
11            if (vowels.contains(ch)) v++;
12            else c++;
13        }
14        if (c == 0) return 0;
15        return v / c;
16    }
17}