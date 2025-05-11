class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(str1 + str2 != str2 + str1)
            return "";
        int len1 = str1.length();
        int len2 = str2.length();
        int gcdLength = gcd(len1, len2);
        return str1.substr(0, gcdLength);
        
        
    }
}
