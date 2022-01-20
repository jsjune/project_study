package polygon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Triangle {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, "(,)-(,)-(,)");

		int Ax = Integer.parseInt(st.nextToken());
		int Ay = Integer.parseInt(st.nextToken());
		int Bx = Integer.parseInt(st.nextToken());
		int By = Integer.parseInt(st.nextToken());
		int Cx = Integer.parseInt(st.nextToken());
		int Cy = Integer.parseInt(st.nextToken());

		double abLength = Math.sqrt(Math.pow(Ax - Bx, 2) + Math.pow(Ay - By, 2));
		double acLength = Math.sqrt(Math.pow(Ax - Cx, 2) + Math.pow(Ay - Cy, 2));
		double bcLength = Math.sqrt(Math.pow(Bx - Cx, 2) + Math.pow(By - Cy, 2));
		double cosA = (Math.pow(abLength,2)+Math.pow(acLength,2)-Math.pow(bcLength,2))/(2*abLength*acLength);
		double sinA = Math.sqrt(1-Math.pow(cosA, 2));
		double triangleDim = abLength*acLength*sinA/2;
		System.out.println(Math.round(triangleDim));
		
	}
}