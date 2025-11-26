class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen=Integer.MAX_VALUE,pt1=0,pt2=0;
        int sum=0;
        for(pt2=0;pt2<nums.length;pt2++){
           sum+=nums[pt2];
           while(sum>=target){
                minlen=Math.min(minlen,pt2-pt1+1);
                sum-=nums[pt1++];
           }            
        }
        return minlen==Integer.MAX_VALUE?0:minlen;
    }
}