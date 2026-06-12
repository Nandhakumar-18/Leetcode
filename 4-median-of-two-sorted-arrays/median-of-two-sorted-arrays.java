class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length + nums2.length;
        int[] arr = new int[nums1.length + nums2.length];
        int idx = 0;
        for(int i = 0; i < nums1.length; i++){
            arr[idx++] = nums1[i];
        }
        for(int i = 0; i < nums2.length; i++){
            arr[idx++] = nums2[i];
        }
        Arrays.sort(arr);
        if(l%2!=0){
            return arr[l/2];
        }
        return (arr[l/2-1] + arr[l/2])/2.0;
    }
}