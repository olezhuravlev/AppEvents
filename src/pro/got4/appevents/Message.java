package pro.got4.appevents;

public class Message {

	static public void show() {

		StackTraceElement[] steArr = Thread.currentThread().getStackTrace();
		StackTraceElement ste = steArr[3];
		System.out.println(ste);
	}
}
