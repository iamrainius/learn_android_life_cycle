package jing.app.lc;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity implements Fragment1.Callback {

	private static final String TAG = "MainActivity";
	Fragment1 f1 = new Fragment1();
	Fragment2 f2 = new Fragment2();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.d(TAG, "***** onCreate *****");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		FragmentTransaction ft = getFragmentManager().beginTransaction();
		ft.replace(R.id.container, f1);
		ft.commit();
		
	}

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
		Log.d(TAG, "***** onRestoreInstanceState *****");
		super.onRestoreInstanceState(savedInstanceState);
	}

	@Override
	protected void onStart() {
		Log.d(TAG, "***** onStart *****");
		super.onStart();
	}

	@Override
	protected void onRestart() {
		Log.d(TAG, "***** onRestart *****");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		Log.d(TAG, "***** onResume *****");
		super.onResume();
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		Log.d(TAG, "***** onSaveInstanceState *****");
		super.onSaveInstanceState(outState);
	}

	@Override
	protected void onPause() {
		Log.d(TAG, "***** onPause *****");
		super.onPause();
	}

	@Override
	protected void onStop() {
		Log.d(TAG, "***** onStop *****");
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		Log.d(TAG, "***** onDestroy *****");
		super.onDestroy();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onOpenFragment2() {
		FragmentTransaction ft = getFragmentManager().beginTransaction();
		ft.replace(R.id.container, f2);
		ft.addToBackStack("123");
		ft.commit();
	}

}
