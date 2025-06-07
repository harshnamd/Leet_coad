class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int n = gain.length;
        int [] arr = new int[n+1];
        arr[0] = 0;
        for(int i = 0 ; i < n ; i++){
            arr[i+1] = gain[i] + arr[i];
            max = Math.max(max, arr[i+1]);
        }
        return max;
    }
}