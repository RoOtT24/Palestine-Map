package application;

public class LinkedList<T extends Comparable<T>> {

	private Node<T> head;


	public int length() {
		int length = 0;
		Node<T> curr = head;
		while (curr != null) {
			length++;
			curr = curr.getNext();
		}
		return length;
	}

	public Node<T> getHead() {
		return head;
	}

	@Override
	public String toString() {
		String res = "	From";
		Node<T> curr = head;
		while (curr != null) {
			res +=  "	->" + curr.getData().toString()+"\n" ;
			curr = curr.getNext();
			
		}
		return res;
	}

	public Node<T> deleteAtStart() {
		Node<T> toDel = head;
		head = head.getNext();
		return toDel;
	}

	public Node<T> find(T data) {
		Node<T> curr = head;
		while (curr != null) {
			if (data instanceof City) {
				if (((City) curr.getData()).getName().equalsIgnoreCase(((City) data).getName())) { // if //
																									// (curr.getData().equals(data))

					return curr;
				}
			}

			else if (data instanceof Dest
					&& ((Dest) curr.getData()).getName().equalsIgnoreCase(((Dest) data).getName())) // if
																									// (curr.getData().equals(data))
				return curr;

			else if (curr.getData() == data) // if (curr.getData().equals(data))
				return curr;

			curr = curr.getNext();
		}
		return null;
	}

	public void insert(T data) {
		Node<T> p = head;

		Node<T> New = new Node<T>(data);
		New.setNext(p);
		head = New;
	}

	public Node<T> delete(T data) {
		Node<T> current = head;
		Node<T> temp = null;
		Node<T> prev = current;
		
		
		 // City deletion
		if (data instanceof City) {
			
			while (current != null) {
				if (((City) current.getData()).getName().equals(((City) data).getName()) && current != head ) {//System.out.println(((City)data).toString());
					temp = current;
					prev.setNext(current.getNext());
					break;
				}
				else if(current == head && ((City) current.getData()).getName().equals(((City) data).getName())) {
					temp = current ;
					head = head.getNext() ;
				}
				
				prev = current ;
				current = current.getNext();
			}
			return temp;
		} 
		
		
		// Dest deletion
		else if (data instanceof Dest) {
			while (current != null && current.getNext() != null) {
				if (((Dest) current.getNext().getData()).getName().equals(((Dest) data).getName())) {
					temp = current.getNext();
					current.setNext(current.getNext().getNext());
					break;
				}
				prev = current ;
				current = current.getNext();
			}
			
			return temp;
		} 
			else {

			while (current != null && current.getNext() != null) {
				if (current.getNext().getData().equals(data)) {

					temp = current.getNext();
					current.setNext(current.getNext().getNext());
					break;
				}
				prev = current ;
				current = current.getNext();
			}
			
			return temp;
		} 
	
	}

	public void insertion(T data) {
		Node<T> newNode = new Node<T>(data);
		Node<T> prev = null, curr = head;
		for (prev = null, curr = head; (curr != null)
				&& (newNode.getData().compareTo(curr.getData()) > 0); prev = curr, curr = curr.getNext())
			; // end for
		if (curr == null && prev != null) {
			newNode.setNext(curr);
			prev.setNext(newNode);
		} else if (curr == head && prev == null) {
			newNode.setNext(head);
			head = newNode;

		} else {
			newNode.setNext(head);
			head = newNode;

		}

	}
		public Node<T> findPrevious(T data) {
		Node<T> curr = head;
		while (curr != null && curr.getNext() != null) {
			if (curr.getNext().getData() == data) // if (curr.getNext().getData().equals(data))
				return curr;
			curr = curr.getNext();
		}
		return null;
	}
	public String tostring() {
		Node<T> p = head ;
		String result = "" ;
		while(p != null) {
			result += "\n -> " ;
			result += ((City)p.getData()).tostring() ;
			p = p.getNext() ;
		}
		return result ;
	}
	public String greedy() {
		
		return "From " +this.greedy(head) ;
	}
	private String greedy(Node node) {
		if (node == null)
			return "" ;
		else
		return greedy(node.getNext())+"\n-> "+((City)node.getData()).toString() ;
	}
}
