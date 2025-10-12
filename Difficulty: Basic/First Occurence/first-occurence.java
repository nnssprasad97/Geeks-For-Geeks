class Solution {
    int firstOccurence(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        for (int i = 0; i <= n - m; i++) { // up to where pat can fit
            int j;
            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break; // mismatch, move to next i
                }
            }
            if (j == m) return i;
        }
        return -1;
    }
}
