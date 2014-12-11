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

public class MainClass extends FragmentActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Message.show();
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main_layout);
	}

	@Override
	public void onActionModeFinished(ActionMode mode) {
		Message.show();
		super.onActionModeFinished(mode);
	}

	@Override
	public void onActionModeStarted(ActionMode mode) {
		Message.show();
		super.onActionModeStarted(mode);
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		Message.show();
		super.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	public void onApplyThemeResource(Theme theme, int resid, boolean first) {
		Message.show();
		super.onApplyThemeResource(theme, resid, first);
	}

	@Override
	public void onAttachedToWindow() {
		Message.show();
		super.onAttachedToWindow();
	}

	@Override
	public void onAttachFragment(Fragment fragment) {
		Message.show();
		super.onAttachFragment(fragment);
	}

	@Override
	public void onBackPressed() {
		Message.show();
		super.onBackPressed();
	}

	@Override
	public void onChildTitleChanged(Activity childActivity, CharSequence title) {
		Message.show();
		super.onChildTitleChanged(childActivity, title);
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		Message.show();
		super.onConfigurationChanged(newConfig);
	}

	@Override
	public void onContentChanged() {
		Message.show();
		super.onContentChanged();
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		Message.show();
		return super.onContextItemSelected(item);
	}

	@Override
	public void onContextMenuClosed(Menu menu) {
		Message.show();
		super.onContextMenuClosed(menu);
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		Message.show();
		super.onCreateContextMenu(menu, v, menuInfo);
	}

	@Override
	public CharSequence onCreateDescription() {
		Message.show();
		return super.onCreateDescription();
	}

	@Override
	public Dialog onCreateDialog(int id) {
		Message.show();
		return super.onCreateDialog(id);
	}

	@Override
	public Dialog onCreateDialog(int id, Bundle args) {
		Message.show();
		return super.onCreateDialog(id, args);
	}

	@Override
	public void onCreateNavigateUpTaskStack(TaskStackBuilder builder) {
		Message.show();
		super.onCreateNavigateUpTaskStack(builder);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		Message.show();
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onCreatePanelMenu(int featureId, Menu menu) {
		Message.show();
		return super.onCreatePanelMenu(featureId, menu);
	}

	@Override
	public View onCreatePanelView(int featureId) {
		Message.show();
		return super.onCreatePanelView(featureId);
	}

	@Override
	public boolean onCreateThumbnail(Bitmap outBitmap, Canvas canvas) {
		Message.show();
		return super.onCreateThumbnail(outBitmap, canvas);
	}

	@Override
	public View onCreateView(String name, Context context, AttributeSet attrs) {
		Message.show();
		return super.onCreateView(name, context, attrs);
	}

	@Override
	public void onDestroy() {
		Message.show();
		super.onDestroy();
	}

	@Override
	public void onDetachedFromWindow() {
		Message.show();
		super.onDetachedFromWindow();
	}

	@Override
	public boolean onGenericMotionEvent(MotionEvent event) {
		Message.show();
		return super.onGenericMotionEvent(event);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		Message.show();
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public boolean onKeyLongPress(int keyCode, KeyEvent event) {
		Message.show();
		return super.onKeyLongPress(keyCode, event);
	}

	@Override
	public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
		Message.show();
		return super.onKeyMultiple(keyCode, repeatCount, event);
	}

	@Override
	public boolean onKeyShortcut(int keyCode, KeyEvent event) {
		Message.show();
		return super.onKeyShortcut(keyCode, event);
	}

	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		Message.show();
		return super.onKeyUp(keyCode, event);
	}

	@Override
	public void onLowMemory() {
		Message.show();
		super.onLowMemory();
	}

	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		Message.show();
		return super.onMenuItemSelected(featureId, item);
	}

	@Override
	public boolean onMenuOpened(int featureId, Menu menu) {
		Message.show();
		return super.onMenuOpened(featureId, menu);
	}

	@Override
	public boolean onNavigateUp() {
		Message.show();
		return super.onNavigateUp();
	}

	@Override
	public boolean onNavigateUpFromChild(Activity child) {
		Message.show();
		return super.onNavigateUpFromChild(child);
	}

	@Override
	public void onNewIntent(Intent intent) {
		Message.show();
		super.onNewIntent(intent);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Message.show();
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onOptionsMenuClosed(Menu menu) {
		Message.show();
		super.onOptionsMenuClosed(menu);
	}

	@Override
	public void onPanelClosed(int featureId, Menu menu) {
		Message.show();
		super.onPanelClosed(featureId, menu);
	}

	@Override
	public void onPause() {
		Message.show();
		super.onPause();
	}

	@Override
	public void onPostCreate(Bundle savedInstanceState) {
		Message.show();
		super.onPostCreate(savedInstanceState);
	}

	@Override
	public void onPostResume() {
		Message.show();
		super.onPostResume();
	}

	@Override
	public void onPrepareDialog(int id, Dialog dialog) {
		Message.show();
		super.onPrepareDialog(id, dialog);
	}

	@Override
	public void onPrepareDialog(int id, Dialog dialog, Bundle args) {
		Message.show();
		super.onPrepareDialog(id, dialog, args);
	}

	@Override
	public void onPrepareNavigateUpTaskStack(TaskStackBuilder builder) {
		Message.show();
		super.onPrepareNavigateUpTaskStack(builder);
	}

	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		Message.show();
		return super.onPrepareOptionsMenu(menu);
	}

	@Override
	public boolean onPreparePanel(int featureId, View view, Menu menu) {
		Message.show();
		return super.onPreparePanel(featureId, view, menu);
	}

	@Override
	public void onProvideAssistData(Bundle data) {
		Message.show();
		super.onProvideAssistData(data);
	}

	@Override
	public void onRestart() {
		Message.show();
		super.onRestart();
	}

	@Override
	public void onRestoreInstanceState(Bundle savedInstanceState) {
		Message.show();
		super.onRestoreInstanceState(savedInstanceState);
	}

	@Override
	public void onResume() {
		Message.show();
		super.onResume();
	}

	@Override
	public Object onRetainNonConfigurationInstance() {
		Message.show();
		return super.onRetainNonConfigurationInstance();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		Message.show();
		super.onSaveInstanceState(outState);
	}

	@Override
	public boolean onSearchRequested() {
		Message.show();
		return super.onSearchRequested();
	}

	@Override
	public void onStart() {
		Message.show();
		super.onStart();
	}

	@Override
	public void onStop() {
		Message.show();
		super.onStop();
	}

	@Override
	public void onTitleChanged(CharSequence title, int color) {
		Message.show();
		super.onTitleChanged(title, color);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		Message.show();
		return super.onTouchEvent(event);
	}

	@Override
	public boolean onTrackballEvent(MotionEvent event) {
		Message.show();
		return super.onTrackballEvent(event);
	}

	@Override
	public void onTrimMemory(int level) {
		Message.show();
		super.onTrimMemory(level);
	}

	@Override
	public void onUserInteraction() {
		Message.show();
		super.onUserInteraction();
	}

	@Override
	public void onUserLeaveHint() {
		Message.show();
		super.onUserLeaveHint();
	}

	@Override
	public void onWindowAttributesChanged(LayoutParams params) {
		Message.show();
		super.onWindowAttributesChanged(params);
	}

	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		Message.show();
		super.onWindowFocusChanged(hasFocus);
	}

	@Override
	public ActionMode onWindowStartingActionMode(Callback callback) {
		Message.show();
		return super.onWindowStartingActionMode(callback);
	}
}
