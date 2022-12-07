
public class Node {
	private Bookstore data;
	private Node next;
	
	public  Node(Bookstore data) {
		this.data = data;
		this.next = null;
	}

	public Bookstore getData() {
		return data;
	}

	public void setData(Bookstore data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
