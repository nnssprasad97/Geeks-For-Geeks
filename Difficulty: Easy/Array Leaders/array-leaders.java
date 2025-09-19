class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int high=arr[arr.length-1];
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=high){
                high=arr[i];
                list.add(high);
            }
        }
        Collections.reverse(list);
        return list;
    }
}
