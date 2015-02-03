package pro.got4.appevents;

import android.app.Application;
import android.content.res.Configuration;

public class ApplicationClass extends Application {

	public void onCreate() {
		Tracker.show(this);
		super.onCreate();
	}

	public void onConfigurationChanged(Configuration newConfig) {
		Tracker.show(this);
		super.onConfigurationChanged(newConfig);
	}

	public void onLowMemory() {
		Tracker.show(this);
		super.onLowMemory();
	}

	public void onTerminate() {
		Tracker.show(this);
		super.onTerminate();
	}

	// Начиная с API-14
	public void onTrimMemory(int level) {
		Tracker.show(this);
		super.onTrimMemory(level);
	}
}
