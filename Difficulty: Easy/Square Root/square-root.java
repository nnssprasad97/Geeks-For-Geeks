class Solution {
    public int floorSqrt(int n) {
        for (int i = 1; i*i <= n; i++)if((i+1)*(i+1) > n) return i;
        return n;
    }
}
