package com.dci.androidtest;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class mainActivity extends Activity {
	 
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
          
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
    
        StringBuffer displayMetricsText = new StringBuffer();
        
		displayMetricsText.append(" ---- Display Metrics ----");
		displayMetricsText.append("\n");				

		displayMetricsText.append(" absolute height in pixels: ");
		displayMetricsText.append(metrics.heightPixels);
		displayMetricsText.append("\n");
		
		displayMetricsText.append(" absolute width: ");
		displayMetricsText.append(metrics.widthPixels);
		displayMetricsText.append("\n");				

		displayMetricsText.append(" screen density in dpi: ");
		displayMetricsText.append(metrics.densityDpi);
		displayMetricsText.append("\n");				
		
		displayMetricsText.append(" scaling factor for fonts on display: ");
		displayMetricsText.append(metrics.scaledDensity);
		displayMetricsText.append("\n");			
		
		displayMetricsText.append(" physical pixel per inch of screen in X dimension: ");
		displayMetricsText.append(metrics.xdpi);
		displayMetricsText.append("\n");				

		displayMetricsText.append(" physical pixel per inch of screen in Y dimension: ");
		displayMetricsText.append(metrics.ydpi);
		displayMetricsText.append("\n");				
		
		displayMetricsText.append(" Logical density of display: ");
		displayMetricsText.append(metrics.density);
		displayMetricsText.append("\n");				
		
        TextView textView = (TextView) this.findViewById(R.id.displaymetricTextView);
        textView.setText(displayMetricsText.toString());
    }
    

}