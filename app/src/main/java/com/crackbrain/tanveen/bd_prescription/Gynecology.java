package com.crackbrain.tanveen.bd_prescription;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Gynecology extends Fragment {


    List<String> diseaseList;
    HashMap<String, List<String>> diseaseCategory;
    ExpandableListView expandableListView;
    Gynecology_DiseaseAdapter diseaseAdapter;



    public Gynecology() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gynecology, container, false);

        expandableListView=(ExpandableListView)view.findViewById(R.id.expandableListView);

        diseaseCategory = Gynecology_dataProvider.getInfo();

        diseaseList = new ArrayList<String>(diseaseCategory.keySet());
        diseaseAdapter = new Gynecology_DiseaseAdapter(getContext(),diseaseCategory,diseaseList);

        expandableListView.setAdapter(diseaseAdapter);


        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition)
            {

                Toast.makeText(getContext(), diseaseList.get(groupPosition) + " is Expended", Toast.LENGTH_LONG).show();
            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
            @Override
            public void onGroupCollapse(int groupPosition)
            {
                Toast.makeText(getContext(),diseaseList.get(groupPosition)+" is collapsed",Toast.LENGTH_LONG).show();

            }
        });


        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {


                //String str=expandableListView.getItemAtPosition(groupPosition+childPosition+1).toString();
                String str= expandableListView.getExpandableListAdapter().getChild(groupPosition, childPosition).toString();
                Toast.makeText(getActivity()," "+str,Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), Details.class);
                i.putExtra("position",""+str);
                startActivity(i);

               /* if( diseaseCategory.get(diseaseList.get(groupPosition)).get(childPosition) =="Pregnancy Followup")
                {
                    Intent i = new Intent(getActivity(), Gynecology_check_activity.class);
                    startActivity(i);
                }*/

              //  Pv Bleeding With Pregnancy

                /*Toast.makeText(getContext(),diseaseCategory.get(diseaseList.get(groupPosition)).get(childPosition)+" : disease category "+ diseaseList.get(groupPosition)+ " is selected",
                        Toast.LENGTH_LONG).show();
*/
                return false;
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onDetach()
    {
        super.onDetach();
    }



}
