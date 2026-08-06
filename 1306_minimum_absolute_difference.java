class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = arr[1] - arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            int diff = arr[i+1] - arr[i];
            if(diff < min) min = diff;
        }
        List<List<Integer>> l = new ArrayList<>();
        for(int i = 0; i < arr.length-1; i++){
            int diff = arr[i+1] - arr[i];
            if(diff == min) l.add(Arrays.asList(arr[i],arr[i+1]));
        }
        return l;
    }
}