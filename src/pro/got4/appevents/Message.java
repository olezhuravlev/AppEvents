package pro.got4.appevents;

public class Message {

	static public void show() {

		StackTraceElement[] steArr = Thread.currentThread().getStackTrace();
		StackTraceElement ste = steArr[3];
		System.out.println(ste);
	}

	static public void show(String comment) {

		StackTraceElement[] steArr = Thread.currentThread().getStackTrace();
		StackTraceElement ste = steArr[3];
		System.out.println(ste + " " + comment);
	}

	static public void show(Object obj) {

		StackTraceElement[] steArr = Thread.currentThread().getStackTrace();
		StackTraceElement ste = steArr[3];
		System.out.println(ste + " [hashCode = " + obj.hashCode() + "]");
	}

}
