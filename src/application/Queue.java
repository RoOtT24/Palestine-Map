  package application ; 
	public class Queue <T extends Comparable<T>> { 
		 private Node<T> first; 
		 private Node<T> last; 
		 
		 public Node<T> getLast() {
			return last;
		}
		public boolean isEmpty(){ return (first==null) && (last==null); } 
		 public void clear(){ 
		 first = null; 
		 last = null; 
		 } 
		public T getFront(){
		 if(!isEmpty()) 
		 return first.getData(); 
		 return null; 
		}
		public T dequeue(){
		 T front = getFront(); 
		 if(!isEmpty()) 
		 first = first.getNext(); 
		 if(first==null) 
		 last = null; 
		 return front; 
		}
		public void enqueue(T data){ 
		 Node<T> newNode = new Node<T>(data); 
		 if(isEmpty()) 
		 first=newNode; 
		 else 
		 last.setNext(newNode); 
		 last = newNode; 
		}
		
		@Override
		public String toString() {
			String res = "first -> ";
			Node<T> curr = first;
			while (curr != null) {
				res += curr.getData().toString() + "-> ";
				curr = curr.getNext();
			}
			return res + "last\n";
		}

		}