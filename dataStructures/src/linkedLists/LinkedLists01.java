package linkedLists;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.List;
import java.util.Arrays;
public class LinkedLists01 {

	public LinkedLists01(){

	}

	public int rando(int min, int max){
		Random random =  new Random();
		int rand = random.nextInt(max)+min;
		return rand;
	}


	// A class to represent a node of a singly linked list
	class SNode {
		int data; // data field
		SNode next; // pointer to the next node

			// constructor to create a new node
			public SNode(int data) {
				this.data = data;
				this.next = null;
			}
		}

	// A class to represent a singly linked list
	class SinglyLinkedList {
		SNode head; // pointer to the head node

		// constructor to create an empty list
		public SinglyLinkedList() {
			this.head = null;
		}

		// method to insert a new node at the beginning of the list
		public void insertAtHead(int data) {
			SNode newNode = new SNode(data); // create a new node
			newNode.next = head; // link the new node to the head
			head = newNode; // make the new node as the head
		}

		// method to insert a new node at the end of the list
		public void insertAtTail(int data) {
			SNode newNode = new SNode(data); // create a new node
			if (head == null) { // if the list is empty
			head = newNode; // make the new node as the head
			return;
		}

		SNode current = head; // start from the head
			while (current.next != null) { // traverse until the end of the list
			current = current.next;
			}
			current.next = newNode; // link the new node to the last node
		}

		// method to delete the first node of the list
		public void deleteAtHead() {
			if (head == null) { // if the list is empty
				return;
			}
			head = head.next; // make the head point to the next node
		}

		// method to delete the last node of the list
		public void deleteAtTail() {
			if (head == null || head.next == null) { // if the list is empty or has only one node
			head = null; // make the head null
				return;
			}

			SNode current = head; // start from the head
				while (current.next.next != null) { // traverse until the second last node of the list
					current = current.next;
				}
			current.next = null; // make the second last node point to null
		}

			// method to print all the nodes of the list
		public void printList() {
			SNode current = head; // start from the head
			while (current != null) { // traverse until the end of the list
				System.out.print(current.data + " -> "); // print the data of the current node
				current = current.next; // move to the next node
			}
				System.out.println("null"); // print null at the end
			}
	}

	// A class to represent a node of a doubly linked list
	class DNode {
		int data; // data field
		DNode prev; // pointer to the previous node
		DNode next; // pointer to the next node

		// constructor to create a new node
		public DNode(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}

	// A class to represent a doubly linked list
	class DoublyLinkedList {
		DNode head; // pointer to the head node
		DNode tail; // pointer to the tail node

		// constructor to create an empty list
		public DoublyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		// method to insert a new node at the beginning of the list
		public void insertAtHead(int data) {
			DNode newNode = new DNode(data); // create a new node
			if (head == null) { // if the list is empty
				head = newNode; // make the new node as the head
				tail = newNode; // make the new node as the tail
				return;
			}
			newNode.next = head; // link the new node to the head
			head.prev = newNode; // link the head to the new node
			head = newNode; // make the new node as the head
		}

		// method to insert a new node at the end of the list
		public void insertAtTail(int data) {
			DNode newNode = new DNode(data); // create a new node
			if (tail == null) { // if the list is empty
				head = newNode; // make the new node as the head
				tail = newNode; // make the new node as the tail
				return;
			}
			newNode.prev = tail; // link the new node to the tail
			tail.next = newNode; // link the tail to the new node
			tail = newNode; // make the new node as the tail
		}

		// method to delete the first node of the list
		public void deleteAtHead() {
			if (head == null) { // if the list is empty
				return;
			}
			if (head == tail) { // if the list has only one node
				head = null; // make the head null
				tail = null; // make the tail null
				return;
			}
			head = head.next; // make the head point to the next node
			head.prev = null; // make the previous pointer of the head null
		}

		// method to delete the last node of the list
		public void deleteAtTail() {
			if (tail == null) { // if the list is empty
				return;
			}
			if (head == tail) { // if the list has only one node
				head = null; // make the head null
				tail = null; // make the tail null
				return;
			}
			tail = tail.prev; // make the tail point to the previous node
			tail.next = null; // make the next pointer of the tail null
		}

		// method to print all the nodes of the list from head to tail
		public void printListForward() {
			DNode current = head; // start from the head
			while (current != null) { // traverse until the end of the list
				System.out.print(current.data + " -> "); // print the data of the current node
				current = current.next; // move to the next node
			}
			System.out.println("null"); // print null at the end
		}

		// method to print all the nodes of the list from tail to head
		public void printListBackward() {
			DNode current = tail; // start from the tail
			while (current != null) { // traverse until the beginning of the list
				System.out.print(current.data + " -> "); // print the data of the current node
				current = current.prev; // move to the previous node
			}
			System.out.println("null"); // print null at the end
		}
	}
	public static void main(String[] args) {

		/**
		 * LinkedList = stores Nodes in 2 parts (data+address)
		 *
		 * Nodes are non-conservative memory locations
		 * Elements are linked to using pointers
		 *
		 * Singly Linked List
		 *
		 * Node Node Node
		 * [data|address] -> [data|address] -> [data|address]
		 *
		 *
		 * Doubly Linked List
		 *
		 * Node Node Node
		 * [address|data|address] <-> [address|data|address] <-> [address|data|address]
		 *
		 * advantages?
		 * 1.) Dynamic Data Structure (allowcates needed memory while running)
		 * 2.) Insertion and Deletion of nodes is easy. 0(1)
		 * 3.) No/Low memory waste
		 *
		 * disadvantages?
		 * 1.) Greater memory usage (additional pointers)
		 * 2.) No random access of elements (no indexes [i])
		 * 3.) Accessing/Searching elements is more time consuming. O(n)
		 *
		 * uses?
		 * 1.) implement Stacks/Queries
		 * 2.) GPS navigation
		 * 3.) music playlists
		 */

		LinkedLists01 random = new LinkedLists01();
		List<String> uppercaseList = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"));
		List<String> lowercaseList = new ArrayList<String>(Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));
		LinkedList<String> list = new LinkedList<>();

		int total= uppercaseList.size()+lowercaseList.size();
		for(int i=0; i <total ;i++){
			if(uppercaseList.isEmpty() || i % 2 == 0){
				list.offer(lowercaseList.get(0));
				lowercaseList.remove(0);
			} else {
				list.offer(uppercaseList.get(0));
				uppercaseList.remove(0);
			}
			for(int j=0; j < random.rando(1,999); j++){
				int count = list.size()/2;
				String temp = list.get(count);
				list.remove(count);
				if(random.rando(1,999) % 2 == 0){
					list.offer(temp);
				} else {
					list.push(temp);
				}
			}
		}

		while(!list.isEmpty()){
			if(list.size() % 2 == 0){
				System.out.print(list.pop()+"\n");
			} else {
				System.out.print(list.poll()+"\n");
			}
		}
	}
}
