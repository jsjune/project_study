import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
//		Gate g = new Gate();
//		g.and(true, true);
//		g.show(true, true);
//
//		Adder add = new Adder();
//		add.halfadder(true, true);
//		System.out.println(Arrays.toString(add.halfadder(true, true)));
//
//		add.fulladder(true, true, true);
//		System.out.println(Arrays.toString(add.fulladder(true, true, true)));

		ByteAdder ba = new ByteAdder();
		boolean[] byteA = { true, true, false, true, true, false, true, false };
		boolean[] byteB = { true, false, true, true, false, false, true, true };
		ba.byteadder(byteA, byteB);
		System.out.println(Arrays.toString(ba.byteadder(byteA, byteB)));
	}
}