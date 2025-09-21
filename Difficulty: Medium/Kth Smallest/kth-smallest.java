// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
       Set<Integer>set=new HashSet<>();
       Arrays.sort(arr);
       for(int i=0;i<arr.length;i++){
           if(k==1)return arr[i];
           if(set.add(arr[i]))k--;
       }
       return -1;
    }
}
