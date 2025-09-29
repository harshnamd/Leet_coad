class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length;
        int count = 0;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                String a = words[i];
                String b = words[j];
                if (b.length() >= a.length()
                        && b.startsWith(a)
                        && b.endsWith(a)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}