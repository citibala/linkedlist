
package algorithms.linkedlist;

public class MergeLinkedList {

	static ListNode head1;
	static ListNode head2;

	public ListNode mergeLinkedLists() {

		if (head1 == null)
			return head2;
		if (head2 == null)
			return head1;
		ListNode retNode = null;
		ListNode node = new ListNode(0);
		retNode = node;

		while (head1 != null && head2 != null) {
			if (head1.data <= head2.data) {
				node.next = head1;
				head1 = head1.next;
				node = node.next;
			} else {
				node.next = head2;
				head2 = head2.next;
				node = node.next;
			}
		}

		if (head1 == null)
			node.next = head2;
		else
			node.next = head1;

		retNode = retNode.next;
		return retNode;
	}

	public void printLinkedList(ListNode node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

	public static void main(String args[]) {

		System.out.println("Linked List1:");
		MergeLinkedList obj = new MergeLinkedList();
		head1 = new ListNode(10);
		head1.next = new ListNode(20);
		head1.next.next = new ListNode(50);
		obj.printLinkedList(head1);
		System.out.println("Linked List2:");
		head2 = new ListNode(30);
		head2.next = new ListNode(40);
		head2.next.next = new ListNode(60);
		obj.printLinkedList(head2);
		System.out.println("Merged Linked List:");
		ListNode resNode = obj.mergeLinkedLists();
		obj.printLinkedList(resNode);
	}
}
/*
class ListNode {
	public int data;
	public ListNode next;

	ListNode(int data) {
		this.data = data;
	}
}
*/
