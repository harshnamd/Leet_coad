class Solution {
    public int arraySign(int[] nums) {
        int c=0;
        for(int n:nums){
            if(n==0) return 0;
            if(n<0)c++;
        }
        return c%2==0?1:-1;
    }
}