class Solution {
    public ArrayList<String> binstr(int n) {
        ArrayList<String> result = new ArrayList<>();
        generateBinary(n, "", result);
        return result;
    }
    
    private void generateBinary(int n, String current, ArrayList<String> result) {
        if (current.length() == n) {
            result.add(current);
            return;
        }
        
        // Add 0 first to maintain ascending order
        generateBinary(n, current + "0", result);
        // Then add 1
        generateBinary(n, current + "1", result);
    }
}