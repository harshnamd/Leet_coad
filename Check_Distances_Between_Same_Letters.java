class Solution {
    public boolean checkDistances(String s, int[] distance) {
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            int first = s.indexOf(c);
            int second = s.lastIndexOf(c);
             int n = (int)c-97;
           
            int ind = second -  first - 1;

            if(distance[n]==ind)
            {
                continue;
            }
            else
            {
                return false;
            }
        }
      
        return true;
    }
}
