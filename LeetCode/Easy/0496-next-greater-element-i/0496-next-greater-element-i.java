class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Map<Integer,Integer> map = new HashMap<>();
        int k=0;
        for(int i=0;i<nums2.length;i++){
            int flag=0;
            for(int j=i+1;j<nums2.length;j++){
                if(nums2[j]>nums2[i]){
                    map.put(nums2[i],nums2[j]);
                    flag=1;
                    break;
                }
            }
            if(flag==0) map.put(nums2[i],-1);
        }
    for(int i:nums1){
        ans[k++]=map.get(i);
    }
    return ans;
    }
}