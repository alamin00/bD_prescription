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
public class Surgery extends Fragment {

    List<String> diseaseList;
    HashMap<String, List<String>> diseaseCategory;
    ExpandableListView expandableListView;
    Surgery_DiseaseAdapter diseaseAdapter;



    public Surgery() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_surgery, container, false);


        expandableListView=(ExpandableListView)view.findViewById(R.id.expandableListView);

        diseaseCategory = Surgery_dataProvider.getInfo();

        diseaseList = new ArrayList<String>(diseaseCategory.keySet());
        diseaseAdapter = new Surgery_DiseaseAdapter(getContext(),diseaseCategory,diseaseList);

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

               // String str=expandableListView.getItemAtPosition(++childPosition).toString();
               //String str=expandableListView.getItemAtPosition(groupPosition+childPosition+1).toString();
                String str= expandableListView.getExpandableListAdapter().getChild(groupPosition, childPosition).toString();
                Toast.makeText(getActivity()," "+str,Toast.LENGTH_LONG).show();
                Intent i = new Intent(getActivity(), Details.class);
                i.putExtra("position",""+str);
                startActivity(i);
                Toast.makeText(getContext(),diseaseCategory.get(diseaseList.get(groupPosition)).get(childPosition)+" : disease category "+ diseaseList.get(groupPosition)+ " is selected",
                        Toast.LENGTH_LONG).show();

                return false;
            }
        });

        return view;




    }


}
