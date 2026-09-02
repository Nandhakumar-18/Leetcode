class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> l = new ArrayList<>();
        int max = 0;
        for(int n : candies){
            if(n > max) max = n;
        }
        for(int n : candies){
            if(extraCandies + n >= max) l.add(true);
            else l.add(false);
        }
        return l;
    }
}