class Solution {
    public boolean detectLoop(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;          // move by 1
            fast = fast.next.next;     // move by 2
            if (slow == fast) return true;  // loop detected
        }
        return false;  // reached end, so no loop
    }
}
