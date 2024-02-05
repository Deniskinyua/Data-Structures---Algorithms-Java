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

	//Inserting the last element in the list
	public void insertAtLastIndex(int value){
		Node lastValue = new Node(value);

		if(tail == null){
			lastValue = tail;
		}
		/**
		Instead, you can also call insertElement(); like:
		if(tail == null){
			insertElement(value){
			return;
		}
		}
		*/
		tail.next = lastValue;
		lastValue = tail;

		size++;
	}
	//Insert element at a particular index;
	public void insertAtIndex(int value, int index){
		Node node = new Node(value);
		
		if(index == 0){
			insertElement(value);
			return;
		}		

		if(index == size){
			insertAtLastIndex(value);
			return;
		}

		Node temp = head;
		for(int i = 1; i < index; i++){
			temp = temp.next;
		}
		Node current = temp.next;
		temp.next = node;
		node.next = current;
		size++;
		
	}

	//Deleting an item an an index
	public void deleteItem(int index){
		Node temp = head;
		for(int i = 1; i < index; i++){
			temp = temp.next;
		}
		Node current = temp.next;
		temp.next = current.next;
		current.next = null;
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

		//Insert at Last Index
		newClass.insertAtLastIndex(8);

		newClass.displayElements();

		//Insert at Index
		newClass.insertAtIndex(5, 4);
		newClass.displayElements();

		//Delete item at index
		newClass.deleteItem(3);
		newClass.displayElements();
	}
}
