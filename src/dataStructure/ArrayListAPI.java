package dataStructure;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAPI {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<>();
		// <> 제너릭 : 사용하고자 하는 ArrayList가 내부적으로 엘리먼트들이 숫자라는 것을 미리 지정
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println("add(값)");
		System.out.println(numbers);
		
		numbers.add(1,50);
		System.out.println("\nadd(인덱스, 값)\nadd(1,50)");
		System.out.println(numbers);
		
		numbers.remove(2);
		System.out.println("\nremove(인덱스)\nremove(2)");
		System.out.println(numbers);

		System.out.println("\nget(인덱스)\nget(2)");
		System.out.println(numbers.get(2));
		
		System.out.println("\nsize()");
		System.out.println(numbers.size());
		
		System.out.println("\nindexOf(값)\nindexOf(30)");
		System.out.println(numbers.indexOf(30));
		
		Iterator it = numbers.iterator();
		System.out.println("\niterator");
		while(it.hasNext()) {
			int value = (int) it.next();
			if (value==30) {
				it.remove();
			}
			System.out.println(value);
		}
		System.out.println(numbers);
		
		System.out.println("\nfor each");
		for(int value : numbers) {
			System.out.println(value);
		}
		System.out.println("\nfor");
		for (int i=0;i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
	}
}
