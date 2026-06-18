class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
		String str = "";
		char[] arr = s.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			if(Character.isLetterOrDigit(arr[i])) str += arr[i];
		}
		StringBuilder string = new StringBuilder(str);
		if(str.equals(string.reverse().toString())) return true;
		return false;
    }
}