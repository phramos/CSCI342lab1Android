package com.uow.YoCatch;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        YoCatchModel model = new YoCatchModel("Yo");
        Log.v("msg", model.defaultYoMessage());
        
        model.addToHistory("This");
        model.addToHistory("is");
        model.addToHistory("a");
        model.addToHistory("history!");
        
         
        for (int i = 0; i < model.getHistoryArray().size(); i++) {
			
			Log.v("msg", i+": "+model.getHistoryArray().get(i));
		}
        
        setContentView(R.layout.activity_main);
    }
    
    @Override
    protected void onStart() {
    	// TODO Auto-generated method stub
    	super.onStart();
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
