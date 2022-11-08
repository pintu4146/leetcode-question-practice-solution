class Solution {
    public int numberOfMatches(int n) {
          
        int c=0,rtn=0;
        while(n !=1 ){
            if((n&1)==0){
                rtn=n/2;
                n=rtn;
            }
            else{
                rtn=(n-1)/2;
                n=rtn+1;
            }
            c+=rtn;
        }
        
        return c;
        
    }
}