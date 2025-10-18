class Solution {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String>a=new ArrayList<>();
        Set<String>b=new HashSet<>();
        for(String i:words){
             b.add(i);
        }
        Map<String,Integer>c=new HashMap<>();
        for(String i:words){
            if(check(i,b,c)){
                a.add(i);
            }
        }
        return a;
    }
    public static boolean check(String i,Set<String>b,Map<String,Integer>c){
        if(c.containsKey(i)){
            return c.get(i)==1;
        }
        for(int z=0;z<i.length();z++){
            if(b.contains(i.substring(0,z))){
                String s1=i.substring(z);
                if(b.contains(s1)||check(s1,b,c)){
                    c.put(i,1);
                    return true;
                }
            }
        }
        c.put(i,0);
        return false;
    }
}