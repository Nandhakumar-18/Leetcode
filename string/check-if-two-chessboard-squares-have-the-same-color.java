class Solution {
    
    String colorOf(String s) {
		char y = s.charAt(0);
		int x = (int)s.charAt(1);
		if(y == 'b' || y == 'd' || y == 'f' || y == 'h') {
			if(x%2 != 0) return "white";
		}
		else if(y == 'a' || y == 'c' || y == 'e' || y == 'g') {
			if(x%2 == 0) return "white";
		}
		return "black";
	}

    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        String color1 = colorOf(coordinate1);
		String color2 = colorOf(coordinate2);
		return color1.equals(color2);
    }
}