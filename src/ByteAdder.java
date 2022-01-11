
public class ByteAdder {
	public boolean[] byteadder(boolean[] byteA, boolean[] byteB) {
		Gate g = new Gate();
		boolean[] result = new boolean[9];
			
		for(int i = 0; i<result.length-1;i++) {
			boolean byteC = g.and(byteA[i], byteB[i]);
			boolean sum = g.xor(byteA[i], byteB[i]);
			if(i==0) {
				result[0]=sum;
			}
			else if(byteC==true) {
				result[i+1]=g.xor(g.xor(byteA[i+1], byteB[i+1]),byteC);
			}
			else {
				result[i]=sum;
			}
		}
		return result;
	}
}
