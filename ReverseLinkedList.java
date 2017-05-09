
package algorithms.linkedlist;

public class ReverseLinkedList{
	
	
ListNode reverseLinkedList(ListNode headNode) {
        ListNode prevNode= null;
        ListNode currentNode = headNode;
        ListNode nextNode = null;
        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        headNode = prevNode;
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

		ListNode headNode;
		ReverseLinkedList obj = new ReverseLinkedList();
		headNode = new ListNode(10);
		headNode.next = new ListNode(20);
		headNode.next.next = new ListNode(30);
		headNode.next.next.next = new ListNode(40);
		headNode.next.next.next.next = new ListNode(50);
		headNode.next.next.next.next.next = new ListNode(60);
		
		System.out.println("\nThe Given LinkedList: ");
		obj.printLinkedList(headNode);
		headNode=obj.reverseLinkedList(headNode);
		System.out.println("\nThe Reversed LinkedList: ");
		obj.printLinkedList(headNode);
	}
}
class ListNode {
	public int data;
	public ListNode next;

	ListNode(int data) {
		this.data = data;
	}
}

