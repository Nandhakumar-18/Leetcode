class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int limit = arr.length / 4;
        for (int num : arr) {
            int freq = map.getOrDefault(num, 0) + 1;
            map.put(num, freq);
            if (freq > limit) return num;
        }
        return -1;
    }
}