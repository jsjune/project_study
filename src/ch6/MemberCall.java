package ch6;

public class MemberCall {
	int iv =10; // 인스턴스 변수
	static int cv =20; // 클래스 변수
	
	int iv2 =cv; // 인스턴스 변수는 클래스 변수를 사용할 수 있다.
//	static int cv2 = iv; // 에러!! 클래스변수는 인스턴스 변수를 사용불가!
	static int cv2 = new MemberCall().iv; // 이처럼 객체를 생성해야 사용가능
	
	static void staticMethod1() { // 클래스 메소드
		System.out.println(cv); // 클래스 메소드에서 클래스 변수 사용가능
//		System.out.println(iv); // 에러!! 클래스 메소드에서 인스턴스 변수 사용불가!
		MemberCall c = new MemberCall();
		System.out.println(c.iv); // 객체를 생성한 후에야 인스턴스변수의 참조가능
	}
	
	void instanceMethod1() { // 인스턴스 메소드
		// 인스턴스 메소드에서는 인스턴스변수, 클래스변수 사용가능
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); // 에러!! 클래스 메소드에서 인스턴스 메소드를 호출불가!
		MemberCall c = new MemberCall();
		c.instanceMethod1(); // 인스턴스를 생성한 후에야 호출가능
	}
	
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}
}
