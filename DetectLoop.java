
package algorithms.linkedlist;

public class DetectLoop {

	public static ListNode headNode;

	public boolean detectLoopInLinkedList() {
		ListNode slowNode = headNode, fastNode = headNode;
		while (slowNode != null && fastNode != null && fastNode.next != null) {
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
			if (slowNode == fastNode) {
				return true;
			}
		}
		return false;
	}

	public static void main(String args[]) {

		DetectLoop obj = new DetectLoop();
		headNode = new ListNode(10);
		headNode.next = new ListNode(20);
		headNode.next.next = new ListNode(30);
		headNode.next.next.next = new ListNode(40);
		headNode.next.next.next.next = new ListNode(50);
		headNode.next.next.next.next.next = new ListNode(60);
		headNode.next.next.next.next.next.next = headNode.next.next;

		System.out.print("\nIs Loop available in the given List?:");
		System.out.print(obj.detectLoopInLinkedList());

	}
}

/*class ListNode {
	public int data;
	public ListNode next;

	ListNode(int data) {
		this.data = data;
	}
}*/


