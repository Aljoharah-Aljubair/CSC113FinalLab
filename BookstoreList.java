
public class BookstoreList {

	private Node head;

	public BookstoreList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	/*
	 * This method inserts the received data into the list’s correct sorted
	 * position. The list is sorted in ascending order based on the bookstore’s ID.
	 */
	public void insertInOrder(Bookstore data) {
		Node newNode = new Node (data);
		Node c = null;
		Node p = null;
		Node temp = null;
		
		if(isEmpty()) {
			head=newNode;
			
		}
		else if(head.getNext() == null) 
			if( ((head.getData()).getID())  > ( data.getID() ) ) {
				temp = head;
				head = newNode;
				newNode.setNext(temp);
				
			}
		
			else
			{
			c=head.getNext();
			p=head;
				while((p.getNext() != null) && ( c != null)) {
					
					if( (p.getData().getID()) > ( c.getData().getID() )  ) {
						temp = p;
						p = c;
						c.setNext(temp);
					}
					c=c.getNext();
					p=p.getNext();
				}
				
			}
		return;
	}

	public void print() {
		Node current = head;
		while (current != null) {
			System.out.println(
					"Bookstore [ID=" + current.getData().getID() + ", name=" + current.getData().getName() + "]");
			current = current.getNext();
		}
	}
}
