package dataStructures.llinkedList;

public class LinkedList {

	private Node head;
	private Node tail;
	private long length;

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;

		}
	}

	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;

	}

	public void print() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void getHead() {
		System.out.println("Head " + head);
	}

	public void getTail() {
		System.out.println("Tail " + tail);
	}

	public void getLength() {
		System.out.println("Length " + length);
	}

	public void append(int value) {
		Node newNode = new Node(value);
		if (length == 0) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		length++;

	}

	public String removeLast() {
		if(head==null) return null;
		
		Node temp= head;
		Node pre=temp;
		while(temp.next!=null) {
		   pre = temp;
		   temp= temp.next;
		}

		tail=pre;
		tail.next=null;
		length--;
		
		if(length==0) {
			head= null;
			tail= null;
		}
		
		return Integer.toString(temp.value);
		
	}
	
	public void prepend(int value) {
		if(length==0) {
			append(value);
			return;
		}
		
		Node newNode = new Node(value);
		newNode.next=head;
		head= newNode;
		tail= newNode.next;
		length++;
	}
}
