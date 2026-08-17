class Solution {
    public int[] separateDigits(int[] nums) {
        String s = "";
        for(int n : nums) s += String.valueOf(n);
        String[] digits = s.split("");
        int[] res = new int[digits.length];
        for(int i = 0; i < res.length; i++) res[i] = Integer.parseInt(digits[i]);
        return res;
    }
}