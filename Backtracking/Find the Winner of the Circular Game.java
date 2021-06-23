class Solution {
    public int findTheWinner(int n, int k) {
       int idx  = fun(n,k);
       return idx+1;
    }
    public int fun(int n, int k){
        if(n==1){
                return 0;
        }
        int x = fun(n-1, k);
        int y = (x+k)%n;
        return y;
    
    }
}

