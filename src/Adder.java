
public class Adder {
	public boolean[] halfadder(boolean bitA, boolean bitB) {
		Gate g = new Gate();
		boolean sum = g.xor(bitA, bitB);
		boolean carry = g.and(bitA, bitB);
		boolean[] answer = {carry,sum};
		return answer;
	}
	public boolean[] fulladder(boolean bitA,boolean bitB,boolean bitC) {
		Gate g = new Gate();
		boolean sum = g.xor(g.xor(bitA, bitB),bitC);
		boolean Carry =  g.and(g.xor(bitA,bitB),bitC)||g.and(bitA, bitB);
		boolean[] answer = {Carry,sum};
		return answer;
	}
}


