class Solution {
    static int evenlyDivides(int n) {
        int cnt = 0;
        int m = n;
        
        while (m > 0) {
            int digit = m % 10;
            if (digit != 0 && n % digit == 0) {
                cnt++;
            }
            m /= 10;
        }
        
        return cnt;
    }
}
