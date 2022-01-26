package algorithm;

public class ProgrammersMakeStrangeWord {
	public static void main(String[] args) {
		String answer = "";
		String str = "try hello world";
		String[] word = str.split("");
		int cnt=0;
		
		for(int i=0;i<word.length;i++) {
			if(word[i].equals(" ")) {
				cnt=0;
			}
			else if(cnt%2==0) {
				word[i]=word[i].toUpperCase();
				cnt++;
			}
			else if(cnt%2!=0) {
				word[i]=word[i].toLowerCase();
				cnt++;
			}
			answer+=word[i];
		}
		
		System.out.println(answer);
	}
}
