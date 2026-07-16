class Solution {
    public int digitFrequencyScore(int n) {
        Map<String,Integer> freq = new HashMap<>();
        for(String digit : Integer.toString(n).split("")){
            if(freq.containsKey(digit)) freq.put(digit,freq.get(digit)+1);
            else freq.put(digit,1);
        }
        int sum = 0;
        for(Map.Entry<String, Integer> entry : freq.entrySet()) {
        	sum += entry.getValue() * Integer.parseInt(entry.getKey());
        }
        return sum;

    }
}