
public class LinkedList {
	public class Node{
		private String value;
		public Node next;
		
		public Node() {
			value = "?";
			next = null;
		}
		
		public Node(String v) {
			value = v;
		}
		public Node(String v, Node n) {
			value = v;
			next = n;
		}
	}
	
	private Node head;
	private int size;
	
	public LinkedList() {
		head = null;
		size = 0;
	}
	public void add(String value) {
		if (size >= 9) {
            System.out.println("DRAW");
            return;
        }

        if (head == null) {
            head = new Node(value, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value, null);
        }
        size++; // Increment size counter
	}
	
	public void change(String value, int position) {
		Node current = head;
		int counter = 1;
		while(current.next != null && counter != position) {
			current = current.next;
			counter++;
		}
		if (current != null) {
	        current.value = value; // Update the value of the existing node
	    }
	}
	
	public void display() {
		Node current = head;
		int count = 0;
		
		while(current != null && count < 9) {
			for(int i = 0; i < 3 && current != null; i++) {
				System.out.print(current.value + " ");
				current = current.next;
				count++;
			}
			System.out.println();
		}
	}
}
