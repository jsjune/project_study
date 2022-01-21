package ch6;

public class TestClass {
	void instanceMethod() { // 인스턴스메서드
	}

	static void staticMethod() { // static메서드
	}

	void instanceMethod2() { // 인스턴스메서드
		instanceMethod(); // 다른 인스턴스메서드를 호출한다.
		staticMethod(); // static에서드를 호출한다.
	}

	static void staticMEthod2() { // static메서드
//		instanceMethod(); // 에러!!! 인스턴스 메서드를 호출할 수 없다.
		staticMethod(); // static메서드는 호출 할 수 있다.
	}
}
