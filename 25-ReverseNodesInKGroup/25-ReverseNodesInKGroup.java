// Last updated: 09/07/2026, 15:13:14
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        // Count the number of nodes
        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prevGroup = dummy;
        ListNode current = head;

        while (count >= k) {

            ListNode prev = null;
            ListNode tail = current;

            // Reverse k nodes
            for (int i = 0; i < k; i++) {
                ListNode next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }

            // Connect previous group
            prevGroup.next = prev;

            // Connect current group to remaining nodes
            tail.next = current;

            // Move prevGroup to the end of reversed group
            prevGroup = tail;

            count -= k;
        }

        return dummy.next;
    }
}