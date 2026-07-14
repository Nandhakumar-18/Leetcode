class Solution {
    public boolean detectCapitalUse(String word) {
        String str = word;
        if((str.toUpperCase()).equals(word) || 
        		(str.toLowerCase()).equals(word) ||
        		(Character.toUpperCase(str.charAt(0)) + 
        				str.substring(1).toLowerCase()).equals(word)) {
        	return true;
        }
        else return false;
    }
}