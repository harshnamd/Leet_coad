class Solution {

    public boolean isCovered(int[][] ranges, int left, int right) {

        for (int i = left; i <= right; i++) {
            boolean a = false;

            for (int[] arr : ranges) {
                if (arr[0] <= i && arr[1] >= i) {
                    a = true;
                    break;
                }
            }

            if (!a) return false;
        }

        return true;
    }
}