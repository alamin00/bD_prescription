package com.crackbrain.tanveen.bd_prescription;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;



public class CardiologyDetails extends ActionBarActivity {

 @Override
 protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardiology_details);

       // String[] CardiologydiseaseDetails = getResources().getStringArray(R.array.cardiologyDetails);

       // TextView txtDisease = (TextView) findViewById(R.id.txTV);

      //  Intent i = getIntent();
        int position;
        // getting attached intent data
       // String disease = i.getStringExtra("p");

//        position =Integer.parseInt(disease);
        // String dis = i.getStringExtra("Dis");


        // displaying selected product name
       ///// txtDisease.setText(CardiologydiseaseDetails[position]);
    }


 @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cardiology_details, menu);
        return true;
    }

  @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
