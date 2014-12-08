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

public class MainClass extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Message.show();
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main_layout);
	}

	public void onActionModeFinished(ActionMode mode) {
		Message.show();
		super.onActionModeFinished(mode);
	}

	public void onActionModeStarted(ActionMode mode) {
		Message.show();
		super.onActionModeStarted(mode);
	}

	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		Message.show();
		super.onActivityResult(requestCode, resultCode, data);
	}

	public void onApplyThemeResource(Theme theme, int resid, boolean first) {
		Message.show();
		super.onApplyThemeResource(theme, resid, first);
	}

	public void onAttachedToWindow() {
		Message.show();
		super.onAttachedToWindow();
	}

	public void onAttachFragment(Fragment fragment) {
		Message.show();
		super.onAttachFragment(fragment);
	}

	public void onBackPressed() {
		Message.show();
		super.onBackPressed();
	}

	public void onChildTitleChanged(Activity childActivity, CharSequence title) {
		Message.show();
		super.onChildTitleChanged(childActivity, title);
	}

	public void onConfigurationChanged(Configuration newConfig) {
		Message.show();
		super.onConfigurationChanged(newConfig);
	}

	public void onContentChanged() {
		Message.show();
		super.onContentChanged();
	}

	public boolean onContextItemSelected(MenuItem item) {
		Message.show();
		return super.onContextItemSelected(item);
	}

	public void onContextMenuClosed(Menu menu) {
		Message.show();
		super.onContextMenuClosed(menu);
	}

	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		Message.show();
		super.onCreateContextMenu(menu, v, menuInfo);
	}

	public CharSequence onCreateDescription() {
		Message.show();
		return super.onCreateDescription();
	}

	public Dialog onCreateDialog(int id) {
		Message.show();
		return super.onCreateDialog(id);
	}

	public Dialog onCreateDialog(int id, Bundle args) {
		Message.show();
		return super.onCreateDialog(id, args);
	}

	public void onCreateNavigateUpTaskStack(TaskStackBuilder builder) {
		Message.show();
		super.onCreateNavigateUpTaskStack(builder);
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		Message.show();
		return super.onCreateOptionsMenu(menu);
	}

	public boolean onCreatePanelMenu(int featureId, Menu menu) {
		Message.show();
		return super.onCreatePanelMenu(featureId, menu);
	}

	public View onCreatePanelView(int featureId) {
		Message.show();
		return super.onCreatePanelView(featureId);
	}

	public boolean onCreateThumbnail(Bitmap outBitmap, Canvas canvas) {
		Message.show();
		return super.onCreateThumbnail(outBitmap, canvas);
	}

	public View onCreateView(String name, Context context, AttributeSet attrs) {
		Message.show();
		return super.onCreateView(name, context, attrs);
	}

	public void onDestroy() {
		Message.show();
		super.onDestroy();
	}

	public void onDetachedFromWindow() {
		Message.show();
		super.onDetachedFromWindow();
	}

	public boolean onGenericMotionEvent(MotionEvent event) {
		Message.show();
		return super.onGenericMotionEvent(event);
	}

	public boolean onKeyDown(int keyCode, KeyEvent event) {
		Message.show();
		return super.onKeyDown(keyCode, event);
	}

	public boolean onKeyLongPress(int keyCode, KeyEvent event) {
		Message.show();
		return super.onKeyLongPress(keyCode, event);
	}

	public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
		Message.show();
		return super.onKeyMultiple(keyCode, repeatCount, event);
	}

	public boolean onKeyShortcut(int keyCode, KeyEvent event) {
		Message.show();
		return super.onKeyShortcut(keyCode, event);
	}

	public boolean onKeyUp(int keyCode, KeyEvent event) {
		Message.show();
		return super.onKeyUp(keyCode, event);
	}

	public void onLowMemory() {
		Message.show();
		super.onLowMemory();
	}

	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		Message.show();
		return super.onMenuItemSelected(featureId, item);
	}

	public boolean onMenuOpened(int featureId, Menu menu) {
		Message.show();
		return super.onMenuOpened(featureId, menu);
	}

	public boolean onNavigateUp() {
		Message.show();
		return super.onNavigateUp();
	}

	public boolean onNavigateUpFromChild(Activity child) {
		Message.show();
		return super.onNavigateUpFromChild(child);
	}

	public void onNewIntent(Intent intent) {
		Message.show();
		super.onNewIntent(intent);
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		Message.show();
		return super.onOptionsItemSelected(item);
	}

	public void onOptionsMenuClosed(Menu menu) {
		Message.show();
		super.onOptionsMenuClosed(menu);
	}

	public void onPanelClosed(int featureId, Menu menu) {
		Message.show();
		super.onPanelClosed(featureId, menu);
	}

	public void onPause() {
		Message.show();
		super.onPause();
	}

	public void onPostCreate(Bundle savedInstanceState) {
		Message.show();
		super.onPostCreate(savedInstanceState);
	}

	public void onPostResume() {
		Message.show();
		super.onPostResume();
	}

	public void onPrepareDialog(int id, Dialog dialog) {
		Message.show();
		super.onPrepareDialog(id, dialog);
	}

	public void onPrepareDialog(int id, Dialog dialog, Bundle args) {
		Message.show();
		super.onPrepareDialog(id, dialog, args);
	}

	public void onPrepareNavigateUpTaskStack(TaskStackBuilder builder) {
		Message.show();
		super.onPrepareNavigateUpTaskStack(builder);
	}

	public boolean onPrepareOptionsMenu(Menu menu) {
		Message.show();
		return super.onPrepareOptionsMenu(menu);
	}

	public boolean onPreparePanel(int featureId, View view, Menu menu) {
		Message.show();
		return super.onPreparePanel(featureId, view, menu);
	}

	public void onProvideAssistData(Bundle data) {
		Message.show();
		super.onProvideAssistData(data);
	}

	public void onRestart() {
		Message.show();
		super.onRestart();
	}

	public void onRestoreInstanceState(Bundle savedInstanceState) {
		Message.show();
		super.onRestoreInstanceState(savedInstanceState);
	}

	public void onResume() {
		Message.show();
		super.onResume();
	}

	public Object onRetainNonConfigurationInstance() {
		Message.show();
		return super.onRetainNonConfigurationInstance();
	}

	public void onSaveInstanceState(Bundle outState) {
		Message.show();
		super.onSaveInstanceState(outState);
	}

	public boolean onSearchRequested() {
		Message.show();
		return super.onSearchRequested();
	}

	public void onStart() {
		Message.show();
		super.onStart();
	}

	public void onStop() {
		Message.show();
		super.onStop();
	}

	public void onTitleChanged(CharSequence title, int color) {
		Message.show();
		super.onTitleChanged(title, color);
	}

	public boolean onTouchEvent(MotionEvent event) {
		Message.show();
		return super.onTouchEvent(event);
	}

	public boolean onTrackballEvent(MotionEvent event) {
		Message.show();
		return super.onTrackballEvent(event);
	}

	public void onTrimMemory(int level) {
		Message.show();
		super.onTrimMemory(level);
	}

	public void onUserInteraction() {
		Message.show();
		super.onUserInteraction();
	}

	public void onUserLeaveHint() {
		Message.show();
		super.onUserLeaveHint();
	}

	public void onWindowAttributesChanged(LayoutParams params) {
		Message.show();
		super.onWindowAttributesChanged(params);
	}

	public void onWindowFocusChanged(boolean hasFocus) {
		Message.show();
		super.onWindowFocusChanged(hasFocus);
	}

	public ActionMode onWindowStartingActionMode(Callback callback) {
		Message.show();
		return super.onWindowStartingActionMode(callback);
	}
}
