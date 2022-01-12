package algorithm;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] list = {{0,0,0,0},{1,1,1,1},{2,4,8,6},{3,9,7,1},{4,6,4,6},{5,5,5,5},{6,6,6,6},{7,9,3,1},{8,4,2,6},{9,1,9,1}};
		int count = sc.nextInt();
		for(int i=0;i<count;i++) {
			int a =sc.nextInt();
			int b =sc.nextInt();
			
			if(b%4==0) {
				System.out.println(list[a%10][3]);
			}
			else{
				System.out.println(list[a%10][b%4-1]);
			}
		}
	}
}



