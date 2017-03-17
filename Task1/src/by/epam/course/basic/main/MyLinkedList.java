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
			temp.setNext(null);
			head.setNext(temp);
			tail.setNext(temp);
			setSize(getSize()+1);
		} else {
			temp.setNext(head.getNext());			
			head.setNext(temp);	
			setSize(getSize()+1);
		}		
	}
	
	public void addLast(T obj) {
		MyElement<T> temp = new MyElement<T>(obj);
		if (getSize() == 0){			
			temp.setNext(null);
			head.setNext(temp);
			tail.setNext(temp);
			setSize(getSize()+1);
		} else {
			temp.setNext(null);
			tail.getNext().setNext(temp);
			tail.setNext(temp);
			setSize(getSize()+1);
		}		
	}
	
	public void addToSpecialPlace(T obj, int i) {
		MyElement<T> temp = new MyElement<T>(obj);
		
		if ((i <= this.getSize()) & (i > 0)) {
			MyElement<T> search = this.head;
			for (int j = 0; j < i-1; j++ ){
				search =  search.getNext();
			}
			temp.setNext(search.getNext());
			search.setNext(temp);
			setSize(getSize()+1);
			 
		} else {
			System.out.println("Wrong index");
		}
				
 	}
	
	public boolean delete(T obj){
		MyElement<T> temp = head;
		MyElement<T> temp_prev = head;
		
		for (int i = 0; i < this.getSize(); i++){
			temp = temp.getNext();
			if (temp.getElement().equals(obj)){
				temp_prev.setNext(temp.getNext());
				setSize(getSize()-1);
				
				return true;
			}
			temp_prev = temp;
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
