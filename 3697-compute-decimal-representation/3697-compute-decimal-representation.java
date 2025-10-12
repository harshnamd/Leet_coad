class Solution {
    public int[] decimalRepresentation(int n) {
        List <Integer> a = new ArrayList<>();
        int i=1;
        while(n>0){
            int r = n%10;
            if(r!=0){
                a.add(i*r);
            }
            n=n/10;
            i=i*10;
        }
        int [] arr = new int[a.size()];
        for(int j=0;j<a.size();j++){
            arr[a.size()-j-1] = a.get(j);
        }
        return arr;
    }
}