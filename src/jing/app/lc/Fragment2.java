package jing.app.lc;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment2 extends Fragment {

	private static final String TAG = "Fragment2";

	@Override
	public void onAttach(Activity activity) {
		Log.d(TAG, "===== onAttach =====");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.d(TAG, "===== onCreate =====");
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.d(TAG, "===== onCreateView =====");
		return inflater.inflate(R.layout.fragment2, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.d(TAG, "===== onActivityCreated =====");
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public void onStart() {
		Log.d(TAG, "===== onStart =====");
		super.onStart();
	}

	@Override
	public void onResume() {
		Log.d(TAG, "===== onCreate =====");
		super.onResume();
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		Log.d(TAG, "===== onSaveInstanceState =====");
		super.onSaveInstanceState(outState);
	}

	@Override
	public void onPause() {
		Log.d(TAG, "===== onPause =====");
		super.onPause();
	}

	@Override
	public void onStop() {
		Log.d(TAG, "===== onStop =====");
		super.onStop();
	}

	@Override
	public void onDestroyView() {
		Log.d(TAG, "===== onDestroyView =====");
		super.onDestroyView();
	}

	@Override
	public void onDestroy() {
		Log.d(TAG, "===== onDestroy =====");
		super.onDestroy();
	}

	@Override
	public void onDetach() {
		Log.d(TAG, "===== onDetach =====");
		super.onDetach();
	}

}
