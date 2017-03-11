package by.epam.course.basic.main;

/**
 * @author Kiryl_Miatlitski
 *
 * date: 5 March 2017 - 11 March 2017
 * 
 * 
 * Task Реализуйте самостоятельно динамическую структуру Односвязный список. Реализуйте методы добавления 
 * (в голову, хвост и произвольное место списка), удаления и поиска объекта в списке. Используйте параметризацию при описании класса. 
 * (Условие не означает необходимости повторить все возможности класса LinkedList. Возможности Java Collection Framework не использовать). 
 */
public class Task1 {

	public static void main(String[] args) {
		
		MyLinkedList<Integer> list= new MyLinkedList<Integer>();
	
		// add in the end
		list.addLast(10);
		System.out.println("Size: " + list.getSize() + "   List: "+ list);
		list.addLast(13);
		System.out.println("Size: " + list.getSize() + "   List: "+ list);
		list.addLast(15);
		System.out.println("Size: " + list.getSize() + "   List: "+ list);
		
		// add in the beginning 
		list.addFirst(1);
		System.out.println("Size: " + list.getSize() + "   List: "+ list);
		list.addFirst(2);
		System.out.println("Size: " + list.getSize() + "   List: "+ list);
		list.addFirst(3);
		System.out.println("Size: " + list.getSize() + "   List: "+ list);
		
		// add to i place
		list.addToSpecialPlace(40, 3);
		System.out.println("Size: " + list.getSize() + "   List: "+ list);
		list.addToSpecialPlace(45, 1);
		System.out.println("Size: " + list.getSize() + "   List: "+ list);
		list.addToSpecialPlace(50, 8);
		System.out.println("Size: " + list.getSize() + "   List: "+ list);
		list.addFirst(100);
		System.out.println("Size: " + list.getSize() + "   List: "+ list);
		list.addLast(100);
		System.out.println("Size: " + list.getSize() + "   List: "+ list);
		
		// delete
		System.out.println("Delete 10 : " + list.delete(10));
		System.out.println("Size: " + list.getSize() + "   List: "+ list);
		System.out.println("Delete 100 : " + list.delete(100));
		System.out.println("Size: " + list.getSize() + "   List: "+ list);
		System.out.println("Delete 100 : " + list.delete(100));
		System.out.println("Size: " + list.getSize() + "   List: "+ list);
		System.out.println("Delete 100 : " + list.delete(100));
		System.out.println("Size: " + list.getSize() + "   List: "+ list);
		
		// find
		System.out.println("Find 100 in the list : " + list.find(100));
		System.out.println("Size: " + list.getSize() + "   List: "+ list);
		System.out.println("Find 40 in the list : " + list.find(40));
		System.out.println("Size: " + list.getSize() + "   List: "+ list);
		System.out.println("Find 15 in the list : " + list.find(15));
		System.out.println("Size: " + list.getSize() + "   List: "+ list);
		
	}

}
