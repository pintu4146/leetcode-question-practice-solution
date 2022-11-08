class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int len=arr.length,sum=0;
        for(int i=0 ;i<len;i++){
            for(int j=i;j<len;j++){
                int k=0;
                for(k=i;k<=j;k++){
                    if(((j-i+1)&1)==1){
                       // System.out.print(arr[k]);
                        sum+=arr[k];
                    }
                }
                //System.out.println("   j"+ (j-i+1));
            }
            //System.out.println();
        }
        return sum;
        
    }
}