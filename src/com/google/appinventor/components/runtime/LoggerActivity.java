//package com.example.myfirstapp;
package com.google.appinventor.components.runtime;
import android.util.Log;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.common.YaVersi
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LoggerActivity extends Activity {
	private static final String TAG = "LoggerActivity";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logger);
        Log.d(TAG, "THIS IS MY LOGGING LINE--IT'S GREAT FOR DEBUGGING");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    @Override
    protected void onPause() {
    	super.onPause();
    	Log.d(TAG, "I got onPause!!!");
    }
}
