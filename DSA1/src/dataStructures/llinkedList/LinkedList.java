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
		System.out.println("Lenght " + length);
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

}
