package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Log{
	static double baseLog(double x,double base) {
		return Math.log10(x)/Math.log10(base);
	}
}

public class Test4 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Log l = new Log();
		
		int N = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		
		int m = (int)Math.ceil(l.baseLog(N, 2));
		
		for(int i=0 ; i<=m ; i++) {
			if(N < Math.pow(2, i)*k) {
				System.out.println((int)Math.pow(2, i)*k-N);
			}
		}
	}
}
