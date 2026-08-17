class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new TreeMap<>(Collections.reverseOrder());
        for(int i = 0; i < heights.length; i++) map.put(heights[i],names[i]);
        String[] ans = new String[names.length];
        int idx = 0;
        for(String name : map.values()) ans[idx++] = name;
        return ans;
    }
}