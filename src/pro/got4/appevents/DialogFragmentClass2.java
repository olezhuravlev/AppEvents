package pro.got4.appevents;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/**
 * Диалог, для которого setRetainInstance(true).
 * 
 * @author programmer
 * 
 */
public class DialogFragmentClass2 extends DialogFragment {

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Tracker.show(this);
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		Tracker.show(this);
		super.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	public void onAttach(Activity activity) {
		Tracker.show(this);
		super.onAttach(activity);
	}

	@Override
	public void onCancel(DialogInterface dialog) {
		Tracker.show(this);
		super.onCancel(dialog);
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		Tracker.show(this);
		super.onConfigurationChanged(newConfig);
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		Tracker.show(this);
		return super.onContextItemSelected(item);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {

		Tracker.show(this);

		setRetainInstance(true);
		super.onCreate(savedInstanceState);
	}

	@Override
	public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
		Tracker.show(this);
		return super.onCreateAnimation(transit, enter, nextAnim);
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		Tracker.show(this);
		super.onCreateContextMenu(menu, v, menuInfo);
	}

	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		Tracker.show(this);
		return super.onCreateDialog(savedInstanceState);

	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		Tracker.show(this);
		super.onCreateOptionsMenu(menu, inflater);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Tracker.show(this);
		// return super.onCreateView(inflater, container, savedInstanceState);
		return inflater.inflate(R.layout.dialogfragment_layout, container,
				false);
	}

	@Override
	public void onDestroy() {
		Tracker.show(this);
		super.onDestroy();
	}

	@Override
	public void onDestroyOptionsMenu() {
		Tracker.show(this);
		super.onDestroyOptionsMenu();
	}

	// @Override
	// public void onDestroyView() {
	// Tracker.show(this);
	// super.onDestroyView();
	// }

	// Диалог уничтожается при вращении по причине бага:
	// https://code.google.com/p/android/issues/detail?id=17423
	@Override
	public void onDestroyView() {

		Tracker.show(this);

		if (getDialog() != null && getRetainInstance())
			getDialog().setDismissMessage(null);

		super.onDestroyView();
	}

	@Override
	public void onDetach() {
		Tracker.show(this);
		super.onDetach();
	}

	@Override
	public void onDismiss(DialogInterface dialog) {
		Tracker.show(this);
		super.onDismiss(dialog);
	}

	@Override
	public void onHiddenChanged(boolean hidden) {
		Tracker.show(this);
		super.onHiddenChanged(hidden);
	}

	@Override
	public void onInflate(Activity activity, AttributeSet attrs,
			Bundle savedInstanceState) {
		Tracker.show(this);
		super.onInflate(activity, attrs, savedInstanceState);
	}

	@Override
	public void onLowMemory() {
		Tracker.show(this);
		super.onLowMemory();
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
	public void onPause() {
		Tracker.show(this);
		super.onPause();
	}

	@Override
	public void onPrepareOptionsMenu(Menu menu) {
		Tracker.show(this);
		super.onPrepareOptionsMenu(menu);
	}

	@Override
	public void onResume() {
		Tracker.show(this);
		super.onResume();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		Tracker.show(this);
		super.onSaveInstanceState(outState);
	}

	@Override
	public void onStart() {
		Tracker.show(this);
		super.onStart();
	}

	@Override
	public void onStop() {
		Tracker.show(this);
		super.onStop();
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		Tracker.show(this);
		super.onViewCreated(view, savedInstanceState);
	}

	@Override
	public void onViewStateRestored(Bundle savedInstanceState) {
		Tracker.show(this);
		super.onViewStateRestored(savedInstanceState);
	}
}
