// Singly Linked Lists
public class SinglyLinkedLists {

	private Node head;
	private Node tail;

	private int size = 0;


	//Inserting the First Element:
	public void insertElement(int value){
		Node newNode = new Node(value);
		newNode.next =head;
		head = newNode;

		if(tail == null){
			tail = head;
		}
		size += size;
	}
	
	 class Node{
		private int value;
		private Node next;

		public Node(int value){
			this.value = value;
		}

		public Node(int value, Node next){
			this.value = value;
			this.next = next;
		}
	}

	//Display the elements in the LinkedList:
	public void displayElements(){
		Node temp = head;
		while(temp != null){
			System.out.print(temp.value + "-->");
		temp = temp.next;
		}
		System.out.println("END");
	}
	
	public static void main(String[]args){
		SinglyLinkedLists newClass = new SinglyLinkedLists();
		newClass.insertElement(7);
		newClass.insertElement(2);
		newClass.insertElement(9);
		newClass.insertElement(4);
		newClass.insertElement(1);

		newClass.displayElements();
	}
}
