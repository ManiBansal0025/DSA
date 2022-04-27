package Trees;


public class BinaryTree {
	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		Node(int d){
			data =  d;
			left = null;
			right = null;
		}
	}
	public void createBinaryTree() {
		Node first = new Node(4);
		Node second = new Node(3);
		Node third = new Node(7);
		Node fourth = new Node(-1);
		Node fifth = new Node(10);
		Node sixth = new Node(5);
		
		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		third.right = fifth;
		third.left = sixth;
		
	}
	public static void main(String args[]) {
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
		
		
	}

}
