package com.crackbrain.tanveen.bd_prescription;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Details extends Activity {

TextView tvDiseaseRX,tvInvestigation,tvAdvice,tvNote;


   //Typeface font = Typeface.createFromAsset(getAssets(), "SolaimanLipi_20-04-07.ttf");


    String[] disease = {

            //start with A
            "Acute Miocardial Infarction(AMI)","Allergic Rhinitis","Acute Appendicitis",

            //start with D
            "Depressive Illness",

            //start with E
            "Eye Itching",

            //Start with F
            "Febrile Convulsion","Migrane",

            //Start with N
            "Nephritic Syndrome",

            //Start with P
            "Pregnancy Followup","Pv Bleeding With Pregnancy",

            //Start with  S

            "Scabies",

            //Start with  V
            "Viral Hepatitis"




    };
    int pppp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();

        /*tvDiseaseRX.setTypeface(font); // for Solaiman Lipi
        tvInvestigation.setTypeface(font);
        tvAdvice.setTypeface(font);
        tvNote.setTypeface(font);
*/
        String itemname = i.getExtras().getString("position");
        int iterator=0;

        for(String s:disease){


            if(itemname.equals(s)){
               // pppp = iterator;
               break;

            }
            iterator++;
        }

       // int a = Integer.parseInt(positionString);
/*
       int a=0;
        int p=0;

*/



        switch (iterator) {
            case 0:
                setContentView(R.layout.acute_miocardial_infarction);

              //  Toast.makeText(this,"R.layout.acute_miocardial_infarction" +itemname + "  "+disease[iterator] ,Toast.LENGTH_LONG).show();

                break;

            case 1:
                setContentView(R.layout.allergic_rhinitis);

              //  Toast.makeText(this,"R.layout.allergic_rhinitis" +itemname + "  "+disease[iterator] ,Toast.LENGTH_LONG).show();

                break;

            case 2:
                setContentView(R.layout.acute_appendicitis);

                //Toast.makeText(this,"R.layout.acute_appendicitis" +itemname + "  "+disease[iterator] ,Toast.LENGTH_LONG).show();

                break;
            case 3:
               setContentView(R.layout.depressive_illness);

               //  Toast.makeText(this,"R.layout.depressive_illness" +itemname + "  "+disease[iterator] ,Toast.LENGTH_LONG).show();

                break;

            case 4:
                setContentView(R.layout.eye_itching); //problem

              //  Toast.makeText(this,"R.layout.eye_itching" +itemname + "  "+disease[iterator] ,Toast.LENGTH_LONG).show();

                break;

            case 5:
                setContentView(R.layout.febrile_convulsion);

               // Toast.makeText(this,"R.layout.febrile_convulsion" +itemname + "  "+disease[iterator] ,Toast.LENGTH_LONG).show();

                break;

            case 6:
                setContentView(R.layout.migrane);

              //  Toast.makeText(this,"R.layout.migrane" +itemname + "  "+disease[iterator] ,Toast.LENGTH_LONG).show();

                break;

            case 7:
                setContentView(R.layout.nephritic_syndrome);

              //  Toast.makeText(this,"R.layout.nephritic_syndrome" +itemname + "  "+disease[iterator] ,Toast.LENGTH_LONG).show();

                break;
            case 8:
                setContentView(R.layout.pregnancy_followup);

               // Toast.makeText(this,"R.layout.pregnancy_followup" +itemname + "  "+disease[iterator] ,Toast.LENGTH_LONG).show();

                break;
            case 9:
                setContentView(R.layout.pv_bleeding_with_pregnancy);

              //  Toast.makeText(this,"R.layout.pv_bleeding_with_pregnancy" +itemname + "  "+disease[iterator] ,Toast.LENGTH_LONG).show();

                break;


            case 10:
                setContentView(R.layout.scabies);

               // Toast.makeText(this,"R.layout.scabies" +itemname + "  "+disease[iterator] ,Toast.LENGTH_LONG).show();

                break;

            case 11:
                setContentView(R.layout.viral_hepatitis);

              //   Toast.makeText(this,"R.layout.viral_hepatities" +itemname + "  "+disease[iterator] ,Toast.LENGTH_LONG).show();

                break;




            /*case 0:
                itemname = itemname.replaceAll(" ", "_").toLowerCase();
                String s = "R.layout."+itemname;
               // View ll = new LinearLayout(this);
                try {

                 //p = Integer.parseInt(s);
                    int resID = this.getResources().getIdentifier(s, "layout", this.getPackageName());

                //setContentView(resID);
                Toast.makeText(this,resID+"  "+pppp+" "+itemname+ "              "+disease[pppp],Toast.LENGTH_LONG).show();
                    initialize();
                }catch (IOError e){
                    Toast.makeText(this,""+p,Toast.LENGTH_LONG).show();
                }
                break;*/

            default:
                setContentView(R.layout.activity_details);
                break;


        }
initialize();
    }

   /* public String replace(String str, int index, char replace){
        if(str==null){
            return str;
        }else if(index<0 || index>=str.length()){
            return str;
        }
        char[] chars = str.toCharArray();
        chars[index] = replace;
        return String.valueOf(chars);
    }*/

   /* private void message(String s1){
        Toast.makeText(this,""+s1,Toast.LENGTH_LONG).show();
    }*/

    View.OnClickListener myClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){

                case  R.id.tv_disease_rx_title:
                    tvDiseaseRX.setVisibility(tvDiseaseRX.isShown() ? View.GONE : View.VISIBLE);
                    break;

                case  R.id.tv_disease_investigation_title:
                    tvInvestigation.setVisibility(tvInvestigation.isShown() ? View.GONE : View.VISIBLE);
                    break;

                case  R.id.tv_disease_advice_title:
                    tvAdvice.setVisibility(tvAdvice.isShown() ? View.GONE : View.VISIBLE);
                    break;

                case  R.id.tv_disease_note_title:
                    tvNote.setVisibility(tvNote.isShown() ? View.GONE : View.VISIBLE);
                    break;


            }
        }
    };

    private void initialize() {


        findViewById(R.id.tv_disease_rx_title).setOnClickListener(myClick);
        findViewById(R.id.tv_disease_investigation_title).setOnClickListener(myClick);
        findViewById(R.id.tv_disease_advice_title).setOnClickListener(myClick);
        findViewById(R.id.tv_disease_note_title).setOnClickListener(myClick);




        tvDiseaseRX = (TextView) findViewById(R.id.tv_disease_rx);
        tvDiseaseRX.setVisibility(View.GONE);

        tvInvestigation = (TextView)findViewById(R.id.tv_disease_investigation_details);
        tvInvestigation.setVisibility(View.GONE);

        tvAdvice = (TextView)findViewById(R.id.tv_disease_advice_details);
        tvAdvice.setVisibility(View.GONE);

        tvNote = (TextView)findViewById(R.id.tv_disease_note_details);
        tvNote.setVisibility(View.GONE);
    }


        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gynecology_, menu);
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


