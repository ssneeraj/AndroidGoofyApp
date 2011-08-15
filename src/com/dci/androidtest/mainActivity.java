package com.dci.androidtest;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class mainActivity extends Activity {
	
	private String displayMetrics;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        DisplayMetrics metrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(metrics);
		displayMetrics = metrics.toString();
		 
        TextView textView = (TextView) this.findViewById(R.id.displaymetricTextView);
        textView.setText(displayMetrics);
    }
    

}