class Solution{
    public int rowWithMax1s(int arr[][]){
        int n=arr.length,m=arr[0].length;
        int maxindex=-1,row=0,col=m-1;
        while(row<n&&col>=0){
            if(arr[row][col]==1){
                maxindex=row;
                col--;
            }else row++;
        }
        return maxindex;
    }
}
