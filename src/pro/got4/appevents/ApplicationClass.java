package pro.got4.appevents;

import android.app.Application;
import android.content.res.Configuration;

public class ApplicationClass extends Application {

	public void onCreate() {
		Message.show(this);
		super.onCreate();
	}

	public void onConfigurationChanged(Configuration newConfig) {
		Message.show(this);
		super.onConfigurationChanged(newConfig);
	}

	public void onLowMemory() {
		Message.show(this);
		super.onLowMemory();
	}

	public void onTerminate() {
		Message.show(this);
		super.onTerminate();
	}

	// Начиная с API-14
	public void onTrimMemory(int level) {
		Message.show(this);
		super.onTrimMemory(level);
	}
}
