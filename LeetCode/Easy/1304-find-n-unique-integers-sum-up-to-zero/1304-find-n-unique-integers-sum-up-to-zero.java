class Solution {
    public int[] sumZero(int n) {
        int[] a = new int[n];
        int b = 0;
        if (n % 2 != 0) {
            a[b++] = 0;
        }
        for (int i = 1; i <= n / 2; i++) {
            a[b++] = i;
            a[b++] = -i;
        }
        return a;
    }
}