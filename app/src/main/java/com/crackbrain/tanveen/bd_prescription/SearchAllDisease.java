package com.crackbrain.tanveen.bd_prescription;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class SearchAllDisease extends Fragment  {

    ListView listView;
    EditText  searchDisease;
    ArrayAdapter<String> diseaseString;





    public SearchAllDisease() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        /*ListAdapter listAdapter;
        Resources res = getResources();
        String [] DiseaseList = getResources().getStringArray(R.array.All_disease_list);
        */





    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_search_all_disease, container, false);

        listView = (ListView)view.findViewById(R.id.allDiseaseListView);
        searchDisease = (EditText)view.findViewById(R.id.etSearch);
        String[] disease = {

                //start with A
                "Acute Miocardial Infarction(AMI)","allergic rhinitis","acute appendicitis",

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

         diseaseString = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_activated_1,disease);

        listView.setAdapter(diseaseString);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view1, int position,
                                    long id) {


                /*String text = listView.get(position).tostring().trim();
                TextView textView = (TextView) view1.findViewById(R.id.list_content);
                String text = textView.getText().toString();*/


                // String[] diseaseDetails = getResources().getStringArray(R.array.diseaseDetails);

               // System.out.println(view1+" --postion");

                String str=listView.getItemAtPosition(position).toString();
                Toast.makeText(getActivity()," "+str,Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), Details.class);
                i.putExtra("position",""+str);
                startActivity(i);



            }
        });

        searchDisease.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                SearchAllDisease.this.diseaseString.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub


            }
        });

        return view;
    }




    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }


}
