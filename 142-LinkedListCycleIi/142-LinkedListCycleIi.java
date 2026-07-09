// Last updated: 09/07/2026, 15:11:57
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean iscyle = false;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                iscyle = true;
                break;
            }
        }
        if(!iscyle){
         return null;
        }
        while(head!=slow){
            head = head.next;
            slow = slow.next;
        }
        return head;
    }
}