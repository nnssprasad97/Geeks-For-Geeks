class Solution {
    public static List<Integer> nthRowOfPascalTriangle(int n) {
        List<Integer> row = new ArrayList<>();
        long val = 1;
        row.add(1); // first element always 1

        for (int i = 1; i < n; i++) {
            val = val * (n - i);
            val = val / i;
            row.add((int) val);
        }

        return row;
    }
}
