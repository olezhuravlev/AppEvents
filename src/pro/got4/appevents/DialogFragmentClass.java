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
 * Диалог, для которого setRetainInstance(false).
 * 
 * @author programmer
 * 
 */
public class DialogFragmentClass extends DialogFragment {

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Message.show(this);
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		Message.show(this);
		super.onActivityResult(requestCode, resultCode, data);
	}

	@Override
	public void onAttach(Activity activity) {
		Message.show(this);
		super.onAttach(activity);
	}

	@Override
	public void onCancel(DialogInterface dialog) {
		Message.show(this);
		super.onCancel(dialog);
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		Message.show(this);
		super.onConfigurationChanged(newConfig);
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		Message.show(this);
		return super.onContextItemSelected(item);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {

		Message.show(this);

		setRetainInstance(false);
		super.onCreate(savedInstanceState);
	}

	@Override
	public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
		Message.show(this);
		return super.onCreateAnimation(transit, enter, nextAnim);
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		Message.show(this);
		super.onCreateContextMenu(menu, v, menuInfo);
	}

	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		Message.show(this);
		return super.onCreateDialog(savedInstanceState);

	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		Message.show(this);
		super.onCreateOptionsMenu(menu, inflater);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Message.show(this);
		// return super.onCreateView(inflater, container, savedInstanceState);
		return inflater.inflate(R.layout.dialogfragment_layout, null);
	}

	@Override
	public void onDestroy() {
		Message.show(this);
		super.onDestroy();
	}

	@Override
	public void onDestroyOptionsMenu() {
		Message.show(this);
		super.onDestroyOptionsMenu();
	}

	@Override
	public void onDestroyView() {
		Message.show(this);
		super.onDestroyView();
	}

	@Override
	public void onDetach() {
		Message.show(this);
		super.onDetach();
	}

	@Override
	public void onDismiss(DialogInterface dialog) {
		Message.show(this);
		super.onDismiss(dialog);
	}

	@Override
	public void onHiddenChanged(boolean hidden) {
		Message.show(this);
		super.onHiddenChanged(hidden);
	}

	@Override
	public void onInflate(Activity activity, AttributeSet attrs,
			Bundle savedInstanceState) {
		Message.show(this);
		super.onInflate(activity, attrs, savedInstanceState);
	}

	@Override
	public void onLowMemory() {
		Message.show(this);
		super.onLowMemory();
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
	public void onPause() {
		Message.show(this);
		super.onPause();
	}

	@Override
	public void onPrepareOptionsMenu(Menu menu) {
		Message.show(this);
		super.onPrepareOptionsMenu(menu);
	}

	@Override
	public void onResume() {
		Message.show(this);
		super.onResume();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		Message.show(this);
		super.onSaveInstanceState(outState);
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
	public void onViewCreated(View view, Bundle savedInstanceState) {
		Message.show(this);
		super.onViewCreated(view, savedInstanceState);
	}
}
