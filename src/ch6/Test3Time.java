package ch6;

public class Test3Time {
	public static void main(String args[]) {
		Time t = new Time();
		t.setHour(2);
		t.setMinute(30);
		t.setSecond(48);
		int hour = t.getHour();
		int minute = t.getMinute();
		float second = t.getSecond();
		System.out.printf("현재 %d시 %d분 %.2f초 이다.", hour, minute, second);
	}
}
