package algorithm;

public class Test6 {
	public int reverse(int x) {
		StringBuffer sb = new StringBuffer();

		if (x < 0) {
			sb.append("-");
			x *= -1;
		}

		while (x > 0) {
			sb.append(x % 10);
			x /= 10;
		}
		
		try {
			return Integer.parseInt(String.valueOf(sb));
		} catch (NumberFormatException e) {
			return 0;
		}

	}
}
