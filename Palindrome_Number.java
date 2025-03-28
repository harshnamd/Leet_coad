class Solution {
    public static boolean isPalindrome(int x) {
   
       if (x < 0) {
           return false;
       }

       String xStr = Integer.toString(x);
       int len = xStr.length();
       for (int i = 0; i < len / 2; i++) { 
           if (xStr.charAt(i) != xStr.charAt(len - i - 1)) {
               return false;
           }
       }
       
       return true;
   }
}
