class Solution {
    public int prefixCount(String[] words, String pref) {
        int l = pref.length(), count = 0;
        for(String s : words){
            if(s.length() >= l){
                if((s.substring(0,l)).equals(pref)) count++;
            }
        }
        return count;
    }
}