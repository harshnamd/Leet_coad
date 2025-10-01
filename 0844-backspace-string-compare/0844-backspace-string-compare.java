class Solution {
    public boolean backspaceCompare(String s, String t) {
       
        Stack<Character>s1=new Stack<>();
        for(char c:s.toCharArray()){
             if(c=='#' && !s1.isEmpty())s1.pop();
            else if(c!='#') s1.push(c);

        }

        Stack<Character>t1=new Stack<>();
        for(char c:t.toCharArray()){
             if(c=='#' && !t1.isEmpty())t1.pop();
            else if(c!='#') t1.push(c);

        }
        

        
        return s1.equals(t1);
    }
}