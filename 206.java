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
    public ListNode reverseList(ListNode head) {
        ListNode list = null;
        ListNode old = head;
        while(old != null) {
            ListNode temp = old.next;
            old.next = list;
            list = old;
            old = temp;
        }
        return list;
    }
}