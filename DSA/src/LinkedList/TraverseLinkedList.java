package LinkedList;

public class TraverseLinkedList {
	public static void traverse(Node head) {
		Node cur = head;
		while(cur != null) {
			System.out.println(cur.data);
			cur = cur.next;
		}
	}
	public static void main(String args[]) {
		Node node1 = new Node(34);
		Node node2 = new Node(14);
		Node node3 = new Node(24);
		Node node4 = new Node(44);
		Node node5 = new Node(64);
		
		Node head = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = null;
		
		traverse(head);
		
		
	}

}
class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}