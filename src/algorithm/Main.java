package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		String str1 = br.readLine();
		String str2 = br.readLine();
		
			char ch = str2.charAt(0);
			int test = ch - 48;
			System.out.println(test*24);
	}
}
