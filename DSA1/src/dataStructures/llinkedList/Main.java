package dataStructures.llinkedList;

public class Main {

	public static void main(String[] args) {

	LinkedList ll = new LinkedList(23);
	ll.prepend(22);
	ll.append(11);
	ll.append(10);
	System.out.print("before reverse: ");
	ll.print();
	ll.getLength();
	ll.reverse();
	System.out.print("after reverse: ");
	ll.print();
	}

}
