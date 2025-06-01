class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int a = 2 * k + 2;
        int[] b = new int[n];
        Arrays.fill(b,-1);
        
        if (n < a) {
            return b;
        }
        
        long[] p = new long[n + 1];
        for (int i = 0; i < n; ++i) {
            p[i + 1] = p[i] + nums[i];
        }
        
        for (int i = k; i + k < n; ++i) {
            b[i] = (int) ((p[i + k + 1] - p[i - k]) / a);
        }
        
        return b;
    }
}