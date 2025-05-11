# solution 1--


class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int maxLength = Math.max(word1.length(), word2.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) {
                merged.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                merged.append(word2.charAt(i));
            }
        }

        return merged.toString();        
    }
}



# solution 2 --


class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n1 = word1.length();
        int n2 = word2.length();
        int i = 0;
        while(i < n1 || i < n2){
            if (i < n1){
                sb.append(word1.charAt(i));
            }
            if (i < n2){
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
