class Solution {
    public int countSeniors(String[] details) {
        int n = details.length;
        int count=0;
        for(int i=0;i<n;i++){
            String str = details[i];
            int x = Integer.parseInt(str.substring(11,13));
            if(x>60){
                count++;
            }
        }
        return count; 
    }
}
