package dataStructure;

public class MainLinked {
	public static void main(String[] args) {
//		LinkedList numbers = new LinkedList();
//		
//		numbers.addFirst(30);
//		numbers.addFirst(20);
//		numbers.addFirst(10);
//		
//		numbers.addLast(10);
//		numbers.addLast(20);
//		numbers.addLast(30);
//		numbers.add(1, 15);
//		System.out.println(numbers.toSring());
//
//		numbers.removeFirst(); // 10
//		numbers.remove(2); // 30
//		numbers.removeLast(); // 30
//		System.out.println(numbers.toSring());
//		
//		System.out.println("\n"+numbers.size());
//		System.out.println(numbers.get(1));
//		System.out.println(numbers.indexOf(20)+"\n");
//		
//		for(int i = 0; i<numbers.size();i++) {
//			System.out.println(numbers.get(i));
//		}
//		
//		System.out.println("");
//		
//		LinkedList.ListIterator it = numbers.listIterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
		
//		numbers.addLast(10);
//		numbers.addLast(30);
//		LinkedList.ListIterator i = numbers.listIterator();
//		while(i.hasNext()) {
//			if((int)i.next()==10)
//				i.add(20);
//		}
//		
//		System.out.println(numbers.toSring());
		
		LinkedList numbers = new LinkedList();
		numbers.addLast(10);
		numbers.addLast(15);
		numbers.addLast(20);
		numbers.addLast(30);
		LinkedList.ListIterator li = numbers.listIterator();
		while(li.hasNext()){
		    if((int)li.next() == 15)
		        li.remove();
		}
		System.out.println(numbers);
	}
}
