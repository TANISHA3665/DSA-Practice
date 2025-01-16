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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int length = 1;

        if(head == null) return null;

        if(head.next == null) return head;

        while(temp.next != null){
            temp = temp.next;
            length++;
        }

        int i = 0;

        while(i != (length/2)){
            head = head.next;
            i++;
        }

        return head;
    }
}