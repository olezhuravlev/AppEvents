package pro.got4.appevents;

import android.app.Application;
import android.content.res.Configuration;

public class ApplicationClass extends Application {

	public void onCreate() {
		Message.show();
		super.onCreate();
	}

	public void onConfigurationChanged(Configuration newConfig) {
		Message.show();
		super.onConfigurationChanged(newConfig);
	}

	public void onLowMemory() {
		Message.show();
		super.onLowMemory();
	}

	public void onTerminate() {
		Message.show();
		super.onTerminate();
	}

	public void onTrimMemory(int level) {
		Message.show();
		super.onTrimMemory(level);
	}
}
