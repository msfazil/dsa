package dataStructures.llinkedList;

public class Main {

	public static void main(String[] args) {

	LinkedList ll = new LinkedList(23);
	ll.prepend(22);
	ll.print();
	ll.getLength();
	

	System.out.println(ll.get(22).value);
	}

}
