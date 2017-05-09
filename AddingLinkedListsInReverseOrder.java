
package algorithms.linkedlist;

public class AddingLinkedListsInReverseOrder {

	ListNode addTwoLinkedLists(ListNode headNode1, ListNode headNode2) {
		ListNode sumNode = null;
		ListNode prevNode = null;
		ListNode tempNode = null;
		int carry = 0, sum = 0;

		while (headNode1 != null || headNode2 != null) {
			int headNode1Data = 0;
			int headNode2Data = 0;

			if (headNode1 != null) {
				headNode1Data = headNode1.data;
			}
			if (headNode2 != null) {
				headNode2Data = headNode2.data;
			}
			sum = headNode1Data + headNode2Data + carry;

			if (sum >= 10) {
				carry = 1;
			} else {
				carry = 0;
			}
			sum = sum % 10;
			tempNode = new ListNode(sum);

			if (sumNode == null) {
				sumNode = tempNode;
			} else {
				prevNode.next = tempNode;
			}
			prevNode = tempNode;

			if (headNode1 != null) {
				headNode1 = headNode1.next;
			}
			if (headNode2 != null) {
				headNode2 = headNode2.next;
			}
			if (carry > 0) {
				tempNode.next = new ListNode(carry);
			}
		}
		return sumNode;
	}
	public void printLinkedList(ListNode node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public static void main(String args[]) {

		System.out.println("\nLinked List1:");
		AddingLinkedListsInReverseOrder obj = new AddingLinkedListsInReverseOrder();
		ListNode head1 = null;
		head1 = new ListNode(1);
		head1.next = new ListNode(1);
		head1.next.next = new ListNode(8);
		obj.printLinkedList(head1);
		System.out.println("Linked List2:");
		ListNode head2 = null;
		head2 = new ListNode(8);
		head2.next = new ListNode(7);
		head2.next.next = new ListNode(1);
		obj.printLinkedList(head2);
		System.out.println("Added Linked List:");
		ListNode resNode = obj.addTwoLinkedLists(head1, head2);
		obj.printLinkedList(resNode);
	}
}

/*class ListNode {
	public int data;
	public ListNode next;

	ListNode(int data) {
		this.data = data;
	}
}*/
