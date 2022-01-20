package polygon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Point {
	
	public void xyLength(int Ax, int Ay, int Bx, int By) {
		double length = Math.sqrt(Math.pow(Ax-Bx,2)+Math.pow(Ay-By,2));
		System.out.println(length);
	}
	
}

public class LineTest {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, "(,)-(,)");
		
		int Ax = Integer.parseInt(st.nextToken());
		int Ay = Integer.parseInt(st.nextToken());
		int Bx = Integer.parseInt(st.nextToken());
		int By = Integer.parseInt(st.nextToken());
		
		Point p1 = new Point();
		p1.xyLength(Ax, Ay, Bx, By);
	}
}
