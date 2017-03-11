package by.epam.course.basic.main;

public class MyElement<T>{
	private T element;
	private MyElement<T> previous;
	private MyElement<T> next;
	
	public MyElement(T element ) {
		
		this.element = element;
		previous = null;
		next = null;
		
	}
	
	public MyElement( ) {
		
		this.element = null;
		previous = null;
		next = null;
		
	}

	public T getElement() {
		return element;
	}

	public MyElement<T> getPrevious() {
		return previous;
	}

	public void setPrevious(MyElement<T> obj) {
		this.previous = obj;
	}

	public MyElement<T> getNext() {
		return next;
	}

	public void setNext(MyElement<T> next) {
		this.next = next;
	}
	
	
}
