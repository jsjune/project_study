package algorithm;
//leetcode
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6_ReverseInteger {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer(String.valueOf(Math.abs(x)));
		StringBuffer sb1 = new StringBuffer(sb.reverse());
		
		if(x>0) {
			if(x%10==0) {
				System.out.println(Integer.valueOf(sb1.substring(1)));
			}
			else {
				System.out.println(sb1);
			}
		}
		else {
			System.out.println(Integer.valueOf(sb1.substring(0))*(-1));
		}
	}
}
