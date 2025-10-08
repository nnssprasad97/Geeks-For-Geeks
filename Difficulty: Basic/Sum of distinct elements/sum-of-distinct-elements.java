import java.util.*;

class Solution {
    int findSum(int arr[]) {
        Set<Integer> set = new HashSet<>();
        int sum = 0; // initialize sum
        for(int i : arr) {
            if(set.add(i)) { // add returns true if i was not in set
                sum += i;
            }
        }
        return sum;
    }
}
