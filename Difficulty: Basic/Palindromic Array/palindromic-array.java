/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        for(int i:arr){
            String s=String.valueOf(i);
            for(int j=0;j<s.length()/2;j++){
                if(s.charAt(j)!=s.charAt(s.length()-j-1))return false;
            }
        }
        return true;
    }
}