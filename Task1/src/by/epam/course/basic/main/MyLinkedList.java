package by.epam.course.basic.main;

public class MyLinkedList<T>{
	
	private MyElement<T> head;
	private MyElement<T> tail;
	private int size = 0;
	
	public MyLinkedList() {
	
		head = new MyElement<T>();
		tail = new MyElement<T>();
	}
	
		
	public int getSize() {
		return size;
	}

	private void setSize(int size) {
		this.size = size;
	}

	public void addFirst(T obj) {
		MyElement<T> temp = new MyElement<T>(obj);
		if (getSize() == 0){			
			temp.setNext(tail);
			temp.setPrevious(head);
			head.setNext(temp);
			head.setPrevious(null);
			tail.setPrevious(temp);
			tail.setNext(null);
			setSize(getSize()+1);
		} else {
			head.getNext().setPrevious(temp);		
			temp.setNext(head.getNext());			
			head.setNext(temp);	
			temp.setPrevious(head);	
			setSize(getSize()+1);
		}		
	}
	
	public void addLast(T obj) {
		MyElement<T> temp = new MyElement<T>(obj);
		if (getSize() == 0){			
			temp.setNext(tail);
			temp.setPrevious(head);
			head.setNext(temp);
			head.setPrevious(null);
			tail.setPrevious(temp);
			tail.setNext(null);
			setSize(getSize()+1);
		} else {
			tail.getPrevious().setNext(temp);		
			temp.setPrevious(tail.getPrevious());			
			tail.setPrevious(temp);	
			temp.setNext(tail);	
			setSize(getSize()+1);
		}		
	}
	
	public void addToSpecialPlace(T obj, int i) {
		MyElement<T> temp = new MyElement<T>(obj);
		
		if ((i <= this.getSize()) & (i > 0)) {
			MyElement<T> search = this.head;
			for (int j = 0; j < i; j++ ){
				search =  search.getNext();
			}
			temp.setPrevious(search.getPrevious());
			temp.setNext(search);
			search.getPrevious().setNext(temp);
			search.setPrevious(temp);
			setSize(getSize()+1);
			 
		} else {
			System.out.println("Wrong index");
		}
				
 	}
	
	public boolean delete(T obj){
		MyElement<T> temp = head;
		for (int i = 0; i < this.getSize(); i++){
			temp = temp.getNext();
			if (temp.getElement().equals(obj)){
				temp.getPrevious().setNext(temp.getNext());
				temp.getNext().setPrevious(temp.getPrevious());
				setSize(getSize()-1);
				
				return true;
			}
		}		
		return false;
	}
	
	public boolean find(T obj){
		MyElement<T> temp = head;
		for (int i = 0; i < this.getSize(); i++){
			temp = temp.getNext();
			if (temp.getElement().equals(obj)){
				
				return true;
			}
		}		
		return false;
	}
	
	public String toString(){
		String output = "";
		MyElement<T> first = this.head;
		
		while (first.getNext() != null) {
			first = (MyElement<T>) first.getNext();
			if (first.getElement() != null) {
				output = output + first.getElement() + " ";
			}
		} ;

		return output;
	}
	
}
