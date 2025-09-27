class Solution{
    int majorityElement(int arr[]){
        if(arr==null||arr.length==0)return -1;
        int candidate=-1,count=0;
        for(int element:arr){
            if(count==0){candidate=element;count=1;}
            else if(element==candidate)count++;
            else count--;
        }
        count=0;
        for(int element:arr)if(element==candidate)count++;
        return count>arr.length/2?candidate:-1;
    }
}
