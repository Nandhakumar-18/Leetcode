1class Solution {
2    public int digitFrequencyScore(int n) {
3        Map<String,Integer> freq = new HashMap<>();
4        for(String digit : Integer.toString(n).split("")){
5            if(freq.containsKey(digit)) freq.put(digit,freq.get(digit)+1);
6            else freq.put(digit,1);
7        }
8        int sum = 0;
9        for(Map.Entry<String, Integer> entry : freq.entrySet()) {
10        	sum += entry.getValue() * Integer.parseInt(entry.getKey());
11        }
12        return sum;
13
14    }
15}