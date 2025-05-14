class Solution {
     public boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); 
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public String reverseVowels(String s) {
        int n = s.length();
        int l = 0;
        int h = n-1;
        char[] arr = s.toCharArray();
        while(l < h)
        {
            char ch1 = arr[l];
            char ch2 = arr[h];
            if(!isVowel(ch1))
            {
                l++;
            }
            if(!isVowel(ch2))
            {
                h--;
            }
            if(isVowel(ch1) && isVowel(ch2))
            {
                char temp = arr[l];
                arr[l]=arr[h];
                arr[h] = temp;
                l++;
                h--;
            }
        }

        return new String(arr);
    }
}
