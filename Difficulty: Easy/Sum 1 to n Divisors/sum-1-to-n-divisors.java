class Solution {
    public static long sumOfDivisors(long n) {
        long sum=0;
        for(int d=1;d<=n;d++)sum+=(long)d*(n/d);
        return sum;
    }
}