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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode();
        ListNode head = list;

        int sum = 0, frwd = 0;
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + frwd;
            list.next = new ListNode(sum % 10);
            list = list.next;
            frwd = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            sum = l1.val + frwd;
            list.next = new ListNode(sum % 10);
            list = list.next;
            frwd = sum / 10;
            l1 = l1.next;
        }
        while (l2 != null) {
            sum = l2.val + frwd;
            list.next = new ListNode(sum % 10);
            list = list.next;
            frwd = sum / 10;
            l2 = l2.next;
        }
        if (frwd != 0) {
            list.next = new ListNode(frwd);
        }
        return head.next;
    }
}