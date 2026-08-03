class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : arr1) count.put(num, count.getOrDefault(num, 0) + 1);
        int[] result = new int[arr1.length];
        int idx = 0;
        for (int num : arr2) {
            int freq = count.get(num);
            for (int i = 0; i < freq; i++) result[idx++] = num;
            count.remove(num);
        }
        List<Integer> remaining = new ArrayList<>(count.keySet());
        Collections.sort(remaining);
        for (int num : remaining) {
            int freq = count.get(num);
            for (int i = 0; i < freq; i++) result[idx++] = num;
        }
        return result;
    }
}