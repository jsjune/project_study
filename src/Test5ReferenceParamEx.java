// 참조형 매개변수 : 변수의 값을 읽고 변경할 수 있다.
public class Test5ReferenceParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);

	}

	static void change(Data d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}
