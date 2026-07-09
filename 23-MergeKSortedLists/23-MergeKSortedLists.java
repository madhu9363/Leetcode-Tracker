// Last updated: 09/07/2026, 15:13:17
import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        // Create a Min Heap
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> a.val - b.val
        );

        // Add the first node of each linked list
        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }

        // Dummy node to build the result list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Process all nodes
        while (!pq.isEmpty()) {

            // Get the smallest node
            ListNode smallest = pq.poll();

            // Add it to the merged list
            current.next = smallest;
            current = current.next;

            // Add the next node of the same list
            if (smallest.next != null) {
                pq.offer(smallest.next);
            }
        }

        // Return merged list
        return dummy.next;
    }
}