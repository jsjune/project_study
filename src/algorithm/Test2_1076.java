package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Test2_1076 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String,String> codesvalue = new HashMap<String,String>(); // 색의 값
		codesvalue.put("black","0");
		codesvalue.put("brown","1");
		codesvalue.put("red","2");
		codesvalue.put("orange","3");
		codesvalue.put("yellow","4");
		codesvalue.put("green","5");
		codesvalue.put("blue","6");
		codesvalue.put("violet","7");
		codesvalue.put("grey","8");
		codesvalue.put("white","9");
		
		HashMap<String,String> codesmulti = new HashMap<String,String>(); // 색의 곱
		codesmulti.put("black","1");
		codesmulti.put("brown","10");
		codesmulti.put("red","100");
		codesmulti.put("orange","1000");
		codesmulti.put("yellow","10000");
		codesmulti.put("green","100000");
		codesmulti.put("blue","1000000");
		codesmulti.put("violet","10000000");
		codesmulti.put("grey","100000000");
		codesmulti.put("white","1000000000");
		
		String str1 = br.readLine();
		int a = Integer.valueOf(codesvalue.get(str1))*10;
		String str2 = br.readLine();
		int b = Integer.valueOf(codesvalue.get(str2));
		String str3 = br.readLine();
		long c = Integer.valueOf(codesmulti.get(str3));
		long result = (a+b)*c;
		System.out.println(result);
		
		
	}
}
