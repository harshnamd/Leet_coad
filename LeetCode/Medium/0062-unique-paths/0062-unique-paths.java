class Solution {
    public int uniquePaths(int m, int n) {
        int b[][] = new int[m][n];
        int d[][] = new int [m][n];
        for(int arr[] :d){
            Arrays.fill(arr,-1);
        }
        return helper(0,0,b,d);        
    }
    public int helper(int i, int j, int b[][], int d[][]){
        if(i>=b.length || j>=b[0].length || b[i][j]==1){
            return 0;
        }
        if(i==b.length-1 && j==b[0].length-1){
            return 1;
        }
        if(d[i][j]!=-1){
            return d[i][j];
        }
        b[i][j]=1;
        int ans =0;
        ans+=helper(i,j+1,b,d);
        ans+=helper(i+1,j,b,d);
        b[i][j]=0;
        return d[i][j]=ans;
    }
}