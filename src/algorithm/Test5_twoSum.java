package algorithm;
//leetcode
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5_twoSum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String[] nums = str.split(",");
		int target = Integer.valueOf(br.readLine());

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i < j) {
					if (Integer.valueOf(nums[i]) + Integer.valueOf(nums[j]) == target) {
						System.out.println("[" + i + "," + j + "]");
					}
				}
			}
		}
	}
}
