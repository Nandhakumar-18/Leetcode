class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] arr = score.clone();
        Arrays.sort(arr);
        HashMap<Integer,String> m = new HashMap<>();
        int rank = 1;
        for(int i = arr.length - 1; i >= 0; i--){
            if(rank == 1) m.put(arr[i],"Gold Medal");
            else if(rank == 2) m.put(arr[i],"Silver Medal");
            else if(rank == 3) m.put(arr[i],"Bronze Medal");
            else m.put(arr[i],String.valueOf(rank));
            rank++;
        }
        String[] res = new String[score.length];
        for(int i = 0; i < res.length; i++){
            res[i] = m.get(score[i]);
        }
        return res;
    }
}