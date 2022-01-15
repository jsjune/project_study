package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test1_1009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] list = {{0,0,0,0},{1,1,1,1},{2,4,8,6},{3,9,7,1},{4,6,4,6},{5,5,5,5},{6,6,6,6},{7,9,3,1},{8,4,2,6},{9,1,9,1}};
		int count = Integer.parseInt(br.readLine());
		for(int i=0;i<count;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(b%4==0) {
				System.out.println(list[a%10][3]);
			}
			else{
				System.out.println(list[a%10][b%4-1]);
			}
		}
	}
}



