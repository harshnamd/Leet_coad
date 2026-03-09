class Solution {
    public int singleNonDuplicate(int[] nums) {
        Stack<Integer> stack=new Stack<Integer>();
        int i=1;
        stack.push(nums[0]);
        while(i<nums.length){
            if(stack.peek()==nums[i]){
                stack.pop();
                i++;
            }
             if(stack.isEmpty()){
                stack.push(nums[i]);
                i++;
            }
            else if(stack.peek()!=nums[i]){
                return stack.peek();
            }
        }
        return stack.peek();
    }
}