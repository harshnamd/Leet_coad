/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode n = new ListNode(-1); // Dummy node before head
        n.next = head;
        ListNode prev = n;

        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;        
            ListNode second = first.next; 

            prev.next = second;
            first.next = second.next;
            second.next = first;

            // Move prev pointer for next pair
            prev = first;
        }

        return n.next; 
    }
}