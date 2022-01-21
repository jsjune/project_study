package ch6;

class MyMath {
	long a, b;

	long add() {
		return a + b;
	}

	long substract() {
		return a - b;
	}

	long multifly() {
		return a * b;
	}

	double divide() {
		return a / b;
	}

	static long add(long a, long b) {
		return a + b;
	}

	static long substract(long a, long b) {
		return a - b;
	}

	static long multifly(long a, long b) {
		return a * b;
	}

	static double divide(double a, double b) {
		return a / b;
	}
}

public class MyMathTest {
	public static void main(String[] args) {
		System.out.println(MyMath.add(200L, 100L));
		System.out.println(MyMath.substract(200L, 100L));
		System.out.println(MyMath.multifly(200L, 100L));
		System.out.println(MyMath.divide(200, 100));

		MyMath mm = new MyMath();
		mm.a = 200L;
		mm.b = 100L;
		System.out.println(mm.add());
		System.out.println(mm.substract());
		System.out.println(mm.multifly());
		System.out.println(mm.divide());
	}
}