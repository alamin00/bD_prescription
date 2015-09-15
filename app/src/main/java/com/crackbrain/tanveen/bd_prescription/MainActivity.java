package com.crackbrain.tanveen.bd_prescription;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener{

    private ActionBarDrawerToggle actionBarDrawerToggle ;

    private DrawerLayout drawerLayout;
    //FragmentManager fragmentManager;

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    ListView navList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = (DrawerLayout)findViewById(R.id.drawerLayout);

        navList = (ListView)findViewById(R.id.navlist);

        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.opendrawer,R.string.closedrawer);




        drawerLayout.setDrawerListener(actionBarDrawerToggle);



        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        ArrayList<String> navArray = new ArrayList<String>();

        navArray.add("Home");
        navArray.add("Search AllDisease");
        navArray.add("Gynecology");
        navArray.add("Medicine");
        navArray.add("Surgery");
        navArray.add("A-5");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_activated_1,navArray);
        navList.setAdapter(adapter);
        navList.setOnItemClickListener(this);

        navList.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        fragmentManager = getSupportFragmentManager();


        loadSelection(0);

    }

    private  void loadSelection(int i)
    {
        navList.setItemChecked(i,true);

        switch (i)
        {
            case 0:
                HOME home = new HOME();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.framentHolder,home);
                fragmentTransaction.commit();

                break;

            case 1:
                SearchAllDisease searchAllDisease = new SearchAllDisease();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.framentHolder,searchAllDisease);
                fragmentTransaction.commit();

                break;

            case 2:
                Gynecology gynecology = new Gynecology();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.framentHolder,gynecology);
                fragmentTransaction.commit();

                break;

            case 3:
                Medicine medicine = new Medicine();
                fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.framentHolder,medicine);
                fragmentTransaction.commit();
                break;
            case 4:
                  Surgery surgery = new Surgery();
                fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.framentHolder,surgery);
                fragmentTransaction.commit();
                break;

            case 5:

                break;

        }


    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        actionBarDrawerToggle.syncState();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        else if(id == android.R.id.home)
        {
            if(drawerLayout.isDrawerOpen(navList))

            {
                drawerLayout.closeDrawer(navList);
            }

            else
            {
                drawerLayout.openDrawer(navList);
            }
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id)
    {
        loadSelection(position);

        drawerLayout.closeDrawer(navList);
    }
}
