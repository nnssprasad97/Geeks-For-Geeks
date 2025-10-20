// User function Template for Java

class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        int arr[]=new int[n];
        arr[0]=0;
        if(n==1)return arr;
        arr[0]=0;
        arr[1]=1;
        if(n==2)return arr;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr;
    }
}