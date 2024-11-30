class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int target = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            if (target <= i + nums[i]) {
                target = i;
            }
        }
        return target == 0;
    }
}
