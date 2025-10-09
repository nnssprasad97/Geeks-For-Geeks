// User function Template for Java

class Solution {
    // Just print the space seperated array elements
    void printArray(int arr[]) {
        int i=0;
        while(i<arr.length-1){
            System.out.print(arr[i]+" ");
            i++;
            
        }
        System.out.print(arr[i]);
    }
}