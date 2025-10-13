// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        StringBuilder ss= new StringBuilder(s);
        ss.reverse();
        String rev=ss.toString();
        return rev;
    }
}