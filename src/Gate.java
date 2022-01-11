
public class Gate {

	public boolean and(boolean paramA, boolean paramB) {
		return (paramA && paramB);
	}

	public boolean or(boolean paramA, boolean paramB) {
		return (paramA || paramB);
	}

	public boolean not(boolean paramA) {
		return !paramA;
	}

	public boolean nand(boolean paramA, boolean paramB) {
		return !(paramA && paramB);
	}

	public boolean nor(boolean paramA, boolean paramB) {
		return !(paramA || paramB);
	}

	public boolean xor(boolean paramA, boolean paramB) {
		return (!paramA && paramB) || (paramA && !paramB);
	}

	public boolean xnor(boolean paramA, boolean paramB) {
		return !(paramA && paramB) || (paramA && paramB);
	}

	public void show(boolean paramA, boolean paramB) {
		System.out.println("and: " + (paramA && paramB));
		System.out.println("or: " + (paramA || paramB));
		System.out.println("not: " + !paramA);
		System.out.println("nand: " + !(paramA && paramB));
		System.out.println("nor: " + !(paramA || paramB));
		System.out.println("xor: " + ((!paramA && paramB) || (paramA && !paramB)));
		System.out.println("xnor: " + (!(paramA && paramB) || (paramA && paramB)));
	}
}
