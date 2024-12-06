package ExponentOfANumber;

public class Solution {
    public static void main(String[] args) {
        double x=2;
        int n=10;

        double ans = pow(x,n);
        System.out.println(x+" to the power "+n+" is "+ans);
    }

    public static double pow(double x, int n){

        return binaryExp(x,(long) n);

    }

    public static double binaryExp(double x, long n){

        if(n==0) return 1;
        if(n<0) return 1/binaryExp(x,-1*n);

        if(n%2!=0) return x * binaryExp(x*x , (n-1)/2);
        else return binaryExp(x*x , n/2);

    }
}
