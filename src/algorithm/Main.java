package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		for(int i=2 ;i<3&&i>=0;i--) {
			char ch = str2.charAt(i);
			int test = ch - 48;
			System.out.println(Integer.valueOf(str1)*test);
		}
		System.out.println(Integer.valueOf(str1)*Integer.valueOf(str2));
	}
}
