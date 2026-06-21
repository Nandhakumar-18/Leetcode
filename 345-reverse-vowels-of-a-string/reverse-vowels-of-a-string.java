class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
		if(s==null || s.length()<=1) return s;
		char[] arr = s.toCharArray();
		int l = 0, r = arr.length - 1;
		while(l < r) {
			while(l < r && vowels.indexOf(arr[l]) == -1) l++;
			while(l < r && vowels.indexOf(arr[r]) == -1) r--;
			if(l < r) {
				char temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;
			}
		}
		return new String(arr);
    }
}