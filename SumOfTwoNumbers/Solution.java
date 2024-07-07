class Solution {
    public int getSum(int a, int b) {
        int x = Math.abs(a);
        int y = Math.abs(b);
        if(y>x) return getSum(b,a);
        System.out.println("here");
        int sign;
        if(a>0) sign = 1;
        else sign = -1;
        if(a*b >=0){
            while(y!=0){
                int answer = x^y;
                int carry = (x&y)<<1;
                x=answer;
                y=carry;
            }
        }else{
            while(y!=0){
                int answer = x^y;
                int borrow = ((~x)&y)<<1;
                x=answer;
                y=borrow;
            }
        }
        return x*sign;
    }
}