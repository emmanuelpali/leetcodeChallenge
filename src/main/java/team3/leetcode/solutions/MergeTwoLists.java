package team3.leetcode.solutions;

public class MergeTwoLists {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		// Create a head node to act as the starting point of the merged list
		ListNode head = new ListNode(0);
		ListNode current = head;

		// Traverse both lists and compare their nodes
		while (list1 != null && list2 != null) {
			// Compare the values and add the smaller node to the merged list
			if (list1.val <= list2.val) {
				current.next = list1;
				list1 = list1.next;
			} else {
				current.next = list2;
				list2 = list2.next;
			}
			// Move to the next node in the merged list
			current = current.next;
		}

		// If there are remaining nodes in either list, add them to the merged list
		if (list1 != null) {
			current.next = list1;
		} else {
			current.next = list2;
		}

		// Return the merged list, which starts at head.next (because the first one was just a tracker)
		return head.next;
	}
}
