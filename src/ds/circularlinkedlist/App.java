package ds.circularlinkedlist;

import ds.singlylinkedlist.SinglyLinkedList;

public class App {
	
	public static void main(String[] args) {
		CircularLinkedList myList = new CircularLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(50);
		myList.insertFirst(70);
		myList.insertFirst(99);
		myList.insertFirst(88);
		myList.insertLast(8888);

		myList.displayList();
	}

}
