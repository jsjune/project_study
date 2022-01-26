package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class ProgrammersMockExan {
	public static void main(String[] args) {
		int[] answer = { 1, 2, 3, 5, 4, 3, 2, 4, 1, 2, 5, 3, 1, 5, 4, 3, 2, 1, 1, 5, 4, 2, 3, 4 };
		int[] person = { 1, 2, 3, 4, 5 };
		int[] person2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] person3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int[] score = { 0, 0, 0 };

		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == person[i % person.length])
				score[0]++;
			if (answer[i] == person2[i % person2.length])
				score[1]++;
			if (answer[i] == person3[i % person3.length])
				score[2]++;
		}

		int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

		ArrayList<Integer> list = new ArrayList<>();
		if(maxScore ==score[0])list.add(1);
		if(maxScore ==score[1])list.add(2);
		if(maxScore ==score[2])list.add(3);
		
		answer = new int[list.size()];
		
		for(int i=0;i<answer.length;i++) {
			answer[i]=list.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
	}
}
