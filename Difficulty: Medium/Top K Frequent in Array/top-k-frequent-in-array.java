class Solution {
    public ArrayList<Integer> topKFrequent(int[] arr, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) map.put(x, map.getOrDefault(x, 0) + 1);
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> {
            if (!map.get(a).equals(map.get(b))) return map.get(b) - map.get(a);
            return b - a;
        });
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++) res.add(list.get(i));
        return res;
    }
}
