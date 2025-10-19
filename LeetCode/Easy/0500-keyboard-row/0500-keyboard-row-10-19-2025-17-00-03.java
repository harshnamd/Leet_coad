import java.util.ArrayList;

class Solution {
    public String[] findWords(String[] words) {
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        ArrayList<String> list = new ArrayList<>();
        for (String lower : words) {
            boolean f = false, s = false, t = false;
            String str = lower.toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                String sub = str.substring(i, i + 1);
                if (first.contains(sub)) {
                    f = true;
                } else if (second.contains(sub)) {
                    s = true;
                } else if (third.contains(sub)) {
                    t = true;
                }
                if ((f && s) || (f && t) || (s && t)) {
                    break;
                }
            }
            if ((f && !s && !t) || (!f && s && !t) || (!f && !s && t)) {
                list.add(lower);
            }
        }
        String[] res = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
