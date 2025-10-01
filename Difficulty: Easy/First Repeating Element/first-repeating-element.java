class Solution {
     public static int firstRepeated(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]))minIndex = Math.min(minIndex, map.get(arr[i]));
            else map.put(arr[i], i);
        }
        if (minIndex == Integer.MAX_VALUE)return -1;
        return minIndex + 1;
    }
}
