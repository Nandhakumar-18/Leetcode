class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for(int n : nums1) s1.add(n);
        for(int n : nums2) s2.add(n);
        int c1 = 0, c2 = 0;
        for(int x : nums1){
            if(s2.contains(x)) c1++;
        }
        for(int x : nums2){
            if(s1.contains(x)) c2++;
        }
        return new int[]{c1, c2};
    }
}