class Solution {
    public int smallestEvenMultiple(int n) {
        int t=2*n,i=2;
        
        while(i<=t){
            if(i %2==0 && i%n==0)
                return i;
            i++;
        }
        return 1;
    }
}
