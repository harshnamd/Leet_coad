class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        java.util.Arrays.sort(nums);
        int curr = nums[0];
        int count = 1;
        for(int i = 1 ; i < nums.length ; i++)
        {
            if(nums[i] == curr)
            {
                count++;
            }
            else
            {
                count = 1;
                curr = nums[i];
            }
            if(count > 2)
            {
                return false;
            }
        }
        return true;        
    }
}
