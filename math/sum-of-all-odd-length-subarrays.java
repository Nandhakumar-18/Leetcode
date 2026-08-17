class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int len = end - start + 1;
                if (len % 2 == 1) {
                    for (int k = start; k <= end; k++) sum += arr[k];
                }
            }
        }
        return sum;
    }
}