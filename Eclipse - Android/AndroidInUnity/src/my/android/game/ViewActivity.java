package my.android.game;


//import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;
//import com.google.android.maps.MapActivity;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentTransaction;

//import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.widget.RelativeLayout;


public class ViewActivity extends Activity//com.google.android.maps.MapActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		Log.d("MyMessages", "in ViewActivity.onCreate");
		
		RelativeLayout mainLayout = new RelativeLayout(this);
		mainLayout.setId(123);
		//TextView text = new TextView(this);
		//text.setText("Hello World!");
		//mainLayout.addView(text);
		setContentView(mainLayout);
		
		com.example.unitylib.testingClassActivity act = new com.example.unitylib.testingClassActivity();
		Log.d("MyMessages", act.returnSomething());	

		Log.d("MyMessages", "ViewActivity Before newInstance");
		MapFragment frag = MapFragment.newInstance();
		Log.d("MyMessages", "in ViewActivity After newInstance");
		FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
		fragmentTransaction.add(mainLayout.getId(), frag);
		fragmentTransaction.commit();

	}

	/*
	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
	*/


}
