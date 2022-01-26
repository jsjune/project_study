package algorithm;

import java.util.Arrays;

public class ProgrammersKth {
	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int[commands.length];
		
		for(int i=0;i<commands.length;i++) {
			int[] temp = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
			Arrays.sort(temp);
			answer[i]=temp[commands[i][2]-1];
		}
		System.out.println(Arrays.toString(answer));
	}
}


//import java.util.Arrays;
//
//public class ProgrammersKth {
//	public static void main(String[] args) {
//		int[] answer = new int[3];
//		int[] array = {1,5,2,6,3,7,4};
//		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//		
//		int[] arr1 = Arrays.copyOfRange(array,commands[0][0]-1,commands[0][1]);
//		int[] arr2 = Arrays.copyOfRange(array,commands[1][0]-1,commands[1][1]);
//		int[] arr3 = Arrays.copyOfRange(array,commands[2][0]-1,commands[2][1]);
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);
//		Arrays.sort(arr3);
//		answer[0]=arr1[commands[0][2]-1];
//		answer[1]=arr2[commands[1][2]-1];
//		answer[2]=arr3[commands[2][2]-1];
//		System.out.println(Arrays.toString(answer));
//	}
//}
