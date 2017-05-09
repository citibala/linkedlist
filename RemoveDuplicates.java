
package algorithms.linkedlist;

public class RemoveDuplicates {

	public static ListNode headNode;

	public ListNode removeDuplicates() {

		if (headNode == null)
			return headNode;

		ListNode nextNode;
		ListNode prevNode;
		int prev = headNode.data;
		prevNode = headNode;
		nextNode = headNode.next;
		while (nextNode != null) {
			if (nextNode.data == prev) {
				prevNode.next = nextNode.next;
			} else {
				prevNode = nextNode;
				prev = nextNode.data;
			}

			nextNode = nextNode.next;
		}

		return headNode;
	}

	public void printLinkedList(ListNode node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public static void main(String args[]) {

		System.out.println("Sorted Linked List with duplicate elements:");
		RemoveDuplicates obj = new RemoveDuplicates();
		headNode = new ListNode(10);
		headNode.next = new ListNode(20);
		headNode.next.next = new ListNode(50);
		headNode.next.next.next = new ListNode(50);
		headNode.next.next.next.next = new ListNode(50);
		headNode.next.next.next.next.next = new ListNode(60);
		headNode.next.next.next.next.next.next = new ListNode(60);
		obj.printLinkedList(headNode);

		System.out.println("Final Linked List after removal:");
		ListNode resNode = obj.removeDuplicates();
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
