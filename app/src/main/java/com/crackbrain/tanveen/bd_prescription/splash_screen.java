package com.crackbrain.tanveen.bd_prescription;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class splash_screen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // splasScreen Control

        Thread t = new Thread()
        {
            public void run ()
            {
                try
                {
                    sleep(1000);
                }

                catch(InterruptedException e)
                {

                }
                finally
                {
                  //  Intent i = new Intent("com.crackbrain.tanveen.bd_prescription.MainActivity");
                    Intent i = new Intent(splash_screen.this, MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        t.start();
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the MainActivity/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}