/**
 * Dizajnirajte i implementirajte stack koji osim standardnih metoda (push, pop, peek,
isEmpty...) ima I metodu public void getMin(). Metode push, pop i getMin() trebaju da rade u 
O(1) vremenu.
Hint
Moglo bi vam pomoci da promijenite Node klasu.
 */
import javax.xml.soap.Node;

public class StackInt {
	private Node head;

	// Constructor
	public StackInt() {
		head = null;
	}

	// Private class for Node
	private class Node {
		public int value;
		public Node next;
		public int currentMin;

		public Node(int value) {
			this.value = value;
			next = null;
		}
	}

	// function for adding a number in stack and findin a smalest number
	public void push(int value) {
		if (head == null) {
			head = new Node(value);
			head.currentMin = value; // because of min
			return;
		}
		Node newNode = new Node(value);
		if (head.currentMin < value) 
			newNode.currentMin = head.currentMin; // because of min
		 else 
			newNode.currentMin = value; // because of min
			
		 newNode.next = head;
		head  = newNode;

	}

	// taking a smalest nuber from push metode
	public int getMin() {
		return head.currentMin;
	}

	// function for removing a number from stack, LIFO method
	public int pup() {
		if (head == null)
			throw new IllegalArgumentException("Steac is empty");
		Node current = head;
		head = head.next;
		int value = current.value;
		current = null;
		return value;
	}

	public int peek() {
		if (head == null)
			throw new IllegalArgumentException("Steac is empty");
		return head.value;
	}

	// get size of stack
	public int getSize() {
		if (head == null)
			return 0;
		return getSize(head, 0);
	}

	// getSize recursion
	private int getSize(Node current, int counter) {
		if (current == null)
			return counter;
		return getSize(current.next, counter + 1);
	}

	// for caching is this value in stack
	public boolean contains(int value) {
		if (head.value == value)
			return true;
		return contains(head, value);
	}

	// recursion for contains methode
	public boolean contains(Node current, int value) {
		if (current == null)
			return false;
		if (current.value == value)
			return true;
		return contains(current.next, value);

	}

	// @Override
	// public String toString() {
	// Node current = head;
	// String str = "{";
	// for(int i = 0; i<getSize(); i++){
	// str += current.value;
	// head = head.next;
	// }
	//
	// return str;
	// }

}