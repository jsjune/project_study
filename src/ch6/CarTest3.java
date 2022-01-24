package ch6;

class Car3 {
	String color;
	String gearType;
	int door;

	Car3() {
		this("white", "wuto", 4);
	}

	Car3(Car3 c) {
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}

	Car3(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest3 {
	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1);
		/* 인스턴스 c2는 c1을 복사하여 생성된 것이므로 서로 같은 상태를 갖지만, 
		 * 서로 독집적으로 메모리공간에 존재하는 별도의 인스턴스이므로 c1의 값들이 변경되어도 
		 * c2는 영향을 받지 않는다
		 */
	
		System.out.printf("c1의 color=%s, gearType=%s, door=%d\n",c1.color,c1.gearType,c1.door);
		System.out.printf("c2의 color=%s, gearType=%s, door=%d\n",c2.color,c2.gearType,c2.door);
		
		c1.door=100;
		System.out.println("c1.door=100; 수행 후");
		System.out.printf("c1의 color=%s, gearType=%s, door=%d\n",c1.color,c1.gearType,c1.door);
		System.out.printf("c2의 color=%s, gearType=%s, door=%d",c2.color,c2.gearType,c2.door);
		
	}
}
