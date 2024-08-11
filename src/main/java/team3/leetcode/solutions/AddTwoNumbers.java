package team3.leetcode.solutions;

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// Create a dummy node to act as the head of the resulting list
		ListNode head = new ListNode(0);
		// Initialize a pointer to the current node in the resulting list
		ListNode current = head;
		// Initialize a variable to store the leftover value
		int leftOver = 0;

		// Loop until both l1 and l2 are null
		while (l1 != null || l2 != null) {
			int l1Val = (l1 != null) ? l1.val : 0;
			int l2Val = (l2 != null) ? l2.val : 0;

			// Calculate the sum of the values and the leftover
			int sum = l1Val + l2Val + leftOver;

			// Update the leftover value for the next iteration
			leftOver = sum / 10;

			// Create a new node with the digit value of the sum and add it to the resulting
			// list
			current.next = new ListNode(sum % 10);

			// Move the current pointer to the next node in the resulting list
			current = current.next;

			// Move to the next nodes in l1 and l2 if they are not null
			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
		}

		// Handle remaining carry-over
		if (leftOver > 0) {
			current.next = new ListNode(leftOver);
		}

		// Return the head of the resulting list (skipping the dummy node)
		return head.next;
	}
}
