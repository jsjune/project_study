package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Test3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		BigInteger a = new BigInteger(st.nextToken()); // 큰 수
		BigInteger b = new BigInteger(st.nextToken());
		BigInteger c = a.add(b); // 큰 수 덧셈
		System.out.println(c);
	}
}

//        String[] inputs = br.readLine().split(" ");
//		  String A = new StringBuffer(num[0]).reverse().toString();
