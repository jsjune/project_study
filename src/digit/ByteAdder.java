package digit;

public class ByteAdder {
	public boolean[] byteadder(boolean[] byteA, boolean[] byteB) {
		Gate g = new Gate();
		boolean[] result = new boolean[9];
		
		boolean[] carry = new boolean[9];
		carry[0] = false;
		for(int i=0;i<carry.length-1;i++) {
			carry[i+1] = g.and(byteA[i], byteB[i]);
		}
		
		boolean[] sum = new boolean[9];
		sum[0] = false;
		for(int i=0;i<sum.length-1;i++) {
			sum[i+1] = g.xor(byteA[i], byteB[i]);
		}
		
		boolean[] abcarry = new boolean[9];
		for(int i=0; i<abcarry.length; i++) {
			abcarry[i]=g.xor(sum[i], carry[i]);
		}
		
		boolean[] absum = new boolean[9];
		absum[8] = false;
		for(int i=0;i<absum.length-1;i++) {
			absum[i]=g.xor(byteA[i], byteB[i]);
		}
		
		for(int i=1;i<result.length;i++) {
			result[i]=g.xor(absum[i],abcarry[i]);
		}
		return result;
	}
}
