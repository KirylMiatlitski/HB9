package by.epam.course.basic.main;

public class MyElement<T>{
	private T element;
	
	private MyElement<T> next;
	
	public MyElement(T element ) {
		
		this.element = element;
		next = null;
		
	}
	
	public MyElement( ) {
		
		this.element = null;
		next = null;
		
	}

	public T getElement() {
		return element;
	}



	public MyElement<T> getNext() {
		return next;
	}

	public void setNext(MyElement<T> next) {
		this.next = next;
	}
	
	
}
