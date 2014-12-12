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

		Message.show(this);
		super.onCreate(savedInstanceState);

		setContentView(R.layout.main2_layout);

		setResult(2);
	}

	@Override
	public void onActionModeFinished(ActionMode mode) {
		Message.show(this);
		super.onActionModeFinished(mode);
	}

	@Override
	public void onActionModeStarted(ActionMode mode) {
		Message.show(this);
		super.onActionModeStarted(mode);
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {

		Message.show("[hashCode = " + this.hashCode() + "], requestCode = "
				+ requestCode + ", resultCode = " + resultCode);

		super.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	public void onApplyThemeResource(Theme theme, int resid, boolean first) {
		Message.show(this);
		super.onApplyThemeResource(theme, resid, first);
	}

	@Override
	public void onAttachedToWindow() {
		Message.show(this);
		super.onAttachedToWindow();
	}

	@Override
	public void onAttachFragment(Fragment fragment) {
		Message.show(this);
		super.onAttachFragment(fragment);
	}

	@Override
	public void onBackPressed() {
		Message.show(this);
		super.onBackPressed();
	}

	@Override
	public void onChildTitleChanged(Activity childActivity, CharSequence title) {
		Message.show(this);
		super.onChildTitleChanged(childActivity, title);
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		Message.show(this);
		super.onConfigurationChanged(newConfig);
	}

	@Override
	public void onContentChanged() {
		Message.show(this);
		super.onContentChanged();
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		Message.show(this);
		return super.onContextItemSelected(item);
	}

	@Override
	public void onContextMenuClosed(Menu menu) {
		Message.show(this);
		super.onContextMenuClosed(menu);
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		Message.show(this);
		super.onCreateContextMenu(menu, v, menuInfo);
	}

	@Override
	public CharSequence onCreateDescription() {
		Message.show(this);
		return super.onCreateDescription();
	}

	@Override
	public Dialog onCreateDialog(int id) {
		Message.show(this);
		return super.onCreateDialog(id);
	}

	@Override
	public Dialog onCreateDialog(int id, Bundle args) {
		Message.show(this);
		return super.onCreateDialog(id, args);
	}

	@Override
	public void onCreateNavigateUpTaskStack(TaskStackBuilder builder) {
		Message.show(this);
		super.onCreateNavigateUpTaskStack(builder);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		Message.show(this);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onCreatePanelMenu(int featureId, Menu menu) {
		Message.show(this);
		return super.onCreatePanelMenu(featureId, menu);
	}

	@Override
	public View onCreatePanelView(int featureId) {
		Message.show(this);
		return super.onCreatePanelView(featureId);
	}

	@Override
	public boolean onCreateThumbnail(Bitmap outBitmap, Canvas canvas) {
		Message.show(this);
		return super.onCreateThumbnail(outBitmap, canvas);
	}

	@Override
	public View onCreateView(String name, Context context, AttributeSet attrs) {
		Message.show(this);
		return super.onCreateView(name, context, attrs);
	}

	@Override
	public void onDestroy() {
		Message.show(this);
		super.onDestroy();
	}

	@Override
	public void onDetachedFromWindow() {
		Message.show(this);
		super.onDetachedFromWindow();
	}

	@Override
	public boolean onGenericMotionEvent(MotionEvent event) {
		Message.show(this);
		return super.onGenericMotionEvent(event);
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		Message.show(this);
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public boolean onKeyLongPress(int keyCode, KeyEvent event) {
		Message.show(this);
		return super.onKeyLongPress(keyCode, event);
	}

	@Override
	public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
		Message.show(this);
		return super.onKeyMultiple(keyCode, repeatCount, event);
	}

	@Override
	public boolean onKeyShortcut(int keyCode, KeyEvent event) {
		Message.show(this);
		return super.onKeyShortcut(keyCode, event);
	}

	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		Message.show(this);
		return super.onKeyUp(keyCode, event);
	}

	@Override
	public void onLowMemory() {
		Message.show(this);
		super.onLowMemory();
	}

	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		Message.show(this);
		return super.onMenuItemSelected(featureId, item);
	}

	@Override
	public boolean onMenuOpened(int featureId, Menu menu) {
		Message.show(this);
		return super.onMenuOpened(featureId, menu);
	}

	@Override
	public boolean onNavigateUp() {
		Message.show(this);
		return super.onNavigateUp();
	}

	@Override
	public boolean onNavigateUpFromChild(Activity child) {
		Message.show(this);
		return super.onNavigateUpFromChild(child);
	}

	@Override
	public void onNewIntent(Intent intent) {
		Message.show(this);
		super.onNewIntent(intent);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Message.show(this);
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onOptionsMenuClosed(Menu menu) {
		Message.show(this);
		super.onOptionsMenuClosed(menu);
	}

	@Override
	public void onPanelClosed(int featureId, Menu menu) {
		Message.show(this);
		super.onPanelClosed(featureId, menu);
	}

	@Override
	public void onPause() {
		Message.show(this);
		super.onPause();
	}

	@Override
	public void onPostCreate(Bundle savedInstanceState) {
		Message.show(this);
		super.onPostCreate(savedInstanceState);
	}

	@Override
	public void onPostResume() {
		Message.show(this);
		super.onPostResume();
	}

	@Override
	public void onPrepareDialog(int id, Dialog dialog) {
		Message.show(this);
		super.onPrepareDialog(id, dialog);
	}

	@Override
	public void onPrepareDialog(int id, Dialog dialog, Bundle args) {
		Message.show(this);
		super.onPrepareDialog(id, dialog, args);
	}

	@Override
	public void onPrepareNavigateUpTaskStack(TaskStackBuilder builder) {
		Message.show(this);
		super.onPrepareNavigateUpTaskStack(builder);
	}

	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		Message.show(this);
		return super.onPrepareOptionsMenu(menu);
	}

	@Override
	public boolean onPreparePanel(int featureId, View view, Menu menu) {
		Message.show(this);
		return super.onPreparePanel(featureId, view, menu);
	}

	@Override
	public void onProvideAssistData(Bundle data) {
		Message.show(this);
		super.onProvideAssistData(data);
	}

	@Override
	public void onRestart() {
		Message.show(this);
		super.onRestart();
	}

	@Override
	public void onRestoreInstanceState(Bundle savedInstanceState) {
		Message.show(this);
		super.onRestoreInstanceState(savedInstanceState);
	}

	@Override
	public void onResume() {
		Message.show(this);
		super.onResume();
	}

	// В FragmentActivity не работает - следует использовать
	// onRetainCustomNonConfigurationInstance().
	// @Override
	// public Object onRetainNonConfigurationInstance() {
	// Message.show(this);
	// return super.onRetainNonConfigurationInstance();
	// }

	@Override
	public Object onRetainCustomNonConfigurationInstance() {
		Message.show(this);
		return super.onRetainCustomNonConfigurationInstance();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		Message.show(this);
		super.onSaveInstanceState(outState);
	}

	@Override
	public boolean onSearchRequested() {
		Message.show(this);
		return super.onSearchRequested();
	}

	@Override
	public void onStart() {
		Message.show(this);
		super.onStart();
	}

	@Override
	public void onStop() {
		Message.show(this);
		super.onStop();
	}

	@Override
	public void onTitleChanged(CharSequence title, int color) {
		Message.show(this);
		super.onTitleChanged(title, color);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		Message.show(this);
		return super.onTouchEvent(event);
	}

	@Override
	public boolean onTrackballEvent(MotionEvent event) {
		Message.show(this);
		return super.onTrackballEvent(event);
	}

	@Override
	public void onTrimMemory(int level) {
		Message.show(this);
		super.onTrimMemory(level);
	}

	@Override
	public void onUserInteraction() {
		Message.show(this);
		super.onUserInteraction();
	}

	@Override
	public void onUserLeaveHint() {
		Message.show(this);
		super.onUserLeaveHint();
	}

	@Override
	public void onWindowAttributesChanged(LayoutParams params) {
		Message.show(this);
		super.onWindowAttributesChanged(params);
	}

	@Override
	public void onWindowFocusChanged(boolean hasFocus) {
		Message.show(this);
		super.onWindowFocusChanged(hasFocus);
	}

	@Override
	public ActionMode onWindowStartingActionMode(Callback callback) {
		Message.show(this);
		return super.onWindowStartingActionMode(callback);
	}

	// ///////////////////////////////////////////////////
	public void onButtonClick(View v) {

		Message.show(this);

		switch (v.getId()) {

		case R.id.startActivityForResultButton:

			Message.show("[hashCode = " + this.hashCode()
					+ "], before startActivityForResult");

			startActivityForResult(new Intent(this, MainClass2.class), 1);
			break;

		case R.id.showDialogFragmentButton:

			Message.show("[hashCode = " + this.hashCode()
					+ "], before new DialogFragmentClass()");

			DialogFragmentClass d = new DialogFragmentClass();
			d.show(getSupportFragmentManager(), "dialogfragment_tag");

			break;

		case R.id.showDialogFragment2Button:

			Message.show("[hashCode = " + this.hashCode()
					+ "], before new DialogFragmentClass2()");

			DialogFragmentClass2 d2 = new DialogFragmentClass2();
			d2.show(getSupportFragmentManager(), "dialogfragment2_tag");

			break;

		default:

		}
	}
}
