import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int[] res = heights.clone();
        Arrays.sort(res);
        int count = 0;
        for(int i = 0; i < res.length; i++){
            if(res[i] != heights[i]) count++;
        }
        return count;
    }
}