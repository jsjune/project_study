package ch6;

public class TestClass2 {
	int iv; // 인스턴스 변수
	static int cv; // 클래스 변수

	void instanceMethod() { // 인스턴스 메서드
		System.out.println(iv); // 인스턴스 변수 사용가능
		System.out.println(cv); // 클래스 변수 사용가능
	}

	static void staticMethod() { // static 메서드
//		System.out.println(iv); // 에러!!! 인스턴스 변수 사용불가능!
		System.out.println(cv); // 클래스 변수 사용가능
	}
}
