class Solution {
    public boolean squareIsWhite(String coordinates) {
        char y = coordinates.charAt(0);
		int x = (int)coordinates.charAt(1);
		if(y == 'b' || y == 'd' || y == 'f' || y == 'h') {
			if(x%2 != 0) return true;
		}
		else if(y == 'a' || y == 'c' || y == 'e' || y == 'g') {
			if(x%2 == 0) return true;
		}
		return false;
    }
}