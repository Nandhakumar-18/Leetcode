class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        ArrayList<Integer> al = new ArrayList<>();
        int[] C = new int[A.length];
        for(int i = 0; i < A.length; i++){
            int count = 0;
            al.add(A[i]);
            for(int j = 0; j <= i; j++){
                if(al.contains(B[j])) count++;
            }
            C[i] = count;
        }
        return C;
    }
}