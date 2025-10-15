/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        int cnt=0;
        while(head.next!=null){
            head=head.next;
            cnt++;
        }
        return cnt+1;
    }
}