class Solution {
    public int minimumSum(int num) {
        String str=""+num;
        char[] srr=str.toCharArray();
        Arrays.sort(srr);
        int s1=Integer.parseInt(""+srr[0])*10+Integer.parseInt(""+srr[2]);
        int s2=Integer.parseInt(""+srr[1])*10+Integer.parseInt(""+srr[3]);
        return s1+s2;//0049
    }
}