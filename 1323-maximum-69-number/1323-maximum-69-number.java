class Solution {
    public int maximum69Number (int num) {
        int max=-1,i=0,ori=num,tem=0;
        
        // if(ref-num==0) return num;
        while(num>0){
            int d=num % 10;
             if(d==6){
                 tem=ori+(int)(3*Math.pow(10,i));//3 30 300 3000
                 max= tem>max ? tem :ori;
             }
            else{
                max=ori>max ? ori : max;
            }
            
            i++;
            num/=10;
        }
        return max;
        
    }
}