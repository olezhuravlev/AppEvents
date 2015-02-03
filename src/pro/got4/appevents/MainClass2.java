package pro.got4.appevents;

import android.app.Activity;
import android.app.Dialog;
import android.app.Fragment;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager.LayoutParams;

public class MainClass2 extends FragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {

		Tracker.show(this);
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main2_layout);

		setResult(11);
	}

	@Override
	public void onActionModeFinished(ActionMode mode) {
		Tracker.show(this);
		super.onActionModeFinished(mode);
	}

	@Override
	public void onActionModeStarted(ActionMode mode) {
		Tracker.show(this);
		super.onActionModeStarted(mode);
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {

		Tracker.show("[hashCode = " + this.hashCode() + "], requestCode = "
				+ requestCode + ", resultCode = " + resultCode);

		super.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	public void onApplyThemeResource(Theme theme, int resid, boolean first) {
		Tracker.show(this);
		super.onApplyThemeResource(theme, resid, first);
		setResult(10);
	}

	@Override
	public void onAttachedToWindow() {
		Tracker.show(this);
		super.onAttachedToWindow();
		setResult(20);
	}

	@Override
	public void onAttachFragment(Fragment fragment) {
		Tracker.show(this);
		super.onAttachFragment(fragment);
	}

	@Override
	public void onBackPressed() {
		Tracker.show(this);
		super.onBackPressed();
		setResult(30);
	}

	@Override
	public void onChildTitleChanged(Activity childActivity, CharSequence title) {
		Tracker.show(this);
		super.onChildTitleChanged(childActivity, title);
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		Tracker.show(this);
		super.onConfigurationChanged(newConfig);
	}

	@Override
	public void onContentChanged() {
		Tracker.show(this);
		super.onContentChanged();
		setResult(14);
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		Tracker.show(this);
		return super.onContextItemSelected(item);
	}

	@Override
	public void onContextMenuClosed(Menu menu) {
		Tracker.show(this);
		super.onContextMenuClosed(menu);
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		Tracker.show(this);
		super.onCreateContextMenu(menu, v, menuInfo);
	}

	@Override
	public CharSequence onCreateDescription() {
		Tracker.show(this);
		return super.onCreateDescription();
	}

	@Override
	public Dialog onCreateDialog(int id) {
		Tracker.show(this);
		return super.onCreateDialog(id);
	}

	@Override
	public Dialog onCreateDialog(int id, Bundle args) {
		Tracker.show(this);
		return super.onCreateDialog(id, args);
	}

	@Override
	public void onCreateNavigateUpTaskStack(TaskStackBuilder builder) {
		Tracker.show(this);
		super.onCreateNavigateUpTaskStack(builder);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		Tracker.show(this);
		setResult(24);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onCreatePanelMenu(int featureId, Menu menu) {
		Tracker.show(this);
		setResult(23);
		return super.onCreatePanelMenu(featureId, menu);
	}

	@Override
	public View onCreatePanelView(int featureId) {
		Tracker.show(this);
		setResult(22);
		return super.onCreatePanelView(featureId);
	}

	@Override
	public boolean onCreateThumbnail(Bitmap outBitmap, Canvas canvas) {
		Tracker.show(this);
		return super.onCreateThumbnail(outBitmap, canvas);
	}

	@Override
	public View onCreateView(String name, Context context, AttributeSet attrs) {
		Tracker.show(this);
		setResult(13);
		return super.onCreateView(name, context, attrs);
	}

	@Override
	public void onDestroy() {
		Tracker.show(this);
		super.onDestroy();
		setResult(33);
	}

	@Override
	public void onDetachedFromWindow() {
		Tracker.show(this);
		super.onDetachedFromWindow();
		setResult(34);
	}

	@Override
	public boolean onGenericMotionEvent(MotionEvent event) {
		Tracker.show(this);
		return super.onGenericMotionEvent(event);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		Tracker.show(this);
		setResult(28);
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public boolean onKeyLongPress(int keyCode, KeyEvent event) {
		Tracker.show(this);
		return super.onKeyLongPress(keyCode, event);
	}

	@Override
	public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
		Tracker.show(this);
		return super.onKeyMultiple(keyCode, repeatCount, event);
	}

	@Override
	public boolean onKeyShortcut(int keyCode, KeyEvent event) {
		Tracker.show(this);
		return super.onKeyShortcut(keyCode, event);
	}

	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		Tracker.show(this);
		setResult(29);
		return super.onKeyUp(keyCode, event);
	}

	@Override
	public void onLowMemory() {
		Tracker.show(this);
		super.onLowMemory();
	}

	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		Tracker.show(this);
		return super.onMenuItemSelected(featureId, item);
	}

	@Override
	public boolean onMenuOpened(int featureId, Menu menu) {
		Tracker.show(this);
		return super.onMenuOpened(featureId, menu);
	}

	@Override
	public boolean onNavigateUp() {
		Tracker.show(this);
		return super.onNavigateUp();
	}

	@Override
	public boolean onNavigateUpFromChild(Activity child) {
		Tracker.show(this);
		return super.onNavigateUpFromChild(child);
	}

	@Override
	public void onNewIntent(Intent intent) {
		Tracker.show(this);
		super.onNewIntent(intent);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Tracker.show(this);
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onOptionsMenuClosed(Menu menu) {
		Tracker.show(this);
		super.onOptionsMenuClosed(menu);
	}

	@Override
	public void onPanelClosed(int featureId, Menu menu) {
		Tracker.show(this);
		super.onPanelClosed(featureId, menu);
	}

	@Override
	public void onPause() {
		Tracker.show(this);
		super.onPause();
		setResult(31);
	}

	@Override
	public void onPostCreate(Bundle savedInstanceState) {
		Tracker.show(this);
		super.onPostCreate(savedInstanceState);
		setResult(16);
	}

	@Override
	public void onPostResume() {
		Tracker.show(this);
		super.onPostResume();
		setResult(19);
	}

	@Override
	public void onPrepareDialog(int id, Dialog dialog) {
		Tracker.show(this);
		super.onPrepareDialog(id, dialog);
	}

	@Override
	public void onPrepareDialog(int id, Dialog dialog, Bundle args) {
		Tracker.show(this);
		super.onPrepareDialog(id, dialog, args);
	}

	@Override
	public void onPrepareNavigateUpTaskStack(TaskStackBuilder builder) {
		Tracker.show(this);
		super.onPrepareNavigateUpTaskStack(builder);
	}

	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		Tracker.show(this);
		setResult(26);
		return super.onPrepareOptionsMenu(menu);
	}

	@Override
	public boolean onPreparePanel(int featureId, View view, Menu menu) {
		Tracker.show(this);
		setResult(25);
		return super.onPreparePanel(featureId, view, menu);
	}

	@Override
	public void onProvideAssistData(Bundle data) {
		Tracker.show(this);
		super.onProvideAssistData(data);
	}

	@Override
	public void onRestart() {
		Tracker.show(this);
		super.onRestart();
	}

	@Override
	public void onRestoreInstanceState(Bundle savedInstanceState) {
		Tracker.show(this);
		super.onRestoreInstanceState(savedInstanceState);
	}

	@Override
	public void onResume() {
		Tracker.show(this);
		super.onResume();
		setResult(18);
	}

	// В FragmentActivity не работает - следует использовать
	// onRetainCustomNonConfigurationInstance().
	// @Override
	// public Object onRetainNonConfigurationInstance() {
	// Tracker.show(this);
	// return super.onRetainNonConfigurationInstance();
	// }

	@Override
	public Object onRetainCustomNonConfigurationInstance() {
		Tracker.show(this);
		return super.onRetainCustomNonConfigurationInstance();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		Tracker.show(this);
		super.onSaveInstanceState(outState);
	}

	@Override
	public boolean onSearchRequested() {
		Tracker.show(this);
		return super.onSearchRequested();
	}

	@Override
	public void onStart() {
		Tracker.show(this);
		super.onStart();
		setResult(15);
	}

	@Override
	public void onStop() {
		Tracker.show(this);
		super.onStop();
		setResult(32);
	}

	@Override
	public void onTitleChanged(CharSequence title, int color) {
		Tracker.show(this);
		super.onTitleChanged(title, color);
		setResult(17);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		Tracker.show(this);
		return super.onTouchEvent(event);
	}

	@Override
	public boolean onTrackballEvent(MotionEvent event) {
		Tracker.show(this);
		return super.onTrackballEvent(event);
	}

	@Override
	public void onTrimMemory(int level) {
		Tracker.show(this);
		super.onTrimMemory(level);
	}

	@Override
	public void onUserInteraction() {
		Tracker.show(this);
		super.onUserInteraction();
		setResult(27);
	}

	@Override
	public void onUserLeaveHint() {
		Tracker.show(this);
		super.onUserLeaveHint();
	}

	@Override
	public void onWindowAttributesChanged(LayoutParams params) {
		Tracker.show(this);
		super.onWindowAttributesChanged(params);
		setResult(12);
	}

	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		Tracker.show(this);
		super.onWindowFocusChanged(hasFocus);
		setResult(21);
	}

	@Override
	public ActionMode onWindowStartingActionMode(Callback callback) {
		Tracker.show(this);
		return super.onWindowStartingActionMode(callback);
	}

	// ///////////////////////////////////////////////////
	public void onButtonClick(View v) {

		Tracker.show(this);

		switch (v.getId()) {

		case R.id.startActivityForResultButton:

			Tracker.show("[hashCode = " + this.hashCode()
					+ "], before startActivityForResult");

			startActivityForResult(new Intent(this, MainClass2.class), 1);
			break;

		case R.id.showDialogFragmentButton:

			Tracker.show("[hashCode = " + this.hashCode()
					+ "], before new DialogFragmentClass()");

			DialogFragmentClass d = new DialogFragmentClass();
			d.show(getSupportFragmentManager(), "dialogfragment_tag");

			break;

		case R.id.showDialogFragment2Button:

			Tracker.show("[hashCode = " + this.hashCode()
					+ "], before new DialogFragmentClass2()");

			DialogFragmentClass2 d2 = new DialogFragmentClass2();
			d2.show(getSupportFragmentManager(), "dialogfragment2_tag");

			break;

		default:

		}
	}
}
